// Generated by Dagger (https://dagger.dev).
package com.NITV.cryptoapp.presentations.coin_details;

import androidx.lifecycle.SavedStateHandle;
import com.NITV.cryptoapp.domain.UseCases.get_coin.GetCoinUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoinDetailsViewModel_Factory implements Factory<CoinDetailsViewModel> {
  private final Provider<GetCoinUseCase> getCoinUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public CoinDetailsViewModel_Factory(Provider<GetCoinUseCase> getCoinUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getCoinUseCaseProvider = getCoinUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public CoinDetailsViewModel get() {
    return newInstance(getCoinUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static CoinDetailsViewModel_Factory create(Provider<GetCoinUseCase> getCoinUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new CoinDetailsViewModel_Factory(getCoinUseCaseProvider, savedStateHandleProvider);
  }

  public static CoinDetailsViewModel newInstance(GetCoinUseCase getCoinUseCase,
      SavedStateHandle savedStateHandle) {
    return new CoinDetailsViewModel(getCoinUseCase, savedStateHandle);
  }
}
