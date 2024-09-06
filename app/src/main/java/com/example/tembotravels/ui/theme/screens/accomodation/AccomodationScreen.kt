package com.example.tembotravels.ui.theme.screens.accomodation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tembotravels.R


@Composable
fun AccommodationScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
        ,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Spacer(modifier = Modifier.height(280.dp))

        Image(
            painter = painterResource(id = R.drawable.accommodation),
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )



        Text(
            text = "TemboTravels",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,


        )


        Text(
            text = "Accommodations coming soon....",
            fontSize = 20.sp
        )










    }


}

@Composable
@Preview(showBackground = true)
fun AccommodationScreenPreview(){
    AccommodationScreen(rememberNavController())
}
