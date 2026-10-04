package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.plantilla.R

@Composable
fun Banderajapon(modifier: Modifier= Modifier){
    ConstraintLayout(modifier = modifier) {
        val(fondo,ciculo) = createRefs()
        val linea5 = createGuidelineFromStart(0.35f)
        val linea6 = createGuidelineFromStart(0.65f)
        val linea7 = createGuidelineFromTop(0.35f)
        val linea8 = createGuidelineFromTop(0.65f)
        Box(modifier = modifier
            .background(colorResource(R.color.white))
            .constrainAs(fondo){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)

                width= Dimension.fillToConstraints
                height= Dimension.fillToConstraints
            }
        )

        Box(modifier = modifier
            .clip(CircleShape)
            .size(100.dp)
            .background(colorResource(R.color.japon))
            .aspectRatio(1f)
            .constrainAs(ciculo){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)

                width= Dimension.percent(0.35f)
                height= Dimension.ratio("1:1")

            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun banderajaponpreview(){
    Surface{
        Banderajapon()
    }
}