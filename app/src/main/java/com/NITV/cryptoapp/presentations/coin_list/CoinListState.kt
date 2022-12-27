package com.NITV.cryptoapp.presentations.coin_list

import com.NITV.cryptoapp.domain.Model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins : List<Coin> = emptyList(),
    val error: String = ""
)
