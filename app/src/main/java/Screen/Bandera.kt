package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.plantilla.R

import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaCuba(modifier: Modifier = Modifier) {
    val azul = colorResource(R.color.Azul)
    val rojo = colorResource(R.color.Rojo)
    val blanco = colorResource(R.color.white)

    Canvas(modifier = modifier.fillMaxSize()) {
        drawRect(color = blanco, size = size)

        val band = size.height / 5f
        for (i in 0 until 5) {
            if (i % 2 == 0) {
                drawRect(
                    color = azul,
                    topLeft = Offset(0f, i * band),
                    size = Size(size.width, band)
                )
            }
        }

        val triWidth = size.width * 0.4f
        val trianglePath = Path().apply {
            moveTo(0f, 0f)
            lineTo(triWidth, size.height / 2f)
            lineTo(0f, size.height)
            close()
        }
        drawPath(path = trianglePath, color = rojo)

        val starCx = triWidth * 0.35f
        val starCy = size.height / 2f
        val outerRadius = size.height * 0.08f
        val innerRadius = outerRadius * 0.38f

        val starPath = Path().apply {
            for (i in 0 until 10) {
                val r = if (i % 2 == 0) outerRadius else innerRadius
                val angle = Math.toRadians((i * 36 - 90).toDouble())
                val x = starCx + r * cos(angle).toFloat()
                val y = starCy + r * sin(angle).toFloat()
                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }
        drawPath(path = starPath, color = blanco)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaCubaPreview() {
    Surface {
        BanderaCuba(modifier = Modifier.fillMaxSize())
    }
}