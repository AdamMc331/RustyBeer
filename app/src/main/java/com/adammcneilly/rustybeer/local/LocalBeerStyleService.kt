package com.adammcneilly.rustybeer.local

import com.adammcneilly.rustybeer.models.BeerStyle
import kotlinx.coroutines.flow.Flow

/**
 * Interface defining the data contract for requesting information locally.
 */
interface LocalBeerStyleService {

    /**
     * NOTE: this returns OUR domain beer style, not a beer style specific
     * to some local data storage (aka room).
     */
    fun getBeerStyles(): Flow<List<BeerStyle>>
}
