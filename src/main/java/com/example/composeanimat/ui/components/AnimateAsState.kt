package com.example.composeanimat.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import com.example.composeanimat.R

@Composable
fun VisibilityWithoutAnimation() {
    var visible by remember {
        mutableStateOf(true)
    }
    Column {
        Button(onClick = {
            visible = !visible
        }) {
            Text(text = "Show/Hide")
        }
        if (visible) Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = ""
        )
    }
}

@Composable
fun VisibilityWithAnimation() {
    var visible by remember {
        mutableStateOf(true)
    }
    Column {
        Button(onClick = {
            visible = !visible
        }) {
            Text(text = "Show/Hide")
        }
        AnimatedVisibility(visible = visible) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = ""
            )
        }
    }
}