package com.adammcneilly.rustybeer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.adammcneilly.rustybeer.beerstyle.BeerStyleListScreen
import com.adammcneilly.rustybeer.beerstyle.BeerStyleListViewModel
import com.adammcneilly.rustybeer.data.OfflineFirstBeerStyleRepository
import com.adammcneilly.rustybeer.remote.RustyBeerBeerStyleService
import com.adammcneilly.rustybeer.remote.RustyBeerRetrofitAPI
import com.adammcneilly.rustybeer.theme.RustyBeerTheme

class MainActivity : ComponentActivity() {
    private val beerStyleViewModel: BeerStyleListViewModel by viewModels {
        Factory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RustyBeerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BeerStyleListScreen(
                        viewModel = beerStyleViewModel,
                    )
                }
            }
        }
    }

    companion object {

        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras,
            ): T {
                return BeerStyleListViewModel(
                    repository = OfflineFirstBeerStyleRepository(
                        remoteService = RustyBeerBeerStyleService(
                            api = RustyBeerRetrofitAPI.getDefault(),
                        ),
                    ),
                ) as T
            }
        }
    }
}
