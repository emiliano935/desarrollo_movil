package Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
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

val RombosShape = GenericShape { size, _ ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height / 2f)
    lineTo(size.width / 2f, size.height)
    lineTo(0f, size.height / 2f)
    close()
}


@Composable
fun BanderaBrasil(modifier: Modifier= Modifier){
    ConstraintLayout(modifier = modifier) {
        val(verde,rombo,circulo) =createRefs()
        val  linea1 =createGuidelineFromStart(0.20f)
        val  linea2 =createGuidelineFromStart(0.80f)
        val  linea3 =createGuidelineFromTop(0.10f)
        val  linea4 =createGuidelineFromTop(0.90f)

        val  linea5 =createGuidelineFromStart(0.35f)
        val  linea6 =createGuidelineFromStart(0.65f)
        val  linea7 =createGuidelineFromTop(0.35f)
        val  linea8 =createGuidelineFromTop(0.65f)

        Box(modifier = Modifier
            .background(colorResource(R.color.verde))
            .constrainAs(verde){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            }
        )
       Box(modifier =modifier
           .clip(RombosShape)
           .background(colorResource(R.color.rombo))
           .constrainAs(rombo){
               start.linkTo(linea1)
               end.linkTo(linea2)
               top.linkTo(linea3)
               bottom.linkTo(linea4)

               height = Dimension.fillToConstraints
               width = Dimension.fillToConstraints
           }
       )
        Box(modifier = modifier
            .aspectRatio(1f)
            .clip(CircleShape)
            .background(colorResource(R.color.circulo))
            .constrainAs(circulo){
             start.linkTo(linea5)
                end.linkTo(linea6)
                top.linkTo(linea7)
                bottom.linkTo(linea8)
                height= Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaBrasilPreview(){
    Surface{
        BanderaBrasil()
    }
}