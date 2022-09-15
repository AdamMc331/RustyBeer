package com.adammcneilly.rustybeer.di

import com.adammcneilly.rustybeer.remote.RemoteBeerStyleService
import com.adammcneilly.rustybeer.remote.RustyBeerBeerStyleService
import com.adammcneilly.rustybeer.remote.RustyBeerRetrofitAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun provideRemoteBeerStyleService(): RemoteBeerStyleService {
        return RustyBeerBeerStyleService(
            api = RustyBeerRetrofitAPI.getDefault(),
        )
    }
}
