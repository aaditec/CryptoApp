// Generated by Dagger (https://dagger.dev).
package com.NITV.cryptoapp.presentations.coin_details;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoinDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static CoinDetailsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(CoinDetailsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final CoinDetailsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CoinDetailsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
