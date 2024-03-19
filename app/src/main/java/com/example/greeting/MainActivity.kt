package com.example.greeting

import android.os.Bundle
import android.text.style.LineHeightSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greeting.ui.theme.GreetingTheme
import org.w3c.dom.Text

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
                    GreetingText(pesan = "Untuk Alexander Paijo", isi = "Harapan Adalah mimpi yang Nyata",
                        pengirim ="Isnawan Rifai Saputra" )

                }
            }
        }
    }
}

@Composable
fun GreetingText(pesan: String, isi: String, pengirim: String, modifier: Modifier= Modifier) {
    Column (
        verticalArrangement = Arrangement.Top,
        modifier = modifier.fillMaxSize().background(Color.Black)

    ) {
        Text(
            text = pesan,
            color = Color.Green,
            fontSize = 55.sp,
            lineHeight = 45.sp,
            textAlign = TextAlign.Center
        )
    }
        Column (
                verticalArrangement = Arrangement.Center)
        {
        Text(
            text =isi,
            color = Color.LightGray,
            fontSize = 40.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )}
    Column (
        verticalArrangement = Arrangement.Bottom
    ){


        Text(
            text = pengirim,
            color = Color.Green,
            fontSize = 38.sp,
            lineHeight = 35.sp,
            modifier = Modifier.padding(5.dp).align
                (alignment = Alignment.End)

        )

    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingTheme {
        GreetingText(pesan = "Untuk Alexander Paijo",isi = "Harapan adalah mimpi yag Nyata",
        pengirim = "Isnawan Rifai Saputra")
    }
}