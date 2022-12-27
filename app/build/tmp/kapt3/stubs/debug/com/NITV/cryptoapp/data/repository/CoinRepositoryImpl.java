package com.NITV.cryptoapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/NITV/cryptoapp/data/repository/CoinRepositoryImpl;", "Lcom/NITV/cryptoapp/domain/repository/CoinRepository;", "coinAPI", "Lcom/NITV/cryptoapp/data/remote/CoinAPI;", "(Lcom/NITV/cryptoapp/data/remote/CoinAPI;)V", "getCoinById", "Lcom/NITV/cryptoapp/data/remote/dto/CoinDetailDto;", "coinId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoins", "", "Lcom/NITV/cryptoapp/data/remote/dto/CoinDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CoinRepositoryImpl implements com.NITV.cryptoapp.domain.repository.CoinRepository {
    private final com.NITV.cryptoapp.data.remote.CoinAPI coinAPI = null;
    
    @javax.inject.Inject()
    public CoinRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.CoinAPI coinAPI) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCoins(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.NITV.cryptoapp.data.remote.dto.CoinDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCoinById(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.NITV.cryptoapp.data.remote.dto.CoinDetailDto> continuation) {
        return null;
    }
}