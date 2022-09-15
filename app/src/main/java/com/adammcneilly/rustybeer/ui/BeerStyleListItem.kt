package com.adammcneilly.rustybeer.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.adammcneilly.rustybeer.models.BeerStyle

@Composable
fun BeerStyleListItem(
    beerStyle: BeerStyle,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(16.dp),
    ) {
        Text(
            text = beerStyle.name.orEmpty(),
        )
    }
}
