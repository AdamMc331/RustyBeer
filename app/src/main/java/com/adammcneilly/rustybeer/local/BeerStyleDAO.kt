package com.adammcneilly.rustybeer.local

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BeerStyleDAO {

    @Query("SELECT * FROM LocalBeerStyle")
    fun getBeerStyles(): Flow<List<LocalBeerStyle>>
}
