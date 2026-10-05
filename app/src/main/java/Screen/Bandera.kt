package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.plantilla.R

@Composable
fun BanderaEEUU(modifier: Modifier= Modifier){
    Box(modifier = modifier.fillMaxSize()){
        Column(Modifier.fillMaxSize()) {
            repeat(13){index ->
                Box(Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(if (index %2 ==0 ) Color(0xFFB22234)else Color.White)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .fillMaxHeight(0.54f)
                .background(Color(0xFF3C3B6E))
                .padding(vertical = 4.dp, horizontal = 2.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                repeat(9) { rowIndex ->
                    val cantidadEstrellas = if (rowIndex % 2 == 0) 6 else 5

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        repeat(cantidadEstrellas) {
                            Image(
                                painter = painterResource(R.drawable.pngtree_white_star_png_png_image_14549691),
                                contentDescription = "Estrella",
                                modifier = Modifier.size(15.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Surface{
        BanderaEEUU()
    }
}