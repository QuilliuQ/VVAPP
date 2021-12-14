package com.sylas.vvapp.domain.model


import androidx.compose.material.LocalTextStyle
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

data class TextParametrs(
    val text: String,
    val fontSize: TextUnit = TextUnit.Unspecified,
    val fontFamily: FontFamily?=null,
    val fontStyle: FontStyle? =null,
    val fontWeight: FontWeight?=null,
    val modifier: Modifier = Modifier,
    val color: Color = Color.Unspecified,
    val letterSpacing: TextUnit = TextUnit.Unspecified,
    val textDecoration: TextDecoration? = null,
    val textAlign: TextAlign? = null,
    val lineHeight: TextUnit = TextUnit.Unspecified,
    val overflow: TextOverflow = TextOverflow.Clip,
    val softWrap: Boolean = true,
    val maxLines: Int = Int.MAX_VALUE,
    val onTextLayout: (TextLayoutResult) -> Unit = {},
    val onClick: ()-> Unit
): Parametrs()

