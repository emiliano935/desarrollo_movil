package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.plantilla.R
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaPapua(modifier: Modifier = Modifier) {
    val rojo = colorResource(R.color.rojo)
    val negro = colorResource(R.color.black)
    val Dorado = colorResource(R.color.dorado)
    val blanco = colorResource(R.color.white)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        val pathRojo = Path().apply {
            moveTo(0f, 0f)
            lineTo(w, 0f)
            lineTo(w, h)
            close()
        }
        drawPath(path = pathRojo, color = rojo)
        val pathNegro = Path().apply {
            moveTo(0f, 0f)
            lineTo(w, h)
            lineTo(0f, h)
            close()
        }
        drawPath(path = pathNegro, color = negro)
        fun drawStar(cx: Float, cy: Float, radius: Float) {
            val innerRadius = radius * 0.38f
            val starPath = Path().apply {
                for (i in 0 until 10) {
                    val r = if (i % 2 == 0) radius else innerRadius
                    val angle = Math.toRadians((i * 36 - 90).toDouble())
                    val x = cx + r * cos(angle).toFloat()
                    val y = cy + r * sin(angle).toFloat()
                    if (i == 0) moveTo(x, y) else lineTo(x, y)
                }
                close()
            }
            drawPath(path = starPath, color = blanco)
        }
        val estrella5 = h * 0.065f
        val estrella4 = h * 0.045f
        val estrella3 = h * 0.035f
        val estrella2 = h * 0.025f
        val estrella1 = h * 0.020f
        drawStar(w * 0.45f, h * 0.45f, estrella5)
        drawStar(w * 0.90f, h * 0.90f, estrella4)
        drawStar(w * 0.75f, h * 0.75f, estrella3)
        drawStar(w * 0.55f, h * 0.55f, estrella2)
        drawStar(w * 0.68f, h * 0.67f, estrella1)
        val avePath = Path().apply {
            val cx = w * 0.72f
            val cy = h * 0.30f
            moveTo(cx, cy)
            cubicTo(cx - 39f, cy - 40f, cx - 80f, cy - 20f, cx - 110f, cy - 60f)
            cubicTo(cx - 70f, cy - 10f, cx - 40f, cy - 10f, cx - 20f, cy + 10f)
            cubicTo(cx + 20f, cy - 30f, cx + 60f, cy - 50f, cx + 100f, cy - 70f)
            cubicTo(cx + 50f, cy - 20f, cx + 20f, cy - 10f, cx, cy)
            close()
        }
        drawPath(path = avePath, color = Dorado)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaPapuaPreview() {
    Surface {
        BanderaPapua(modifier = Modifier.fillMaxSize())
    }
}