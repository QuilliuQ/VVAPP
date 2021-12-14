package com.sylas.vvapp.presentation.test

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Stories(){
    LazyRow(contentPadding = PaddingValues(vertical = 15.dp, horizontal = 8.dp)){
        items (10){
            Story()
        }
    }
}


@Preview
@Composable
fun prev1(){
    Stories()
}