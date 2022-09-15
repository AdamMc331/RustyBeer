package com.adammcneilly.rustybeer.data

import com.adammcneilly.rustybeer.models.BeerStyle
import com.adammcneilly.rustybeer.remote.RemoteBeerStyleService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * An implementation of [BeerStyleRepository] that always displays information from a local data source,
 * but has the ability to sync with a remote data source.
 */
class OfflineFirstBeerStyleRepository @Inject constructor(
    private val remoteService: RemoteBeerStyleService,
) : BeerStyleRepository {

    override fun observeBeerStyles(): Flow<List<BeerStyle>> {
        // Eventually this will read from a DB
        // But for iterative development sake, we're showing the remote data
        return flow {
            emit(remoteService.getBeerStyles())
        }
    }
}
