package com.NITV.cryptoapp.presentations.coin_list

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.NITV.cryptoapp.common.Resource
import com.NITV.cryptoapp.domain.UseCases.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(private val getCoinsUseCase: GetCoinsUseCase): ViewModel() {
    private val _state = mutableStateOf(CoinListState())
    val state : State<CoinListState> = _state

    init {
        getCoins()
        println("get coin "+ getCoins())
    }
     private fun getCoins(){
        getCoinsUseCase().onEach {
            result ->
            when(result){
                is Resource.Loading ->{
                    _state.value = CoinListState(isLoading = true)
                }
                is Resource.Success ->{
                    _state.value = CoinListState(coins = result.data ?: emptyList())
                }
                is Resource.Error ->{
                    _state.value = CoinListState(error = result.message ?: "An unexpected error occurred")
                }
            }
        }.launchIn(viewModelScope)
    }


}