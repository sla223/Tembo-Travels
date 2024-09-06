package com.example.tembotravels.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tembotravels.ui.theme.screens.about.AboutScreen
import com.example.tembotravels.ui.theme.screens.accomodation.AccommodationScreen
import com.example.tembotravels.ui.theme.screens.dashboard.DashboardScreen
import com.example.tembotravels.ui.theme.screens.detail.DetailsScreen
import com.example.tembotravels.ui.theme.screens.home.HomeScreen
import com.example.tembotravels.ui.theme.screens.login.LoginScreen
import com.example.tembotravels.ui.theme.screens.signup.SignupScreen
import com.example.tembotravels.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }


        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)
        }


        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }


        composable(ROUT_ACCOMMODATION) {
            AccommodationScreen(navController = navController)
        }




    }
}