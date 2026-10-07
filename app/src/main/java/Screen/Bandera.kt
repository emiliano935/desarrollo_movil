package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.plantilla.R

@Composable
fun Banderasuiza(modifier: Modifier= Modifier) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .background(colorResource(R.color.rej))
            .fillMaxSize()
    )
    ConstraintLayout(modifier = Modifier.aspectRatio(1f)) {
        val (cuadroVertical, cuadroHorizontal) = createRefs()
        val lineSup1 = createGuidelineFromTop(0.1875f)
        val lineInf1 = createGuidelineFromBottom( 0.1875f)
        val lineIzq1 = createGuidelineFromStart(0.375f)
        val lineDer1 = createGuidelineFromEnd(0.375f)

        val lineSup2 = createGuidelineFromTop(0.375f)
        val lineInf2 = createGuidelineFromBottom( 0.375f)
        val lineIzq2 = createGuidelineFromStart(0.1875f)
        val lineDer2 = createGuidelineFromEnd(0.1875f)


        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cuadroVertical)
                {
                    start.linkTo(lineIzq1)
                    end.linkTo(lineDer1)
                    top.linkTo(lineSup1)
                    bottom.linkTo(lineInf1)

                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        // Franja Horizontal de la Cruz Blanca
        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cuadroHorizontal) {
                    start.linkTo(lineIzq2)
                    end.linkTo(lineDer2)
                    top.linkTo(lineSup2)
                    bottom.linkTo(lineInf2)

                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )
    }

}

@Preview(showBackground = true)
@Composable
fun previewBanderasuiza(){
    Surface {
        Banderasuiza()
    }
}