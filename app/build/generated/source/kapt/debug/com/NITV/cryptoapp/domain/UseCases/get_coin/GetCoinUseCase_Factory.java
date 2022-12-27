// Generated by Dagger (https://dagger.dev).
package com.NITV.cryptoapp.domain.UseCases.get_coin;

import com.NITV.cryptoapp.domain.repository.CoinRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetCoinUseCase_Factory implements Factory<GetCoinUseCase> {
  private final Provider<CoinRepository> coinRepositoryProvider;

  public GetCoinUseCase_Factory(Provider<CoinRepository> coinRepositoryProvider) {
    this.coinRepositoryProvider = coinRepositoryProvider;
  }

  @Override
  public GetCoinUseCase get() {
    return newInstance(coinRepositoryProvider.get());
  }

  public static GetCoinUseCase_Factory create(Provider<CoinRepository> coinRepositoryProvider) {
    return new GetCoinUseCase_Factory(coinRepositoryProvider);
  }

  public static GetCoinUseCase newInstance(CoinRepository coinRepository) {
    return new GetCoinUseCase(coinRepository);
  }
}