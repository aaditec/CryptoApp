package com.NITV.cryptoapp.data.remote.dto

data class CoinDto(
    var id: String,
    var is_active: Boolean,
    var is_new: Boolean,
    var name: String,
    var rank: Int,
    var symbol: String,
    var type: String
)