package com.example.greeting

import android.os.Bundle
import android.text.style.LineHeightSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
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
                    imageback(pesan = "Untuk Alexander Paijo", isi = "Harapan Adalah mimpi yang Nyata",
                        pengirim ="Isnawan Rifai Saputra")

                }
            }
        }
    }
}

@Composable
fun GreetingText(pesan: String, isi: String, pengirim: String, modifier: Modifier= Modifier) {
val fontduwur = FontFamily(Font(R.font.diskonregular))
    val fonttengah = FontFamily(Font(R.font.pemanka))
    Column (
        verticalArrangement = Arrangement.Top,

    ) {
        Text(
            text = pesan,
            color = Color.Black,
            fontSize = 50.sp,
            lineHeight = 45.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontduwur
        )
    }
        Column (
                verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize())
        {
        Text(
            text =isi,
            color = Color.White,
            fontSize = 50.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            fontFamily = fonttengah,
            modifier = Modifier.padding(50.dp)
        )}
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End,
        modifier = Modifier.fillMaxSize()
    ){


        Text(
            text = pengirim,
            color = Color.Black,
            fontSize = 38.sp,
            lineHeight =35.sp,
            modifier = Modifier.padding(20.dp),
            fontFamily = fontduwur


        )

    }

}
@Composable
fun imageback(pesan: String, isi: String, pengirim: String, modifier: Modifier = Modifier){
    val Gambar = painterResource(R.drawable.gambarback)
    Box {
        Image(
            painter = Gambar,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.5F,
            contentScale = ContentScale.Crop

        )
        GreetingText(
            pesan = pesan,
            isi = isi,
            pengirim = pengirim,
            modifier = Modifier.fillMaxSize())
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingTheme {
        imageback(pesan = "Untuk Alexander Paijo",isi = "Harapan adalah mimpi yang Nyata",
        pengirim = "Isnawan Rifai Saputra")
    }
}