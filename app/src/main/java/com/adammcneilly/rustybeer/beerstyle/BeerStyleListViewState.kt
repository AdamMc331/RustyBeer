package com.adammcneilly.rustybeer.beerstyle

import com.adammcneilly.rustybeer.models.BeerStyle

data class BeerStyleListViewState(
    val isLoading: Boolean = true,
    val beerStyles: List<BeerStyle>? = null,
    val errorMessage: String? = null,
)
