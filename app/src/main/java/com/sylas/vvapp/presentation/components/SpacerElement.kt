package com.sylas.vvapp.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import com.sylas.vvapp.domain.model.SpacerParametrs

@Composable
fun SpacerElement(args: SpacerParametrs) {
    Spacer(modifier = args.modifier )
}