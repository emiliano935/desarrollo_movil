package com.example.plantilla

import Screen.Banderafrancia
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
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.plantilla.ui.theme.PlantillaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Banderafrancia(modifier = Modifier.padding(innerPadding),)
        }

        }
    }
}




@Preview(showBackground = true)
@Composable
fun BanderafranciaPreview() {
    Surface {
        Banderafrancia(modifier = Modifier.fillMaxSize())
    }
}