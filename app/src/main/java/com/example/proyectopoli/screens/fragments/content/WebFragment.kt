package com.example.proyectopoli.screens.fragments.content

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.proyectopoli.R

@Composable
fun WebFragment() {
    val context = LocalContext.current

    val items = listOf(
        Pair(R.drawable.suplementos, "https://www.mipielsana.com/gym/suplementos/page/5/ "),
        Pair(R.drawable.entrenamientos, "https://www.mipielsana.com/el-mejor-metodo-para-perder-grasa-entre-peso-y-cardio/ "),
        Pair(R.drawable.comidas_recomendadas, "https://www.mipielsana.com/conoce-cuantas-comidas-se-recomiendan-por-dia/ "),
        Pair(R.drawable.bajas_carbohidrato, "https://www.mipielsana.com/conoce-los-alimentos-con-bajo-contenido-de-carbohidratos/ ")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items.forEach { (imageRes, url) ->
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clickable {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(intent)
                    }
            )
        }
    }
}
