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


@Composable
fun BanderaSeychelles(modifier: Modifier = Modifier) {
    val azul = colorResource(R.color.azulsey)
    val amarillo = colorResource(R.color.ama)
    val rojo = colorResource(R.color.rojo)
    val blanco = colorResource(R.color.white)
    val verde = colorResource(R.color.verde)

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        val pathAzul = Path().apply {
            moveTo(0f, h)
            lineTo(0f, 0f)
            lineTo(w / 3f, 0f)
            close()
        }
        drawPath(path = pathAzul, color = azul)

        val pathAmarillo = Path().apply {
            moveTo(0f, h)
            lineTo(w / 3f, 0f)
            lineTo(2 * w / 3f, 0f)
            close()
        }
        drawPath(path = pathAmarillo, color = amarillo)

        val pathRojo = Path().apply {
            moveTo(0f, h)
            lineTo(2 * w / 3f, 0f)
            lineTo(w, 0f)
            lineTo(w, h / 3f)
            close()
        }
        drawPath(path = pathRojo, color = rojo)

        val pathBlanco = Path().apply {
            moveTo(0f, h)
            lineTo(w, h / 3f)
            lineTo(w, 2 * h / 3f)
            close()
        }
        drawPath(path = pathBlanco, color = blanco)

        val pathVerde = Path().apply {
            moveTo(0f, h)
            lineTo(w, 2 * h / 3f)
            lineTo(w, h)
            close()
        }
        drawPath(path = pathVerde, color = verde)
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaSeychellesPreview() {
    Surface {
        BanderaSeychelles(modifier = Modifier.fillMaxSize())
    }
}