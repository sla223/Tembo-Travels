package com.example.tembotravels.ui.theme.screens.detail


import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tembotravels.navigation.ROUT_PROPERTY
import com.example.tembotravels.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){
    Column( modifier = Modifier.fillMaxSize()){


        TopAppBar(
            title = { Text(text = "PropertyPlus", fontFamily = FontFamily.Cursive)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Gray),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu", tint = Color.Black)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "notifications", tint = Color.Black)
                    
                }
            }

        )
        Spacer(modifier = Modifier.width(20.dp))

        //search bar
        var search by remember {
            mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search=it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search,
                contentDescription = "Search")},
            placeholder = { Text(text = "Whats Your location")}
        )
        //end of search bar


        Box(modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
            contentAlignment = Alignment.Center){

            Image(painter = painterResource(id = R.drawable.travel),
                contentDescription ="home",
                modifier = Modifier.fillMaxWidth()
                )
            Text(
                text = "Choose your best travelling patner",
                fontSize = 40.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center

                )
        }


        Spacer(modifier = Modifier.width(20.dp))



        Spacer(modifier = Modifier.width(20.dp))

        Row(
            modifier = Modifier
                .padding(start = 20.dp,)
                .horizontalScroll(rememberScrollState())
        ) {
            //CARD ONE

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.basisibasi),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //CARD END
            Spacer(modifier = Modifier.width(20.dp))

            //CARD TWO

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.basisibasi),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //CARD END TWO
            Spacer(modifier = Modifier.width(20.dp))

            //CARD THREE

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.basisibasi),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //CARD END THREE
            Spacer(modifier = Modifier.width(20.dp))

            //CARD FOUR

            Card(modifier = Modifier
                .height(180.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.basisibasi),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //CARD END FOUR



        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate(ROUT_PROPERTY) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp)

        )

        {
            Text(text = "next")
        }





    }


}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}