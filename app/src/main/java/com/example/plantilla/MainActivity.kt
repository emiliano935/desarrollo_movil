package com.example.plantilla

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.plantilla.ui.theme.PlantillaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Composable
fun BanderaEEUU(modifier: Modifier= Modifier){
    Box(modifier = modifier.fillMaxSize()){
        Column(Modifier.fillMaxSize()) {
            repeat(13){index ->
                Box(Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(if (index %2 ==0 ) Color(0xFFB22234)else Color.White)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .fillMaxHeight(0.54f)
                .background(Color(0xFF3C3B6E))
        )
        //1111
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Surface{
        BanderaEEUU()
    }
}