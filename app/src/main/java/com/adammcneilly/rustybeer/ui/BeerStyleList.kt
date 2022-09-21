package com.adammcneilly.rustybeer.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adammcneilly.rustybeer.models.BeerStyle

@Composable
fun BeerStyleList(
    beerStyles: List<BeerStyle>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
    ) {
        items(beerStyles) { beerStyle ->
            BeerStyleListItem(beerStyle = beerStyle)

            Divider()
        }
    }
}
