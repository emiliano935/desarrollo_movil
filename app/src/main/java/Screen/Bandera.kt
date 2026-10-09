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
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun BanderaButan(modifier: Modifier = Modifier) {
    val amarillo = colorResource(R.color.amarillo)
    val naranja = colorResource(R.color.naranja)

    ConstraintLayout(
        modifier = modifier
    ) {
        val (fondoCanvas, dragonImage) = createRefs()

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(fondoCanvas) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val width = size.width
            val height = size.height

            val pathYellow = Path().apply {
                moveTo(0f, 0f)
                lineTo(width, 0f)
                lineTo(0f, height)
                close()
            }
            drawPath(path = pathYellow, color = amarillo)

            val pathOrange = Path().apply {
                moveTo(width, 0f)
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }
            drawPath(path = pathOrange, color = naranja)
        }

        Image(
            painter = painterResource(id = R.drawable.butan),
            contentDescription = "escudo de que es un dragon de la bandera de butan" ,
            modifier = Modifier
                .fillMaxSize(0.6f)
                .constrainAs(dragonImage) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
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