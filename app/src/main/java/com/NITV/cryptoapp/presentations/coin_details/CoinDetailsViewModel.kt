package com.NITV.cryptoapp.presentations.coin_details

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.NITV.cryptoapp.common.Constants
import com.NITV.cryptoapp.common.Resource
import com.NITV.cryptoapp.domain.UseCases.get_coin.GetCoinUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel

class CoinDetailsViewModel @Inject constructor(
    private val getCoinUseCase: GetCoinUseCase,
    savedStateHandle: SavedStateHandle
    ): ViewModel() {
    private val _state = mutableStateOf(CoinDetailsState())
    val state: State<CoinDetailsState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_CoinID)?.let{ coinId ->
         getCoin(coinId)
        }
    }
      private fun getCoin(coinId: String) {
        getCoinUseCase(coinId).onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    _state.value = CoinDetailsState(isLoading = true)
                }

                is Resource.Success -> {
                    _state.value = CoinDetailsState(coins = result.data)
                }
                is Resource.Error -> {
                    _state.value =
                        CoinDetailsState(error = result.message ?: "An unexpected error occurred")
                }
            }
        }.launchIn(viewModelScope)
    }
}


