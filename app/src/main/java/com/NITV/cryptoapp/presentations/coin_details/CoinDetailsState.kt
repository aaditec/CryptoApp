package com.NITV.cryptoapp.presentations.coin_details

import com.NITV.cryptoapp.domain.Model.CoinDetail

data class CoinDetailsState(
    val isLoading: Boolean = false,
    val coins : CoinDetail?= null,
    val error: String = ""
)
