package com.adammcneilly.rustybeer.beerstyle

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier

@Composable
fun BeerStyleListScreen(
    viewModel: BeerStyleListViewModel,
    modifier: Modifier = Modifier,
) {
    val viewState = viewModel.state.collectAsState()

    BeerStyleListContent(
        viewState = viewState.value,
        modifier = modifier,
    )
}
