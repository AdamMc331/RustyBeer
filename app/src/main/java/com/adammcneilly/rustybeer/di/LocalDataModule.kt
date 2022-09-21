package com.adammcneilly.rustybeer.di

import android.content.Context
import com.adammcneilly.rustybeer.local.LocalBeerStyleService
import com.adammcneilly.rustybeer.local.RoomBeerStyleService
import com.adammcneilly.rustybeer.local.RustyBeerDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {

    @Provides
    fun providesDatabase(
        @ApplicationContext applicationContext: Context,
    ): RustyBeerDatabase {
        return RustyBeerDatabase.create(applicationContext)
    }

    @Provides
    fun providesLocalBeerStyleService(
        database: RustyBeerDatabase,
    ): LocalBeerStyleService {
        return RoomBeerStyleService(
            beerStyleDAO = database.beerStyleDAO(),
        )
    }
}
