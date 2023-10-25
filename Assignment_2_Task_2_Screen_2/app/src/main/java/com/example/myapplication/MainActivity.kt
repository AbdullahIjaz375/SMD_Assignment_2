package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

val dataList = listOf(
    Data("12 AM", R.drawable.moon_cloud_mid_rain, "30%", "19°"),
    Data("1 AM", R.drawable.moon_cloud_mid_rain, "35%", "20°"),
    Data("2 AM", R.drawable.moon_cloud_mid_rain, "40%", "21°"),
    Data("3 AM", R.drawable.moon_cloud_mid_rain, "45%", "22°"),
    Data("4 AM", R.drawable.moon_cloud_mid_rain, "50%", "23°"),
)


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "Montreal", color = Color.White, fontSize = 40.sp, modifier = Modifier
                .align(
                    Alignment.TopCenter
                )
                .offset(y = 50.dp)
        )
        Text(
            text = "19° | Mostly Clear",
            color = Color.Gray,
            fontSize = 20.sp,
            modifier = Modifier
                .align(
                    Alignment.TopCenter
                )
                .offset(y = 95.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.modal2),
            contentDescription = "Modal",
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
                .offset(y = 100.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.home_indicator),
            contentDescription = "Home Indicator",
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
                .offset(y = -250.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.widgets),
            contentDescription = "Widget",
            modifier = Modifier
                .fillMaxSize()
                .align(
                    Alignment.Center
                )
                .padding(20.dp)
                .offset(y = 20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.widgets_small),
            contentDescription = "Smaller Widgets",
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter)
                .padding(20.dp)
                .offset(y = 270.dp)
        )
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = -150.dp)
        ) {
            items(dataList) { data ->
                ImageWithTextOverlay(data)
            }
        }
    }
}

@Composable
fun ImageWithTextOverlay(data: Data) {
    Box(modifier = Modifier.padding(20.dp)) {
        Image(
            painter = painterResource(id = R.drawable.component),
            contentDescription = "Component",
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxSize()
                .scale(2.5f) // Adjust the scale factor as needed
        )
        Column {
            Text(
                data.time,
                color = Color.White,
                fontSize = 15.sp,
                modifier = Modifier
                    .offset(x = -7.dp)
                    .offset(y = 350.dp)
            )
            Image(
                painter = painterResource(id = data.image),
                contentDescription = "Moon Cloud Image",
                modifier = Modifier
                    .fillMaxSize(0.5f)
                    .offset(y = 175.dp)
                    .offset(x = 7.dp)
                    .scale(2.5f)
            )
            Text(
                text = data.percentage,
                color = Color.Cyan,
                fontSize = 12.sp,
                modifier = Modifier
                    .offset(y = -10.dp)
                    .offset(x = 3.dp)
            )
            Text(
                text = data.temperature,
                color = Color.White,
                fontSize = 15.sp,
                modifier = Modifier
                    .offset(y = 1.dp)
                    .offset(x = 4.dp)
            )

        }
    }
}

data class Data(
    val time: String,
    val image: Int,
    val percentage: String,
    val temperature: String
)

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}