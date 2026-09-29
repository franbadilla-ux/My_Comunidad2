package com.example.mycomunidad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.mycomunidad.navigation.AppNav
import com.example.mycomunidad.ui.theme.HomeScreen
import com.example.mycomunidad.ui.theme.MyComunidadTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {

        super.onCreate(savedInstanceState)




        setContent {

            AppNav()


            }

        }

    }

