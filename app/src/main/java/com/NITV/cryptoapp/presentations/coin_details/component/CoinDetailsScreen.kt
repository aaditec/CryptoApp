package com.NITV.cryptoapp.presentations.coin_details.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import com.NITV.cryptoapp.common.Constants
import com.google.accompanist.flowlayout.FlowRow
import com.NITV.cryptoapp.presentations.coin_details.CoinDetailsViewModel


@Composable
fun CoinDetailsScreen(
    coinDetailsViewModel: CoinDetailsViewModel = hiltViewModel()
) {
    val state = coinDetailsViewModel.state.value

    Box(modifier = Modifier.fillMaxSize()) {
        state.coins?.let { coins ->
            LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(20.dp)) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {

                        Text(
                            text = "${coins.rank}. ${coins.name} (${coins.symbol})",
                            style = MaterialTheme.typography.h2,
                            modifier = Modifier.weight(8f)
                        )

                        Text(
                            text = if (coins.isActive) " active" else "inactive",
                            color = if (coins.isActive) Color.Green else Color.Red,
                            fontStyle = FontStyle.Italic,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .align(CenterVertically)
                                .weight(2f)
                        )

                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(text = coins.description,
                    style = MaterialTheme.typography.body2)

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Tags",
                        style = MaterialTheme.typography.h3)

                    Spacer(modifier = Modifier.height(15.dp))
                    
                    FlowRow(mainAxisSpacing = 10.dp,
                    crossAxisSpacing = 10.dp,
                    modifier = Modifier.fillMaxWidth()) {

                        coins.tags.forEach{tag ->
                            CoinTag(tag = tag)
                        }
                    }

                    Spacer(modifier = Modifier.height(15.dp))
                        Text(text = "Team Members",
                        style = MaterialTheme.typography.h3)

                    Spacer(modifier = Modifier.height(15.dp))

                }
                items(coins.team){ teamMember ->
                    TeamListItems(teamMember = teamMember, modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                    )
                    Divider()
                }
            }
        }
        if (state.error.isNotBlank()) {
            Text(
                text = state.error,
                color = MaterialTheme.colors.error,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .align(Alignment.Center)
            )
        }
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}