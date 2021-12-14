package com.sylas.vvapp.presentation.test

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.sylas.vvapp.R

@Composable
fun AppBarVV(modifier: Modifier = Modifier){
   Row(
       modifier.padding(start = 16.dp, top = 12.dp, end = 20.dp, bottom = 12.dp),
       verticalAlignment = Alignment.CenterVertically
   ) {
       Column {
           Text(
               text = "Карта № 3434934",
               color = Color.White,
               fontSize = 20.sp,
               fontWeight = FontWeight(700)
           )
           Text(
               text = "Андрей Кривенко",
               color = Color("#D8D8D8".toColorInt()),
               fontSize = 12.sp,
               fontWeight = FontWeight(500)
           )
       }
       Spacer(modifier = Modifier.weight(1f))
       Image(modifier = Modifier.padding(end = 15.dp), imageVector = ImageVector.vectorResource(id = R.drawable.ic_settings), contentDescription = null)
       BadgedBox(
               badgeContent = {
                   Text(
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
}


@Preview
@Composable
fun AppB(){
    AppBarVV()
}