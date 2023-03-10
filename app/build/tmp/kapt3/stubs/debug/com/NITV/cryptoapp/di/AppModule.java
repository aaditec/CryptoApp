package com.NITV.cryptoapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/NITV/cryptoapp/di/AppModule;", "", "()V", "provideCoinApi", "Lcom/NITV/cryptoapp/data/remote/CoinAPI;", "provideCoinRepository", "Lcom/NITV/cryptoapp/domain/repository/CoinRepository;", "coinAPI", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.NITV.cryptoapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.NITV.cryptoapp.data.remote.CoinAPI provideCoinApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.NITV.cryptoapp.domain.repository.CoinRepository provideCoinRepository(@org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.CoinAPI coinAPI) {
        return null;
    }
}