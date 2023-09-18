package com.example.stonks

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
   Box {
       val image = painterResource(R.drawable.stonksman)
       Image(
           painter = image,
           contentDescription = null,

           modifier = Modifier.fillMaxSize(),
           contentScale = ContentScale.Crop,
           alpha = 0.8F

       )
       Column {
           Row {

           }
           Row {
               frontPageBtns()
           }
           Row {

           }

       }


   }
}

@Composable
fun frontPageBtns(modifier: Modifier = Modifier)
{
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,



    )
    {

            Button(onClick = { /*TODO*/ }) {
                Text("Login")



            }
            Button(onClick = { /*TODO*/ }) {
                Text("Sign Up")

            }
        }

}

@Preview(showBackground = true)
@Composable
fun loginPreview() {
    StonksTheme {
        loginPage()
    }
}