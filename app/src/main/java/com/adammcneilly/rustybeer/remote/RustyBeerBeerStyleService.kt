package com.adammcneilly.rustybeer.remote

import com.adammcneilly.rustybeer.models.BeerStyle

/**
 * A concrete implementation of our [RemoteBeerStyleService] that returns styles from our given [api].
 */
class RustyBeerBeerStyleService(
    private val api: RustyBeerRetrofitAPI,
) : RemoteBeerStyleService {

    override suspend fun getBeerStyles(): List<BeerStyle> {
        return api.getBeerStyles()
    }
}
