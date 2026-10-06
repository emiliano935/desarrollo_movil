package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.plantilla.R

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    val Rojo = colorResource(R.color.turquia)
    Box(modifier = Modifier.background(Rojo)
    )
    {
        Canvas(modifier = Modifier.fillMaxSize()){
        drawRect(color =Rojo)
            val cy = size.height /2f
            val radio = size.height * 0.30f
            drawCircle(
                color=Color.White, radius = radio,
                center= Offset(size.width*0.38f,cy)
            )
            drawCircle(
                color = Rojo, radius = size.height * 0.24f,
                center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
            )
            val pathEstrella = Path()
            val centroXEstrella = size.width * 0.62f
            val radioExterior = size.height * 0.07f
            val radioInterior = radioExterior * 0.38f

            for (i in 0 until 10) {
                val angulo = (i * 36f - 90f) * (Math.PI / 180f)
                val r = if (i % 2 == 0) radioExterior else radioInterior
                val x = (centroXEstrella + r * Math.cos(angulo)).toFloat()
                val y = (cy + r * Math.sin(angulo)).toFloat()

                if (i == 0) pathEstrella.moveTo(x, y) else pathEstrella.lineTo(x, y)
            }
            pathEstrella.close()

            drawPath(
                path = pathEstrella,
                color = Color.White
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaturquiaPreview(){
    Surface{
        BanderaTurquia()
    }
}