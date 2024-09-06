package com.example.tembotravels.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.tembotravels.navigation.ROUT_DETAIL
import com.example.tembotravels.R
import com.example.tembotravels.navigation.ADD_PRODUCTS_URL
import com.example.tembotravels.navigation.VIEW_PRODUCTS_URL


@Composable
fun HomeScreen(navController: NavController){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {


        Image(
            painter = painterResource(id = R.drawable.travel),
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale =ContentScale.Crop
        )


        Text(
            text = "TemboTravels",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black
        )

        Text(
            text = "Your better choice",
            fontSize = 20.sp
        )


        Button(onClick = { navController.navigate(ROUT_DETAIL) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(10.dp)

        )

        {
            Text(text = "Get started?")
        }
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { navController.navigate(ADD_PRODUCTS_URL) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(10.dp)

        )

        {
            Text(text = "add products")
        }
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { navController.navigate(VIEW_PRODUCTS_URL) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(10.dp)

        )

        {
            Text(text = "View products")
        }





    }





}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

