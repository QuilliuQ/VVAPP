package com.sylas.vvapp.presentation.test

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.sylas.vvapp.R


@Composable
fun BadgedBox(
    contentModifier: Modifier = Modifier,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.error,
    contentColor: Color = contentColorFor(backgroundColor),
    badgeContent: @Composable (RowScope.() -> Unit)? = null,
    content: @Composable BoxScope.() -> Unit,
) {
    Layout(content = { Box(
        modifier = contentModifier.layoutId("anchor"),
        contentAlignment = Alignment.Center,
        content = content
    )
        Badged(
            modifier.layoutId("badge"),
            content = badgeContent
        ) }, modifier = modifier)
    { measurables, constraints ->
        val badgePlaceable = measurables.first { it.layoutId == "badge" }.measure(
            // Measure with loose constraints for height as we don't want the text to take up more
            // space than it needs.
            constraints.copy(minHeight = 0)
        )

        val anchorPlaceable = measurables.first { it.layoutId == "anchor" }.measure(constraints)

        val firstBaseline = anchorPlaceable[FirstBaseline]
        val lastBaseline = anchorPlaceable[LastBaseline]
        val totalWidth = anchorPlaceable.width
        val totalHeight = anchorPlaceable.height
        layout(
            totalWidth,
            totalHeight,
            // Provide custom baselines based only on the anchor content to avoid default baseline
            // calculations from including by any badge content.
            mapOf(
                FirstBaseline to firstBaseline,
                LastBaseline to lastBaseline
            )){
            anchorPlaceable.placeRelative(0, 0)
            val badgeX = anchorPlaceable.width / 4
            val badgeY = -badgePlaceable.height /2
            badgePlaceable.placeRelative(badgeX, badgeY)
            }

    }

}

@Composable
fun Badged(
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.error,
    contentColor: Color = contentColorFor(backgroundColor),
    content: @Composable (RowScope.() -> Unit)? = null,
) {
    val shape = RoundedCornerShape(10.dp)


        Row(modifier = modifier
            .defaultMinSize(minHeight = 20.dp, minWidth = 20.dp)
            .clip(shape = shape)
            .background(Color("#FDC701".toColorInt()))
            .border(BorderStroke(2.dp, Color("#38364D".toColorInt())), shape = shape),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            content = {
                content?.let { it() }
            }
        )

}


@Preview(showBackground = true)
@Composable
fun badgeprev(){
    Badged(){
        Text(
            text = "1",
            color = Color("#38364D".toColorInt()),
            fontSize = 10.sp,
            fontWeight = FontWeight(700)
        )
    }
}


@Preview()
@Composable
fun preview() {
    BadgedBox(
        badgeContent = {Text(
            text = "1",
            color = Color("#38364D".toColorInt()),
            fontSize = 10.sp,
            fontWeight = FontWeight(700)
        )}
    ) {
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_notifications),
            contentDescription = null
        )
    }
}