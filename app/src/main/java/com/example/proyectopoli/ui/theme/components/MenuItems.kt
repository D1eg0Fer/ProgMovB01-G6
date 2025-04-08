package com.example.proyectopoli.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.proyectopoli.model.MenuItem
import androidx.compose.ui.graphics.Color

@Composable
fun DrawerItem(
    item: MenuItem,
    selected: Boolean,
    onItemClick: (MenuItem) -> Unit
) {
    val backgroundColor = if (selected) {
        Color(0xFFFFC0CB) // Rosado claro
    } else {
        Color.Transparent
    }

    val contentColor = if (selected) {
        Color(0xFFFFEB3B) // Amarillo
    } else {
        Color.White
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .clickable { onItemClick(item) }
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = item.title,
            tint = contentColor
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = item.title,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
            color = contentColor
        )
    }
}