package com.adammcneilly.rustybeer.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BeerStyleDAO {

    @Query("SELECT * FROM LocalBeerStyle")
    fun getBeerStyles(): Flow<List<LocalBeerStyle>>

    @Insert(
        onConflict = OnConflictStrategy.REPLACE,
    )
    fun insertBeerStyles(vararg beerStyle: LocalBeerStyle)
}
