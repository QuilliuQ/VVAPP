package com.sylas.vvapp.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.sylas.vvapp.domain.model.TextParametrs

@Composable
fun TextElement(args:TextParametrs){
    Text(
        text = args.text,
        fontSize =args.fontSize,
        fontFamily =args.fontFamily,
        fontStyle =args.fontStyle,
        fontWeight = args.fontWeight,
        textAlign = args.textAlign,
        lineHeight = args.lineHeight,
        overflow = args.overflow,
        softWrap = args.softWrap,
        maxLines = args.maxLines,
        onTextLayout = args.onTextLayout,
        modifier = args.modifier.clickable { args.onClick }
    )
}