package com.adammcneilly.rustybeer.remote

import com.adammcneilly.rustybeer.models.BeerStyle

/**
 * A concrete implementation of our [RemoteBeerStyleService] that returns styles from our given [api].
 */
class RustyBeerBeerStyleService(
    private val api: RustyBeerRetrofitAPI,
) : RemoteBeerStyleService {

    override suspend fun getBeerStyles(): List<BeerStyle> {
        // Since this a quick demo app,
        // if the network request fails, we'll just return an empty list
        // to prevent the app from crashing.
        return try {
            api.getBeerStyles().map(NetworkBeerStyle::toBeerStyle)
        } catch (e: Exception) {
            emptyList()
        }
    }
}
