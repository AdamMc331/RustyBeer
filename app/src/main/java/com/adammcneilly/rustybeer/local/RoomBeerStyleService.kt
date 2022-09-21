package com.adammcneilly.rustybeer.local

import com.adammcneilly.rustybeer.models.BeerStyle
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * This is a concrete implementation of a [LocalBeerStyleService] that requests the information
 * from the supplied [beerStyleDAO].
 */
class RoomBeerStyleService @Inject constructor(
    private val beerStyleDAO: BeerStyleDAO,
) : LocalBeerStyleService {

    override fun getBeerStyles(): Flow<List<BeerStyle>> {
        return beerStyleDAO
            .getBeerStyles()
            .map { localBeerStyleList ->
                localBeerStyleList.map(LocalBeerStyle::toBeerStyle)
            }
    }
}
