package Screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.plantilla.R

@Composable
fun BanderaNepal(modifier: Modifier = Modifier) {
    val redColor = colorResource(id = R.color.nepal_red)
    val blueColor = colorResource(id = R.color.nepal_blue)

    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            val pathBordeAzul = Path().apply {
                moveTo(width * 0.1f, height * 0.05f)
                lineTo(width * 0.75f, height * 0.05f)
                lineTo(width * 0.35f, height * 0.52f)
                lineTo(width * 0.85f, height * 0.52f)
                lineTo(width * 0.1f, height * 0.95f)
                close()
            }
            drawPath(
                path = pathBordeAzul,
                color = blueColor
            )

            val pathRojo = Path().apply {
                moveTo(width * 0.13f, height * 0.08f)
                lineTo(width * 0.68f, height * 0.08f)
                lineTo(width * 0.32f, height * 0.50f)
                lineTo(width * 0.76f, height * 0.50f)
                lineTo(width * 0.13f, height * 0.90f)
                close()
            }
            drawPath(
                path = pathRojo,
                color = redColor
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun BanderaNepalPreview() {
    Surface {
        BanderaNepal(modifier = Modifier.fillMaxSize())
    }
}