package com.example.composeanimat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeanimat.ui.components.*
import com.example.composeanimat.ui.theme.ComposeAnimatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAnimatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    VisibilityWithoutAnimation()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun VisibilityWithoutAnimationPreview() {
    ComposeAnimatTheme {
        VisibilityWithoutAnimation()
    }
}

@Preview(showBackground = true)
@Composable
fun VisibilityWithAnimationPreview() {
    ComposeAnimatTheme {
        VisibilityWithAnimation()
    }
}

@Preview(showBackground = true)
@Composable
fun AnimateAsStateWithoutAnimationPreview() {
    ComposeAnimatTheme {
        AnimateAsStateWithoutAnimation()
    }
}

@Preview(showBackground = true)
@Composable
fun AnimateAsStateWithAnimationPreview() {
    ComposeAnimatTheme {
        AnimateAsStateWithAnimation()
    }
}

@Preview(showBackground = true)
@Composable
fun AnimateContentAnimationPreview() {
    ComposeAnimatTheme {
        AnimatedContentExample()
    }
}

@Preview(showBackground = true)
@Composable
fun CrossFadeExamplePreview() {
    ComposeAnimatTheme {
        CrossFadeExample()
    }
}

@Preview(showBackground = true)
@Composable
fun UpdateTransitionExamplePreview() {
    ComposeAnimatTheme {
        UpdateTransitionExample()
    }
}

@Preview(showBackground = true)
@Composable
fun InFiniteExamplePreview() {
    ComposeAnimatTheme {
        InFiniteExample()
    }
}