package com.NITV.cryptoapp.presentations

sealed class Screen(val route: String){
    object CoinListScreen: Screen("coin_list")
    object CoinDetailsScreen: Screen("coin_details_screen")
}
