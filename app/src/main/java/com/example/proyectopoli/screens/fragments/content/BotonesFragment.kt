package com.example.proyectopoli.screens.fragments.content

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.proyectopoli.R

@Composable
fun BotonesFragment() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Se ha seleccionado la opción Botones",
                color = Color.White,
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_perder_peso),
                    contentDescription = "Perder Peso"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Perder Peso")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_ganar_musculo),
                    contentDescription = "Ganar Musculo"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Ganar Musculo")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_principiante),
                    contentDescription = "Principiante"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Principiante")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_intermedio),
                    contentDescription = "Intermedio"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Intermedio")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_avanzado),
                    contentDescription = "Avanzado"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Avanzado")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Cyan,
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_peso),
                    contentDescription = "Peso"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Peso")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_altura),
                    contentDescription = "Altura"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Altura")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* Acción del botón */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_imc),
                    contentDescription = "IMC"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("IMC")
            }
        }
    }
}
