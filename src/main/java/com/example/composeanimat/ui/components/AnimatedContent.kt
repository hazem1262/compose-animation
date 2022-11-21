package com.example.composeanimat.ui.components

import androidx.compose.animation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedContentExample() {
    var count by remember { mutableStateOf(0) }
    Column {
        Row {
            Button(onClick = { count++ }) {
                Text("Add")
            }
            Spacer(modifier = Modifier.width(16.dp))
            AnimatedContent(targetState = count) { targetCount ->
                // Make sure to use `targetCount`, not `count`.
                Text(text = "Count: $targetCount")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        AnimatedContent(
            targetState = count,
            transitionSpec = {
                // Compare the incoming number with the previous number.
                if (targetState > initialState) {
                    // If the target number is larger, it slides up and fades in
                    // while the initial (smaller) number slides up and fades out.
                    slideInVertically { height -> height } + fadeIn() with
                            slideOutVertically { height -> -height } + fadeOut()
                } else {
                    // If the target number is smaller, it slides down and fades in
                    // while the initial number slides down and fades out.
                    slideInVertically { height -> -height } + fadeIn() with
                            slideOutVertically { height -> height } + fadeOut()
                }.using(
                    // Disable clipping since the faded slide-in/out should
                    // be displayed out of bounds.
                    SizeTransform(clip = false)
                )
            }
        ) { targetCount ->
            Text(text = "$targetCount")
        }
    }
}