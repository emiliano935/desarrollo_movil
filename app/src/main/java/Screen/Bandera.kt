package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.plantilla.R

@Composable
fun BanderaReino(modifier: Modifier = Modifier) {
    val azul = colorResource(R.color.azul)
    val rojo = colorResource(R.color.rojo)
    val blanco = colorResource(R.color.white)

    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (lienzo) = createRefs()

        Canvas(
            modifier = Modifier
                .constrainAs(lienzo) {
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

            drawRect(color = azul, size = size)
            val anchoDiagonalBlanca = h * 0.20f
            val anchoDiagonalRoja = h * 0.06f
            val anchoCruzBlanca = h * 0.33f
            val anchoCruzRoja = h * 0.20f

            drawLine(color = blanco, start = Offset(0f, 0f), end = Offset(w, h), strokeWidth = anchoDiagonalBlanca)
            drawLine(color = blanco, start = Offset(0f, h), end = Offset(w, 0f), strokeWidth = anchoDiagonalBlanca)

            drawLine(color = rojo, start = Offset(0f, 0f), end = Offset(w / 2f, h / 2f), strokeWidth = anchoDiagonalRoja)
            drawLine(color = rojo, start = Offset(w, 0f), end = Offset(w / 2f, h / 2f), strokeWidth = anchoDiagonalRoja)
            drawLine(color = rojo, start = Offset(w, h), end = Offset(w / 2f, h / 2f), strokeWidth = anchoDiagonalRoja)
            drawLine(color = rojo, start = Offset(0f, h), end = Offset(w / 2f, h / 2f), strokeWidth = anchoDiagonalRoja)

            drawRect(
                color = blanco,
                topLeft = Offset(0f, (h - anchoCruzBlanca) / 2f),
                size = Size(w, anchoCruzBlanca)
            )
            drawRect(
                color = blanco,
                topLeft = Offset((w - anchoCruzBlanca) / 2f, 0f),
                size = Size(anchoCruzBlanca, h)
            )

            drawRect(
                color = rojo,
                topLeft = Offset(0f, (h - anchoCruzRoja) / 2f),
                size = Size(w, anchoCruzRoja)
            )
            drawRect(
                color = rojo,
                topLeft = Offset((w - anchoCruzRoja) / 2f, 0f),
                size = Size(anchoCruzRoja, h)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaReinoPreview() {
    Surface {
        BanderaReino(modifier = Modifier.fillMaxSize())
    }
}