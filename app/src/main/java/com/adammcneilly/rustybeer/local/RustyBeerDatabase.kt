package com.adammcneilly.rustybeer.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [LocalBeerStyle::class],
    version = 1,
)
abstract class RustyBeerDatabase : RoomDatabase() {
    abstract fun beerStyleDAO(): BeerStyleDAO

    companion object {

        fun create(appContext: Context): RustyBeerDatabase {
            return Room.databaseBuilder(
                appContext,
                RustyBeerDatabase::class.java,
                "rusty-beer.db",
            ).build()
        }
    }
}
