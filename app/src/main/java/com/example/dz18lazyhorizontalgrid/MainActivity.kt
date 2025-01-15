package com.example.dz18lazyhorizontalgrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dz18lazyhorizontalgrid.ui.theme.DZ18LazyHorizontalGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DZ18LazyHorizontalGridTheme {
                Spin()
            }
        }
    }
}

private val imageList = listOf(
    R.drawable.apllegrin,
    R.drawable.grape,
    R.drawable.orange,
    R.drawable.grusha,
    R.drawable.apllered,
    R.drawable.pineapple,
    R.drawable.banaan,
    R.drawable.tomato,
    R.drawable.mango,
    R.drawable.peach,
    R.drawable.perecchili
)


@Preview(showSystemUi = true)
@Composable
fun Spin() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        contentPadding = PaddingValues(4.dp),
        modifier = Modifier
            .background(Color.Cyan)
    ) {
        items(102) {
            RandomImegeBox()
        }
    }
}

@Composable
fun RandomImegeBox() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .padding(4.dp)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(imageList.random()),
            contentDescription = ""
        )
    }
}