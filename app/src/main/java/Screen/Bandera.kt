package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.plantilla.R



@Composable
fun BanderaAlemania(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier) {
        val (black, red, yellow) = createRefs()
        val lineguia1 = createGuidelineFromBottom(0.33f)
        val lineguia2 = createGuidelineFromBottom(0.66f)

        Box(modifier = Modifier
            .background(Color.Black)
            .constrainAs(black) {

                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(lineguia2)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            })

        Box(modifier = Modifier
            .background(colorResource(R.color.red))
            .constrainAs(red) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(lineguia2)
                bottom.linkTo(lineguia1)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            }
        )

        Box(modifier = Modifier
            .background(colorResource(R.color.yellow))
            .constrainAs(yellow) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(lineguia1)
                bottom.linkTo(parent.bottom)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            })
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaAlemaniaPreview() {
    Surface {
        BanderaAlemania(modifier = Modifier.fillMaxSize())
    }
}