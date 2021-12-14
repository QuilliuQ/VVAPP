package com.sylas.vvapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.graphics.toColorInt
import com.sylas.vvapp.presentation.test.AppBarVV
import com.sylas.vvapp.presentation.test.BottomNav
import com.sylas.vvapp.presentation.test.Stories
import com.sylas.vvapp.ui.theme.VVAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VVAPPTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color("#38364D".toColorInt())) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Box(Modifier.background(Color("#38364D".toColorInt()))){
        Column(modifier = Modifier.align(Alignment.TopCenter)) {
            AppBarVV()
        Column(Modifier.verticalScroll(rememberScrollState())) {
            Stories()
            MainScreenContent()
        }
        }

        BottomNav(modifier = Modifier.align(Alignment.BottomCenter))

}
}

@Preview(showBackground = true, device = "pixel")
@Composable
fun DefaultPreview() {
    VVAPPTheme {
        Screen()
    }
}