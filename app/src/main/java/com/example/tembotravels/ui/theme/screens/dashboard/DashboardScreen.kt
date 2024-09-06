package com.example.tembotravels.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tembotravels.navigation.ADD_PRODUCTS_URL
import com.example.tembotravels.navigation.ROUT_HOME
import com.example.tembotravels.navigation.ROUT_PROPERTY
import com.example.tembotravels.navigation.VIEW_PRODUCTS_URL
import com.example.tembotravels.R
import com.example.tembotravels.navigation.ROUT_ABOUT
import com.example.tembotravels.navigation.ROUT_ACCOMMODATION
import com.example.tembotravels.navigation.ROUT_DETAIL

@Composable
fun DashboardScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter = painterResource(id = R.drawable.bus),
            contentDescription = "home",
            modifier = Modifier
                .size(100.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Make your travels more easy",
            fontSize = 18.sp,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){

            //Main Card
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(Color.LightGray)
            ){
                //Row 1
                Row (modifier = Modifier.padding(20.dp)){
                    //card 1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_HOME) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.home),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.ExtraBold
                                )
                        }

                    }
                    //End of card1
                    Spacer(modifier = Modifier.width(20.dp))

                    //card 1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_ABOUT) }
                        .width(160.dp)
                        .height(180.dp)){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.about),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="About",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }

                    }
                    //End of card1

                }
                //end of row1

                //Row 1
                Row (modifier = Modifier.padding(20.dp)){
                    //card 1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_DETAIL) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.detail),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="Detail",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }

                    }
                    //End of card1
                    Spacer(modifier = Modifier.width(20.dp))

                    //card 1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.accommodation1),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="Accomodation",
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }

                    }
                    //End of card1

                }
                //end of row1

                //Row 1
                Row (modifier = Modifier.padding(20.dp)){
                    //card 1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { VIEW_PRODUCTS_URL}){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.book),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="Booking",
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card1
                    Spacer(modifier = Modifier.width(20.dp))

                    //card 1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_ACCOMMODATION) }
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { VIEW_PRODUCTS_URL }){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.payment),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="Payments",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card1

                }
                //end of row1

                //Row 1
                Row (modifier = Modifier.padding(20.dp)){
                    //card 1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { VIEW_PRODUCTS_URL}){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.book),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="Booking",
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card1
                    Spacer(modifier = Modifier.width(20.dp))

                    //card 1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { VIEW_PRODUCTS_URL }){

                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.payment),
                                    contentDescription ="",
                                    modifier = Modifier.size(70.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="Payments",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card1

                }




            }
            //End of main card

        }




    }

}

@Composable
@Preview(showBackground = true)
fun DashboardPreview(){
    DashboardScreen(rememberNavController())
}