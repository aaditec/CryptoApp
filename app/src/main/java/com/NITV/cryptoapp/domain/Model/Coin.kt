package com.NITV.cryptoapp.domain.Model

import com.NITV.cryptoapp.data.remote.dto.CoinDto

data class Coin(
    var id: String,
    var is_active: Boolean,
    var name: String,
    var rank: Int,
    var symbol: String
    )
fun CoinDto.toCoin(): Coin {
            return Coin(
                id = id,
                is_active = is_active,
                name = name,
                rank = rank,
                symbol= symbol
    )
}


