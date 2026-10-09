package Screen

import android.view.Surface
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import com.example.plantilla.R
import androidx.compose.foundation.Image
import androidx.compose.material3.Surface
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    val ButanOrange = colorResource(R.color.naranja)
    val ButanYellow = colorResource(R.color.amarillo)
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            val pathYellow = Path().apply {
                moveTo(0f, 0f)
                lineTo(width, 0f)
                lineTo(0f, height)
                close()
            }
            drawPath(path = pathYellow, color = ButanYellow)

            val pathOrange = Path().apply {
                moveTo(width, 0f)
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }
            drawPath(path = pathOrange, color = ButanOrange)
        }

        Image(
            painter = painterResource(id = R.drawable.butan),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(0.6f)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BanderaButanPreview() {
    Surface {
        BanderaButan(modifier = Modifier.fillMaxSize())
    }
}