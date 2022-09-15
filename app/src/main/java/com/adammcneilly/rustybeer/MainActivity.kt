package com.adammcneilly.rustybeer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.adammcneilly.rustybeer.beerstyle.BeerStyleListScreen
import com.adammcneilly.rustybeer.theme.RustyBeerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RustyBeerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BeerStyleListScreen()
                }
            }
        }
    }
}
