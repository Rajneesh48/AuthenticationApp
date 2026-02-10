package com.example.authenticationapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun WelcomePage(){
    Box(modifier = Modifier.fillMaxSize()
        .background(color = Color.Blue)
        ,contentAlignment = Alignment.Center){
        Text(text = "Welcome",
            color = Color.White,
            fontSize = 110.sp,
            fontFamily = FontFamily(Font(R.font.stylescript))
        )

    }
}