package com.adammcneilly.rustybeer.data

import com.adammcneilly.rustybeer.local.LocalBeerStyleService
import com.adammcneilly.rustybeer.models.BeerStyle
import com.adammcneilly.rustybeer.remote.RemoteBeerStyleService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * An implementation of [BeerStyleRepository] that always displays information from a local data source,
 * but has the ability to sync with a remote data source.
 */
class OfflineFirstBeerStyleRepository @Inject constructor(
    private val localService: LocalBeerStyleService,
    private val remoteService: RemoteBeerStyleService,
) : BeerStyleRepository {

    override fun observeBeerStyles(): Flow<List<BeerStyle>> {
        return localService.getBeerStyles()
    }
}
