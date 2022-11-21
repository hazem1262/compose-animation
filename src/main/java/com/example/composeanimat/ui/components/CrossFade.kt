package com.example.composeanimat.ui.components

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CrossFadeExample() {
    var currentPage by remember { mutableStateOf("A") }
    Column {
        Button(onClick = { currentPage = if (currentPage == "A") "B" else "A" }) {
            Text("A/B")
        }
        Spacer(modifier = Modifier.height(32.dp))
        Crossfade(targetState = currentPage) { screen ->
            when (screen) {
                "A" -> Text("Page A")
                "B" -> Text("Page B")
            }
        }
    }
}