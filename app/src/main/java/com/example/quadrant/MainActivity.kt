package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@Composable
fun Quadrant() {
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Row {
                Box(modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = MaterialTheme.colorScheme.inverseOnSurface)){
                    Column (modifier=Modifier
                        .padding(16.dp)
                        .align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        ){
                        Text(text = "Text composable",
                            fontWeight = FontWeight.ExtraBold)
                        Spacer(modifier = Modifier.height(15.dp))
                        Text(text = """
                            |Displays text    and 
                            |follows              the 
                            |recommended
                            |Material      Design
                            |guidelines
                        """.trimMargin() )
                    }
                }
                Box(modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = MaterialTheme.colorScheme.outlineVariant)){
                    Column (modifier=Modifier
                        .padding(16.dp)
                        .align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Text(text = "Image composable",
                            fontWeight = FontWeight.ExtraBold)
                        Spacer(modifier = Modifier.height(15.dp))
                        Text(text = """
                            |Creates a composable 
                            |that lays  out   and 
                            |draws a given Painter
                            |class  object
                           
                        """.trimMargin() )
                    }
                }

            }

        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {

            Row {
                Box(modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = MaterialTheme.colorScheme.surfaceTint)){
                    Column (modifier=Modifier
                        .padding(16.dp)
                        .align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Text(text = "Row composable",
                            fontWeight = FontWeight.ExtraBold)
                        Spacer(modifier = Modifier.height(15.dp))
                        Text(text = """
                            |A layout composable 
                            |that places its children
                            |in     a    horizontal
                            |sequence.
                        """.trimMargin() )
                    }
                }
                Box(modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = MaterialTheme.colorScheme.errorContainer))

            }
        }
    }

}

@Preview(showSystemUi =true)
@Composable
fun QaudrantPreview() {
    QuadrantTheme {
        Quadrant()
    }
}