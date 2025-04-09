package com.example.proyectopoli.screens.fragments.content

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

// Modelo de datos para representar el Video
data class Video(
    val id: Int,
    val title: String,
    val videoUrl: String
)

@Composable
fun VideosFragment() {
    // Ejemplos de videos.
    val videoList = listOf(
        Video(1, "Video 1", "https://www.example.com/video1"),
        Video(2, "Video 2", "https://www.example.com/video2"),
        Video(3, "Video 3", "https://www.example.com/video3"),
        // Agregar videos
    )

    // Pantalla principal de videos
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(videoList) { video ->
                VideoItem(video = video)
            }
        }
    }
}

@Composable
fun VideoItem(video: Video) {
    // Estilo para cada item de video
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = video.title,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White,
                modifier = Modifier.weight(1f)
            )
            // Puedes agregar más detalles o un ícono para reproducir el video aquí
        }
    }
}
