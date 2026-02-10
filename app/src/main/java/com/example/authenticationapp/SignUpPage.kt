package com.example.authenticationapp

import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun SignUpPage(){
    var EtEmail by remember { mutableStateOf("") }
    var EtPassword by remember { mutableStateOf("") }
    var EtConfirmPassword by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(R.drawable.register),
            contentDescription = "login Image",)
        Spacer(modifier =Modifier.height(8.dp))
        TextField(value = EtEmail, onValueChange = {EtEmail = it},
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),

            label = {
                Text(text = "Enter your Email",)
            }, colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White))

        Spacer(modifier =Modifier.height(4.dp))

        TextField(value = EtPassword, onValueChange = {EtPassword = it},
            Modifier.fillMaxWidth().padding(10.dp),
            label = {
                Text(text = "Enter your Password")
            }, colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White))

        Spacer(modifier =Modifier.height(4.dp))
        TextField(value = EtConfirmPassword, onValueChange = {EtConfirmPassword = it},
            Modifier.fillMaxWidth().padding(10.dp),
            label = {
                Text(text = "Re-Enter your Password")
            }, colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White))

        Spacer(modifier =Modifier.height(8.dp))
        Button(onClick = {},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        )
        {
            Text(text="SignUp",
                fontSize = 16.sp)
        }
    }

}