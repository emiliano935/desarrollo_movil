package Screen


import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.plantilla.R

//Box(modifier = Modifier.background(N).fillMaxWidth(0.04f).fillMaxHeight(0.02f)) medidade un bloque
//
@Composable
fun pixelArtScreen(modifier: Modifier = Modifier) {
    val t = 16.dp
    val N = colorResource(R.color.charmander_black)
    val nf = colorResource(R.color.charmander_red)
    val ns = colorResource(R.color.charmander_orange)
    val B = colorResource(R.color.charmander_white)
    val am = colorResource(R.color.charmander_yellow)
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(4) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(9) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
            }

        }
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }

                repeat(4) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(7) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }

            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }

                repeat(6) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(6) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(2) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }

                repeat(6) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(6) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(2) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }

            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }

                repeat(8) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(3) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(3) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(2) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(am).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(2) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(3) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(2) {
                    Box(modifier = Modifier.background(am).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(nf).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(2) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(ns).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(4) {
                    Box(modifier = Modifier.background(B).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(am).size(t))
                }
                repeat(2) {
                    Box(modifier = Modifier.background(N).size(t))
                }
                repeat(1) {
                    Box(modifier = Modifier.background(B).size(t))
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(1) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(10) {
                        Box(modifier = Modifier.background(ns).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(3) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(ns).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(2) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                    repeat(2) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(9) {
                        Box(modifier = Modifier.background(ns).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(2) {
                        Box(modifier = Modifier.background(ns).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(4) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(3) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(2) {
                        Box(modifier = Modifier.background(ns).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}

                    repeat(3) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(2) {
                        Box(modifier = Modifier.background(N).size(t))}
                    repeat(2) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}
                    }
                }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(5) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(2) {
                        Box(modifier = Modifier.background(am).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}

                    repeat(5) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}
                    repeat(2) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(5) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(3) {
                        Box(modifier = Modifier.background(am).size(t))
                    }
                    repeat(2) {
                        Box(modifier = Modifier.background(N).size(t))}

                    repeat(3) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(4) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}
                    repeat(3) {
                        Box(modifier = Modifier.background(am).size(t))
                    }
                    repeat(4) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(2) {
                        Box(modifier = Modifier.background(N).size(t))}
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(5) {
                       Box(modifier = Modifier.background(B).size(t))}
                    repeat(3) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(2) {
                        Box(modifier = Modifier.background(am).size(t))
                    }
                    repeat(3) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(2) {
                        Box(modifier = Modifier.background(N).size(t))}
                }
            }

            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(8) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(3) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(2) {
                        Box(modifier = Modifier.background(N).size(t))}
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(9) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(ns).size(t))}
                    repeat(1) {
                        Box(modifier = Modifier.background(B).size(t))
                    }
                    repeat(1) {
                        Box(modifier = Modifier.background(N).size(t))}
                }
            }
            Column {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(10) {
                        Box(modifier = Modifier.background(B).size(t))}
                    repeat(4) {
                        Box(modifier = Modifier.background(N).size(t))
                    }
                }
            }
            }
        }
    }
@Preview(showBackground = true)
@Composable
fun PixelArtPreview() {
    Surface {
        pixelArtScreen()
    }
}