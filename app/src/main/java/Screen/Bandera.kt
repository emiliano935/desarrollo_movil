package Screen

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.pm.ShortcutInfoCompat
import com.example.plantilla.R


@Composable
fun BanderaArgentina(modifier: Modifier= Modifier){
    ConstraintLayout(modifier = modifier) {
        val (celeste, blanco,celeste2,image) = createRefs()
        val linea1 = createGuidelineFromTop(0.33f)
        val linea2 = createGuidelineFromTop(0.66f)
        val escudo = createGuidelineFromStart(0.50f)
        Box(modifier= Modifier
            .background(colorResource(R.color.celeste))
            .constrainAs(celeste)
            {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(linea1)

                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints

            }
        )
        Box(modifier = Modifier
            .background(colorResource(R.color.white))
            .constrainAs(blanco)
            {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(linea1)
                bottom.linkTo(linea2)
                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints

            }
        )
        Image(
            painter= painterResource(R.drawable.argentina_39770_1280),
            contentDescription=("escudo nacional"),
            modifier= Modifier.size(100.dp)
                .constrainAs(image){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

            }
        )
        Box(modifier = Modifier
            .background(colorResource(R.color.celeste))
            .constrainAs(celeste2)

            {
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
fun BanderaArgentinapreview(){
    Surface{
     BanderaArgentina(modifier = Modifier.fillMaxSize())
    }
}