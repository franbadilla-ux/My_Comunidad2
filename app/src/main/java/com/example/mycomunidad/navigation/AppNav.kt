package com.example.mycomunidad.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycomunidad.ui.theme.HomeScreen

@Composable
fun AppNav(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login"){
        composable("login"){
            HomeScreen(navController = navController)
        }//fin composable


    }//fin NavHost
}//fin AppNav