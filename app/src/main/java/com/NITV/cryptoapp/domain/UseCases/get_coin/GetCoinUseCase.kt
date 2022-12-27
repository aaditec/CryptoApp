package com.NITV.cryptoapp.domain.UseCases.get_coin

import com.NITV.cryptoapp.common.Resource
import com.NITV.cryptoapp.data.remote.dto.toCoinDetails
import com.NITV.cryptoapp.domain.Model.CoinDetail
import com.NITV.cryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(private val coinRepository: CoinRepository) {

    /* invoke: returning any instances of the class without a method name
    flow:  used for better way to handle the stream of data asynchronously*/
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = coinRepository.getCoinById(coinId).toCoinDetails()
            emit(Resource.Success<CoinDetail>(coin))
        }
        catch (e: HttpException){
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occured"))
        }
        catch (e: IOException){
            emit(Resource.Error<CoinDetail>("couldn't reached server. check internet connection"))
        }
    }
}