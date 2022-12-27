package com.NITV.cryptoapp.di

import com.NITV.cryptoapp.common.Constants
import com.NITV.cryptoapp.data.remote.CoinAPI
import com.NITV.cryptoapp.data.repository.CoinRepositoryImpl
import com.NITV.cryptoapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideCoinApi(): CoinAPI {
        return  Retrofit.Builder()
            .baseUrl(Constants.BaseUrl)
            .addConverterFactory( GsonConverterFactory.create())
            .build()
            .create(CoinAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(coinAPI: CoinAPI): CoinRepository {
        return CoinRepositoryImpl(coinAPI)
    }
}