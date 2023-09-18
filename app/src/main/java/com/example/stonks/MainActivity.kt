package com.example.stonks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.stonks.ui.theme.StonksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StonksTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    loginPage()
                }
            }
        }
    }
}

@Composable
fun loginPage(modifier: Modifier = Modifier) {
   Box{
       val image = painterResource(R.drawable.stonksman)
       Image(
           painter = image,
           contentDescription = null,

           modifier = Modifier.fillMaxSize(),
           contentScale = ContentScale.Crop,
           alpha = 0.8F
       )

   }
}

@Preview(showBackground = true)
@Composable
fun loginPreview() {
    StonksTheme {
        loginPage()
    }
}