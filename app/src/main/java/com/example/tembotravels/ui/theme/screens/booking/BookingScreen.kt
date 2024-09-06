package com.example.tembotravels.ui.theme.screens.booking

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun BookingScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize().background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "For booking use the options below to contact us",
            fontSize = 33.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.White
            )

        Spacer(modifier = Modifier.height(30.dp))



        //STK
        val mContext= LocalContext.current
        Button(onClick ={
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(10.dp)

        )

        {
            Text(text = "Pay via M-pesa")
        }
        //STK



    }


}

@Composable
@Preview(showBackground = true)
fun BookingScreenPreview(){
    BookingScreen(rememberNavController())
}
