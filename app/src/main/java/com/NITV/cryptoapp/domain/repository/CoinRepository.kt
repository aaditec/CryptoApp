package com.NITV.cryptoapp.domain.repository

import com.NITV.cryptoapp.data.remote.dto.CoinDetailDto
import com.NITV.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}