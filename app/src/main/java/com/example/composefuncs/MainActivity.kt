package com.example.composefuncs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composefuncs.ui.theme.ComposeFuncsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFuncsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun CustomText() {
    Text(
        text = stringResource(id = R.string.hello_world),
        modifier = Modifier
            .background(Color.Blue)
            .padding(16.dp)
            .width(200.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.headlineLarge.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center

    )
}

@Composable
fun CustomText2() {
    Text(buildAnnotatedString {
        withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)){
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
                    )
            ){
                append("A")
            }
            append("B")
            append("C")
            append("D")
        }


    }, modifier = Modifier.width(200.dp))
}

@Composable
fun CustomText3(){
    Text(text = "Hello World!".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeFuncsTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            CustomText3()
        }

    }
}

