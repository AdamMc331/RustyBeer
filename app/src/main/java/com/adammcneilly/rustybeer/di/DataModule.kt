package com.adammcneilly.rustybeer.di

import com.adammcneilly.rustybeer.data.BeerStyleRepository
import com.adammcneilly.rustybeer.data.OfflineFirstBeerStyleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindBeerStyleRepository(
        repository: OfflineFirstBeerStyleRepository,
    ): BeerStyleRepository
}
