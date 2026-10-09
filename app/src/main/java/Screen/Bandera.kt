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
fun BanderaSeychelles(modifier: Modifier = Modifier) {
    val azul = colorResource(R.color.ama)
    val amarillo = colorResource(R.color.azulsey)
    val rojo = colorResource(R.color.rojo)
    val blanco = colorResource(R.color.white)
    val verde = colorResource(R.color.verde)

    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (Linea) = createRefs()

        Canvas(
            modifier = Modifier
                .constrainAs(Linea) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        ) {
            val w = size.width
            val h = size.height

            drawPath(
                path = Path().apply {
                    moveTo(0f, h)
                    lineTo(0f, 0f)
                    lineTo(w / 3f, 0f)
                    close()
                },
                color = azul
            )
            drawPath(
                path = Path().apply {
                    moveTo(0f, h)
                    lineTo(w / 3f, 0f)
                    lineTo(2 * w / 3f, 0f)
                    close()
                },
                color = amarillo
            )
            drawPath(
                path = Path().apply {
                    moveTo(0f, h)
                    lineTo(2 * w / 3f, 0f)
                    lineTo(w, 0f)
                    lineTo(w, h / 3f)
                    close()
                },
                color = rojo
            )
            drawPath(
                path = Path().apply {
                    moveTo(0f, h)
                    lineTo(w, h / 3f)
                    lineTo(w, 2 * h / 3f)
                    close()
                },
                color = blanco
            )

            drawPath(
                path = Path().apply {
                    moveTo(0f, h)
                    lineTo(w, 2 * h / 3f)
                    lineTo(w, h)
                    close()
                },
                color = verde
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaSeychellesPreview() {
    Surface {
        BanderaSeychelles(modifier = Modifier.fillMaxSize())
    }
}