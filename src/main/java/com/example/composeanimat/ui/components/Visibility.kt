package com.example.composeanimat.ui.components

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composeanimat.R

@Composable
fun AnimateAsStateWithoutAnimation() {
    var height by remember {
        mutableStateOf(200)
    }
    Column {
        Button(onClick = {
            height = if (height > 0) 0 else 200
        }) {
            Text(text = "Show/Hide")
        }
        Image(
            modifier = Modifier.height(height.dp),
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = ""
        )
    }
}

@Composable
fun AnimateAsStateWithAnimation() {
    var enableAnimate by remember {
        mutableStateOf(false)
    }
    val height by animateIntAsState(if (enableAnimate) 0 else 200)
    Column {
        Button(onClick = {
            enableAnimate = !enableAnimate
        }) {
            Text(text = "Show/Hide")
        }
        Image(
            modifier = Modifier.height(height.dp),
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = ""
        )
    }
}