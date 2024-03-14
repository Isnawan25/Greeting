package com.example.greeting

import android.os.Bundle
import android.text.style.LineHeightSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greeting.ui.theme.GreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingText(pesan = "Happy Graduation Anne!!" , pengirim ="Carl Jhonson" )

                }
            }
        }
    }
}

@Composable
fun GreetingText(pesan: String, pengirim: String, modifier: Modifier= Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)

            ){
        Text(
            text = pesan,
            fontSize = 75.sp,
            textAlign = TextAlign.Center,
            LineHeight = 110.sp

        )
        Text(
            text = pengirim,
            fontSize = 28.sp,
            modifier = Modifier.padding(16.dp).align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingTheme {
        GreetingText(pesan = "Happy Graduation Anne!!",
        pengirim = "Carl Jhonson")
    }
}