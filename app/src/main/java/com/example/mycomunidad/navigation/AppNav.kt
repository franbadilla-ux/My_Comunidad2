package com.example.mycomunidad.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mycomunidad.ui.theme.HomeScreen

@Composable
fun AppNav(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login"){
        composable("login"){
            HomeScreen(navController = navController)
        }//fin composable 1

        composable(
            route = "muestraDatos/{username}",
            arguments = listOf(
                navArgument("username"){
                    type = NavType.StringType
                }
            )
        )//fin composable 2
        {}


    }//fin NavHost
}//fin AppNav