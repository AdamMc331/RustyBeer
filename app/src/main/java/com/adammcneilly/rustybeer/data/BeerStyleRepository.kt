package com.adammcneilly.rustybeer.data

import com.adammcneilly.rustybeer.models.BeerStyle
import kotlinx.coroutines.flow.Flow

/**
 * This interface defines the data contract for requesting beer style information. In practice,
 * the implementation of this interface should combine data from both local and remote sources.
 */
interface BeerStyleRepository {

    fun observeBeerStyles(): Flow<List<BeerStyle>>
}
