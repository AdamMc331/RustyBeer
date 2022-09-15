package com.adammcneilly.rustybeer.beerstyle

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun BeerStyleListScreen(
    modifier: Modifier = Modifier,
    viewModel: BeerStyleListViewModel = hiltViewModel(),
) {
    val viewState = viewModel.state.collectAsState()

    BeerStyleListContent(
        viewState = viewState.value,
        modifier = modifier,
    )
}
