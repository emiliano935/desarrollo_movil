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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.plantilla.R
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun Banderaisrael(modifier: Modifier= Modifier) {
    val azulIsrael = colorResource(R.color.israel)
    Box(modifier = modifier.fillMaxSize()
        .background(colorResource(R.color.white))
    )
    Column(modifier = Modifier){
        Box(modifier = modifier
            .weight(0.10f)
            .fillMaxWidth()
        )
        Box(modifier = modifier
            .weight(0.10f)
            .background(colorResource(R.color.israel))
            .fillMaxWidth())
        Box(modifier = modifier
            .weight(0.60f)
            .fillMaxWidth()
        ){
            Canvas(modifier = Modifier.fillMaxSize()) {
                val cx = size.width / 2
                val cy = size.height / 2
                val radio = size.width * 0.18f
                val grosorLinea = 10.dp.toPx()

                val trianguloArriba = triangulo(cx, cy, radio, -90f)
                drawPath(
                    path = trianguloArriba,
                    color = azulIsrael,
                    style = Stroke(width = grosorLinea)
                )

                val trianguloAbajo = triangulo(cx, cy, radio, 90f)
                drawPath(
                    path = trianguloAbajo,
                    color = azulIsrael,
                    style = Stroke(width = grosorLinea)
                )
            }
        }
        Box(modifier = modifier
            .weight(0.10f)
            .fillMaxWidth()
            .background(colorResource(R.color.israel))
        )
        Box(modifier = modifier
            .weight(0.10f)
            .fillMaxWidth()
        )
    }

}

fun triangulo(cx: Float, cy: Float, r: Float, rotacion: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angulo = Math.toRadians((rotacion + i * 120).toDouble())
        val x = cx + r * cos(angulo).toFloat()
        val y = cy + r * sin(angulo).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}


@Preview(showBackground = true)
@Composable
fun Banderaisraelprueba(){
    Surface {

        Banderaisrael()
    }
}
