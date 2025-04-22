package com.example.proyectopoli.screens.fragments.content

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WebViewerScreen(url: String, onBack: () -> Unit) {
    // Contenedor con barra superior y contenido
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Navegador Web") },
                navigationIcon = {
                    IconButton(onClick = { onBack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { padding ->
        // WebView embebido dentro del layout Compose
        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    settings.loadsImagesAutomatically = true
                    settings.useWideViewPort = true
                    settings.javaScriptCanOpenWindowsAutomatically = true

                    webViewClient = WebViewClient() // Carga la URL dentro del mismo WebView
                    loadUrl(url) // Carga la URL pasada como parámetro
                }
            },
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        )
    }

    // Permite que el botón físico de volver funcione como “salir del navegador”
    BackHandler {
        onBack()
    }
}
