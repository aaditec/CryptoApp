package com.NITV.cryptoapp.data.remote

import com.NITV.cryptoapp.data.remote.dto.CoinDetailDto
import com.NITV.cryptoapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinAPI {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path(value = "coinId") coinId: String): CoinDetailDto
}