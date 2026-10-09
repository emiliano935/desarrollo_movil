package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.plantilla.R

import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaCuba(modifier: Modifier = Modifier) {
    val azul = colorResource(R.color.Azul)
    val rojo = colorResource(R.color.Rojo)
    val blanco = colorResource(R.color.white)

    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (franjas, triangulo, estrella) = createRefs()

        Column(
            modifier = Modifier.constrainAs(franjas) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {
            repeat(5) { index ->
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(if (index % 2 == 0) azul else blanco)
                )
            }
        }

        Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.4f)
                .constrainAs(triangulo) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        ) {
            val trianglePath = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(path = trianglePath, color = rojo)
        }

        Canvas(
            modifier = Modifier
                .size(60.dp)
                .constrainAs(estrella) {
                    linkTo(start = triangulo.start, end = triangulo.end, bias = 0.35f)
                    top.linkTo(triangulo.top)
                    bottom.linkTo(triangulo.bottom)
                }
        ) {
            val cx = size.width / 2f
            val cy = size.height / 2f
            val outerRadius = size.minDimension / 2f
            val innerRadius = outerRadius * 0.38f

            val starPath = Path().apply {
                for (i in 0 until 10) {
                    val r = if (i % 2 == 0) outerRadius else innerRadius
                    val angle = Math.toRadians((i * 36 - 90).toDouble())
                    val x = cx + r * cos(angle).toFloat()
                    val y = cy + r * sin(angle).toFloat()
                    if (i == 0) moveTo(x, y) else lineTo(x, y)
                }
                close()
            }
            drawPath(path = starPath, color = blanco)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun BanderaCubaPreview() {
    Surface {
        BanderaCuba(modifier = Modifier.fillMaxSize())
    }
}