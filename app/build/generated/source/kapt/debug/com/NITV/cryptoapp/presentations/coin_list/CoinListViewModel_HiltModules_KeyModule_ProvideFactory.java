// Generated by Dagger (https://dagger.dev).
package com.NITV.cryptoapp.presentations.coin_list;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoinListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static CoinListViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(CoinListViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final CoinListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CoinListViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
