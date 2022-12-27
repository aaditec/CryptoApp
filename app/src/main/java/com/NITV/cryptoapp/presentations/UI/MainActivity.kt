package com.NITV.cryptoapp.presentations.UI

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.NITV.cryptoapp.common.Constants
import com.NITV.cryptoapp.presentations.Screen
import com.NITV.cryptoapp.presentations.coin_details.CoinDetailsViewModel
import com.NITV.cryptoapp.presentations.coin_details.component.CoinDetailsScreen
import com.NITV.cryptoapp.presentations.coin_list.CoinListViewModel
import com.NITV.cryptoapp.presentations.coin_list.component.CoinListScreen
import com.NITV.cryptoapp.presentations.theme.CryptoAppTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route){

                        composable(
                            route = Screen.CoinListScreen.route){
                            CoinListScreen(navController)
                        }
                        composable(
                            route = Screen.CoinDetailsScreen.route + "/{coinId}"){
                            CoinDetailsScreen()
                        }

                    }
                }
            }
        }
    }
}