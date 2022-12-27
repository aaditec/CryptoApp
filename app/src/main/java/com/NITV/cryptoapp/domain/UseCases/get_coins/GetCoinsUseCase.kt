package com.NITV.cryptoapp.domain.UseCases.get_coins

import com.NITV.cryptoapp.common.Resource
import com.NITV.cryptoapp.domain.Model.Coin
import com.NITV.cryptoapp.domain.Model.toCoin
import com.NITV.cryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(private val coinRepository: CoinRepository) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = coinRepository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        }
        catch (e: HttpException){
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occured"))
        }
        catch (e: IOException){
            emit(Resource.Error<List<Coin>>("couldn't reached server. check internet connection"))
        }
    }
}