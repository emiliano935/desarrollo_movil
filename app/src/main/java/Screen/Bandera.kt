package Screen
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.plantilla.R

@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    val azul = colorResource(R.color.azul)
    val verde = colorResource(R.color.verde)
    val amarillo = colorResource(R.color.amarillo)
    val negro = colorResource(R.color.black)
    val blanco = colorResource(R.color.white)

    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(3f / 2f)
    ) {
        val w = size.width
        val h = size.height
        drawRect(
            color = azul,
            size = Size(w, h / 2f)
        )
        drawRect(
            color = amarillo,
            topLeft = Offset(0f, h / 2f),
            size = Size(w, h / 2f)
        )
        val whiteBorderPath = Path().apply {
            moveTo(0f, 0f)
            lineTo(w * 0.42f, h * 0.5f)
            lineTo(0f, h)
            lineTo(0f, h * 0.8f)
            lineTo(w * 0.30f, h * 0.5f)
            lineTo(0f, h * 0.2f)
            close()
        }
        drawPath(whiteBorderPath, blanco)

        val whiteArmPath = Path().apply {
            moveTo(0f, h * 0.35f)
            lineTo(w * 0.25f, h * 0.5f)
            lineTo(w, h * 0.5f)
            lineTo(w, h * 0.35f)
            close()
        }
        drawPath(whiteArmPath, blanco)

        val whiteArmBottomPath = Path().apply {
            moveTo(0f, h * 0.65f)
            lineTo(w * 0.25f, h * 0.5f)
            lineTo(w, h * 0.5f)
            lineTo(w, h * 0.65f)
            close()
        }
        drawPath(whiteArmBottomPath, blanco)
        val greenPath = Path().apply {
            moveTo(0f, h * 0.10f)
            lineTo(w * 0.36f, h * 0.5f)
            lineTo(0f, h * 0.90f)
            lineTo(0f, h * 0.73f)
            lineTo(w * 0.27f, h * 0.5f)
            lineTo(0f, h * 0.27f)
            close()
        }
        drawPath(greenPath, verde)

        val greenArm = Path().apply {
            moveTo(w * 0.20f, h * 0.5f)
            lineTo(w, h * 0.5f)
            lineTo(w, h * 0.38f)
            lineTo(w * 0.28f, h * 0.38f)
            close()
        }
        drawPath(greenArm, verde)
        val greenArmBottom = Path().apply {
            moveTo(w * 0.20f, h * 0.5f)
            lineTo(w, h * 0.5f)
            lineTo(w, h * 0.62f)
            lineTo(w * 0.28f, h * 0.62f)
            close()
        }
        drawPath(greenArmBottom, verde)
        val blackTriangle = Path().apply {
            moveTo(0f, h * 0.18f)
            lineTo(w * 0.24f, h * 0.5f)
            lineTo(0f, h * 0.82f)
            close()
        }
        drawPath(blackTriangle, negro)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    Surface {
        BanderaSudafrica()
    }
}

