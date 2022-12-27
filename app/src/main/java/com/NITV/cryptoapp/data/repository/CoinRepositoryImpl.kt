package com.NITV.cryptoapp.data.repository

import com.NITV.cryptoapp.data.remote.CoinAPI
import com.NITV.cryptoapp.data.remote.dto.CoinDetailDto
import com.NITV.cryptoapp.data.remote.dto.CoinDto
import com.NITV.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val coinAPI: CoinAPI): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
       return coinAPI.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return coinAPI.getCoinById(coinId)
    }
}