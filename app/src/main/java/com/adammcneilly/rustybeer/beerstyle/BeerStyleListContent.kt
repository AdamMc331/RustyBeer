package com.adammcneilly.rustybeer.beerstyle

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adammcneilly.rustybeer.ui.BeerStyleList

@Composable
fun BeerStyleListContent(
    viewState: BeerStyleListViewState,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        if (viewState.isLoading) {
            // Show loading indicator
        }

        if (viewState.beerStyles != null) {
            BeerStyleList(
                viewState.beerStyles,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}