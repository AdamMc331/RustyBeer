package com.adammcneilly.rustybeer.remote

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface RustyBeerRetrofitAPI {

    @GET("styles")
    suspend fun getBeerStyles(): List<NetworkBeerStyle>

    companion object {
        private const val BASE_URL = "https://rustybeer.herokuapp.com/"

        fun getDefault(): RustyBeerRetrofitAPI {
            return Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
                .create(RustyBeerRetrofitAPI::class.java)
        }
    }
}
