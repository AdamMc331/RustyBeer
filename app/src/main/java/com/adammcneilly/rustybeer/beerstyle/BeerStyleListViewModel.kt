package com.adammcneilly.rustybeer.beerstyle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adammcneilly.rustybeer.data.BeerStyleRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BeerStyleListViewModel(
    repository: BeerStyleRepository,
) : ViewModel() {

    private val _state = MutableStateFlow(BeerStyleListViewState())
    val state = _state.asStateFlow()

    init {
        repository
            .observeBeerStyles()
            .onEach { beerStyles ->
                _state.update { currentState ->
                    currentState.copy(
                        isLoading = false,
                        beerStyles = beerStyles,
                    )
                }
            }
            .launchIn(viewModelScope)
    }
}
