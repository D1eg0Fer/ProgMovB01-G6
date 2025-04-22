package com.example.proyectopoli.screens.fragments.content

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.proyectopoli.R
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.*


@Composable
fun WebFragment() {
    // Estado para controlar si se debe mostrar el navegador web interno
    var selectedUrl by remember { mutableStateOf<String?>(null) }
    val context = LocalContext.current

    // Lista de imágenes con título y URL asociada
    val items = listOf(
        Triple(R.drawable.suplementos, "Suplementos", "https://www.mipielsana.com/gym/suplementos/page/5/"),
        Triple(R.drawable.entrenamientos, "Entrenamientos", "https://www.mipielsana.com/el-mejor-metodo-para-perder-grasa-entre-peso-y-cardio/"),
        Triple(R.drawable.comidas_recomendadas, "Comidas recomendadas", "https://www.mipielsana.com/conoce-cuantas-comidas-se-recomiendan-por-dia/"),
        Triple(R.drawable.bajas_carbohidrato, "Bajas en carbohidrato", "https://www.mipielsana.com/conoce-los-alimentos-con-bajo-contenido-de-carbohidratos/")
    )

    // Si hay una URL seleccionada, mostrar el WebView con esa URL
    if (selectedUrl != null) {
        WebViewerScreen(url = selectedUrl!!) {
            selectedUrl = null // Al volver, se limpia el estado y se regresa al listado
        }
    } else {
        // Pantalla con scroll vertical que muestra cada tarjeta
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items.forEach { (imageRes, title, url) ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { selectedUrl = url }, // Al hacer clic se abre la URL
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Image(
                            painter = painterResource(id = imageRes),
                            contentDescription = title,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleMedium,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}
