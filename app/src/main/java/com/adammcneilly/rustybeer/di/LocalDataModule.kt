package com.adammcneilly.rustybeer.di

import android.content.Context
import com.adammcneilly.rustybeer.local.BeerStyleDAO
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
    fun providesBeerStyleDAO(
        database: RustyBeerDatabase,
    ): BeerStyleDAO {
        return database.beerStyleDAO()
    }
}
