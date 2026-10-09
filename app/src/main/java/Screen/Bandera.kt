package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.plantilla.R


@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    val azul = colorResource(id= R.color.azul)
    val amarillo = colorResource(id = R.color.amarillo)
    val verde = colorResource(R.color.verde)
    val negro = colorResource(R.color.black)
    val blanco = colorResource(R.color.white)

    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (dibujoBandera) = createRefs()

        Canvas(
            modifier = Modifier
                .constrainAs(dibujoBandera) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        ) {
            val w = size.width
            val h = size.height

            val pathAzul = Path().apply {
                moveTo(0f, 0f)
                lineTo(w, 0f)
                lineTo(w, h * 0.30f)
                lineTo(w * 0.37f, h * 0.33f)
                close()
            }
            drawPath(path = pathAzul, color = azul)

            val pathAmarillo = Path().apply {
                moveTo(w * 0.37f, h * 0.67f)
                lineTo(w, h * 0.70f)
                lineTo(w, h)
                lineTo(0f, h)
                close()
            }
            drawPath(path = pathAmarillo, color = amarillo)

            val pathTrianguloAzulCentral = Path().apply {
                moveTo(w * 0.65f, h * 0.50f)
                lineTo(w, h * 0.38f)
                lineTo(w, h * 0.50f)
                close()
            }
            drawPath(path = pathTrianguloAzulCentral, color = azul)

            val pathBlancoArriba = Path().apply {
                moveTo(0f, 0f)
                lineTo(0f, h * 0.08f)
                lineTo(w * 0.37f, h * 0.38f)
                lineTo(w, h * 0.12f)
                lineTo(w, h * 0.04f)
                close()
            }
            drawPath(path = pathBlancoArriba, color = blanco)

            val pathBlancoAbajo = Path().apply {
                moveTo(0f, h)
                lineTo(0f, h * 0.92f)
                lineTo(w * 0.37f, h * 0.62f)
                lineTo(w, h * 0.88f)
                lineTo(w, h * 0.96f)
                close()
            }
            drawPath(path = pathBlancoAbajo, color = blanco)

            val pathVerdeTopLeft = Path().apply {
                moveTo(0f, 0f)
                lineTo(w * 0.37f, h * 0.38f)
                lineTo(w * 0.28f, h * 0.50f)
                lineTo(0f, h * 0.20f)
                close()
            }
            drawPath(path = pathVerdeTopLeft, color = verde)

            val pathVerdeBottomLeft = Path().apply {
                moveTo(0f, h)
                lineTo(w * 0.37f, h * 0.62f)
                lineTo(w * 0.28f, h * 0.50f)
                lineTo(0f, h * 0.80f)
                close()
            }
            drawPath(path = pathVerdeBottomLeft, color = verde)

            val pathVerdeTopRight = Path().apply {
                moveTo(w * 0.55f, h * 0.50f)
                lineTo(w, h * 0.07f)
                lineTo(w, h * 0.27f)
                lineTo(w * 0.37f, h * 0.50f)
                close()
            }
            drawPath(path = pathVerdeTopRight, color = verde)

            val pathVerdeBottomRight = Path().apply {
                moveTo(w * 0.55f, h * 0.50f)
                lineTo(w, h * 0.93f)
                lineTo(w, h * 0.73f)
                lineTo(w * 0.37f, h * 0.50f)
                close()
            }
            drawPath(path = pathVerdeBottomRight, color = verde)

            val pathNegro = Path().apply {
                moveTo(0f, 0f)
                lineTo(w * 0.28f, h * 0.50f)
                lineTo(0f, h)
                close()
            }
            drawPath(path = pathNegro, color = negro)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    Surface {
        BanderaSudafrica()
    }
}

