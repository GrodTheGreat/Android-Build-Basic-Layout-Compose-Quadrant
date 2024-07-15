package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Quadrants()
            }
        }
    }
}

@Composable
fun Quadrants() {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier.weight(1f)
        ) {
            ComposeCard(
                titleText = stringResource(R.string.text_composable_title),
                contentText = stringResource(R.string.text_composable_content),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposeCard(
                titleText = stringResource(R.string.image_composable_title),
                contentText = stringResource(R.string.image_composable_content),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            Modifier.weight(1f)
        ) {
            ComposeCard(
                titleText = stringResource(R.string.row_composable_title),
                contentText = stringResource(R.string.row_composable_content),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposeCard(
                titleText = stringResource(R.string.column_composable_title),
                contentText = stringResource(R.string.column_composable_content),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposeCard(
    titleText: String,
    contentText: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(color = color)
            .padding(all = 16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = titleText,
            fontWeight = FontWeight.Bold,
//            modifier = modifier.padding(bottom = 16.dp) // THIS DOESN'T WORK????????
            modifier = Modifier.padding(bottom = 16.dp) // THIS WORKS???????!!!

        )
        Text(
            text = contentText,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    Quadrants()
}
