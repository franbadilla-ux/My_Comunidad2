package com.example.mycomunidad.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mycomunidad.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun ProductoFormScreen(
    navController: NavController,
    nombre : String,
    numero : String
){// Inicio Formulario
    var cantidad by remember { mutableStateOf(TextFieldValue("")) }
    var direccion by remember { mutableStateOf(TextFieldValue("")) }

    var jugadorToxico by remember { mutableStateOf(false) }

    Scaffold(
        bottomBar = {
            BottomAppBar {
                TopAppBar(title = { Text("Ejemplo") })
            }//fin
        }// fin bottom

    )//fin Scaffold
    {//Inicio inner
        innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        )/*Fin columna*/{ // inicio contenido
            Image(
                painter = painterResource(id = R.drawable.meme),
                contentDescription = "Imagen de inicio",
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )// fin image
            Spacer(Modifier.height(16.dp))
            Text(text = nombre, style = MaterialTheme.typography.headlineSmall)
            Text(text = "Cantidad puntos: $numero", style = MaterialTheme.typography.bodyLarge)

            Spacer(Modifier.height(16.dp))

            OutlinedTextField(
                value = cantidad,
                onValueChange = {cantidad = it},
                label = {Text("Cantidad")},
                modifier = Modifier.fillMaxWidth()

            )//Fin OutlinedTextfile

        }//fin inicio contenido

    }//fin inicio Inner



}//Fin Formulario

@Preview(showBackground = true)
@Composable
fun PreviewProductoFormScreen(){
    ProductoFormScreen(
        navController = rememberNavController(),
        nombre = "Pyro 1",
        numero = "10.000"
    )
}