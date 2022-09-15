package com.adammcneilly.rustybeer.remote

import com.adammcneilly.rustybeer.models.BeerStyle

/**
 * This interface defines the data contract for requesting beer style information from a remote data
 * source.
 */
interface RemoteBeerStyleService {

    suspend fun getBeerStyles(): List<BeerStyle>
}
