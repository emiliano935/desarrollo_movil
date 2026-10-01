package Screen

import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.plantilla.R

@Composable
fun BanderaColombia(modifier: Modifier= Modifier){
    ConstraintLayout(modifier= Modifier){
        val (blue,yellow,red)=createRefs()
        val linea1= createGuidelineFromTop(0.50f)
        val linea2= createGuidelineFromTop(0.75f)
        Box(modifier = Modifier
            .background(colorResource(R.color.yellow))
            .constrainAs(yellow){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(linea1)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            }
        )
        Box(modifier= Modifier
            .background(colorResource(R.color.azul))
            .constrainAs(blue){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(linea1)
                bottom.linkTo(linea2)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints

            }
        )
        Box(modifier= Modifier
            .background(colorResource(R.color.red))
            .constrainAs(red){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(linea2)
                bottom.linkTo(parent.bottom)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            }
        )


        }
    }

@Preview(showBackground = true)
@Composable
fun BanderaColombiaPreview() {
    Surface {
        BanderaColombia(modifier = Modifier.fillMaxSize())
    }
}
