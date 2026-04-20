package com.example.authenticationapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun SignUpPage(navController: NavController){
    var etEmail by remember { mutableStateOf("") }
    var etPassword by remember { mutableStateOf("") }
    var etConfirmPassword by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(R.drawable.register),
            contentDescription = "login Image",)
        Spacer(modifier =Modifier.height(8.dp))
        OutlinedTextField(value = etEmail, onValueChange = {etEmail = it},
            modifier = Modifier.fillMaxWidth()
                .padding(4.dp),

            label = {
                Text(text = "Enter your Email")
            }, colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White))


        OutlinedTextField(value = etPassword, onValueChange = {etPassword = it},
            Modifier.fillMaxWidth().padding(4.dp),
            visualTransformation = PasswordVisualTransformation(),
            label = {
                Text(text = "Enter your Password")
            }, colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White))

        OutlinedTextField(value = etConfirmPassword, onValueChange = {etConfirmPassword = it},
            Modifier.fillMaxWidth().padding(4.dp),
            visualTransformation = PasswordVisualTransformation(),
            label = {
                Text(text = "Re-Enter your Password")
            }, colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White))

        Spacer(modifier =Modifier.height(8.dp))
        Button(onClick = {
            navController.navigate("SignInPage")
        },
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