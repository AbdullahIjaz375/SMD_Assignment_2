package com.example.myapplication

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row(modifier= Modifier
        .fillMaxSize()
        ) {
        Column (modifier = Modifier.weight(1f)){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier= Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                )
            {
                Text(
                    text = "Text composable",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(text = "Displays text and follows the recommended Material Design guidelines.")
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            ){
                Text(
                    text = "Row composable",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "A layout composable that places its children in a horizontal sequence.")
            }
        }
        Column (modifier = Modifier.weight(1f)){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier= Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            ){
                Text(
                    text = "Image composable",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "Creates a composable that lays out and draws a given Painter class object.")

            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            ){
                Text(
                    text = "Column composable",
                    textAlign = TextAlign.Justify,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "A layout composable that places its children in a vertical sequence.")
            }
        }

    }
    
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}