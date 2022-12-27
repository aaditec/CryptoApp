package com.NITV.cryptoapp.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bY\b\u0086\b\u0018\u00002\u00020\u0001B\u00d7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\"\u00a2\u0006\u0002\u0010#J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u000eH\u00c6\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0019H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u00c6\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010H\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\"H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0007H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0007H\u00c6\u0003J\t\u0010t\u001a\u00020\u0007H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0002\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\"H\u00c6\u0001J\u0013\u0010w\u001a\u00020\u00072\b\u0010x\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010y\u001a\u00020\u0019H\u00d6\u0001J\t\u0010z\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010\'R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010\'R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010-\"\u0004\b4\u0010/R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010-\"\u0004\b5\u0010/R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010%\"\u0004\b7\u0010\'R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010\'R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010\'R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010%\"\u0004\bE\u0010\'R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010\'R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010\'R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010%\"\u0004\bQ\u0010\'R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010%\"\u0004\bS\u0010\'R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010=\"\u0004\bU\u0010?R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010%\"\u0004\bY\u0010\'R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]\u00a8\u0006{"}, d2 = {"Lcom/NITV/cryptoapp/data/remote/dto/CoinDetailDto;", "", "description", "", "development_status", "first_data_at", "hardware_wallet", "", "hash_algorithm", "id", "is_active", "is_new", "last_data_at", "links", "Lcom/NITV/cryptoapp/data/remote/dto/Links;", "links_extended", "", "Lcom/NITV/cryptoapp/data/remote/dto/LinksExtended;", "logo", "message", "name", "open_source", "org_structure", "proof_type", "rank", "", "started_at", "symbol", "tags", "Lcom/NITV/cryptoapp/data/remote/dto/Tag;", "team", "Lcom/NITV/cryptoapp/data/remote/dto/TeamMember;", "type", "whitepaper", "Lcom/NITV/cryptoapp/data/remote/dto/Whitepaper;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/NITV/cryptoapp/data/remote/dto/Links;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/NITV/cryptoapp/data/remote/dto/Whitepaper;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDevelopment_status", "setDevelopment_status", "getFirst_data_at", "setFirst_data_at", "getHardware_wallet", "()Z", "setHardware_wallet", "(Z)V", "getHash_algorithm", "setHash_algorithm", "getId", "setId", "set_active", "set_new", "getLast_data_at", "setLast_data_at", "getLinks", "()Lcom/NITV/cryptoapp/data/remote/dto/Links;", "setLinks", "(Lcom/NITV/cryptoapp/data/remote/dto/Links;)V", "getLinks_extended", "()Ljava/util/List;", "setLinks_extended", "(Ljava/util/List;)V", "getLogo", "setLogo", "getMessage", "setMessage", "getName", "setName", "getOpen_source", "setOpen_source", "getOrg_structure", "setOrg_structure", "getProof_type", "setProof_type", "getRank", "()I", "setRank", "(I)V", "getStarted_at", "setStarted_at", "getSymbol", "setSymbol", "getTags", "setTags", "getTeam", "setTeam", "getType", "setType", "getWhitepaper", "()Lcom/NITV/cryptoapp/data/remote/dto/Whitepaper;", "setWhitepaper", "(Lcom/NITV/cryptoapp/data/remote/dto/Whitepaper;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class CoinDetailDto {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String development_status;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String first_data_at;
    private boolean hardware_wallet;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hash_algorithm;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    private boolean is_active;
    private boolean is_new;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String last_data_at;
    @org.jetbrains.annotations.NotNull()
    private com.NITV.cryptoapp.data.remote.dto.Links links;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.NITV.cryptoapp.data.remote.dto.LinksExtended> links_extended;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String logo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private boolean open_source;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String org_structure;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String proof_type;
    private int rank;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String started_at;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String symbol;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.NITV.cryptoapp.data.remote.dto.Tag> tags;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.NITV.cryptoapp.data.remote.dto.TeamMember> team;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull()
    private com.NITV.cryptoapp.data.remote.dto.Whitepaper whitepaper;
    
    @org.jetbrains.annotations.NotNull()
    public final com.NITV.cryptoapp.data.remote.dto.CoinDetailDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String development_status, @org.jetbrains.annotations.NotNull()
    java.lang.String first_data_at, boolean hardware_wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String hash_algorithm, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean is_active, boolean is_new, @org.jetbrains.annotations.NotNull()
    java.lang.String last_data_at, @org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.dto.Links links, @org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.LinksExtended> links_extended, @org.jetbrains.annotations.NotNull()
    java.lang.String logo, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean open_source, @org.jetbrains.annotations.NotNull()
    java.lang.String org_structure, @org.jetbrains.annotations.NotNull()
    java.lang.String proof_type, int rank, @org.jetbrains.annotations.NotNull()
    java.lang.String started_at, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.Tag> tags, @org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.TeamMember> team, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.dto.Whitepaper whitepaper) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CoinDetailDto(@org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String development_status, @org.jetbrains.annotations.NotNull()
    java.lang.String first_data_at, boolean hardware_wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String hash_algorithm, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean is_active, boolean is_new, @org.jetbrains.annotations.NotNull()
    java.lang.String last_data_at, @org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.dto.Links links, @org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.LinksExtended> links_extended, @org.jetbrains.annotations.NotNull()
    java.lang.String logo, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean open_source, @org.jetbrains.annotations.NotNull()
    java.lang.String org_structure, @org.jetbrains.annotations.NotNull()
    java.lang.String proof_type, int rank, @org.jetbrains.annotations.NotNull()
    java.lang.String started_at, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol, @org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.Tag> tags, @org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.TeamMember> team, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.dto.Whitepaper whitepaper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDevelopment_status() {
        return null;
    }
    
    public final void setDevelopment_status(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirst_data_at() {
        return null;
    }
    
    public final void setFirst_data_at(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getHardware_wallet() {
        return false;
    }
    
    public final void setHardware_wallet(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHash_algorithm() {
        return null;
    }
    
    public final void setHash_algorithm(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean is_active() {
        return false;
    }
    
    public final void set_active(boolean p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean is_new() {
        return false;
    }
    
    public final void set_new(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast_data_at() {
        return null;
    }
    
    public final void setLast_data_at(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.NITV.cryptoapp.data.remote.dto.Links component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.NITV.cryptoapp.data.remote.dto.Links getLinks() {
        return null;
    }
    
    public final void setLinks(@org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.dto.Links p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.NITV.cryptoapp.data.remote.dto.LinksExtended> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.NITV.cryptoapp.data.remote.dto.LinksExtended> getLinks_extended() {
        return null;
    }
    
    public final void setLinks_extended(@org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.LinksExtended> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogo() {
        return null;
    }
    
    public final void setLogo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getOpen_source() {
        return false;
    }
    
    public final void setOpen_source(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrg_structure() {
        return null;
    }
    
    public final void setOrg_structure(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProof_type() {
        return null;
    }
    
    public final void setProof_type(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getRank() {
        return 0;
    }
    
    public final void setRank(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStarted_at() {
        return null;
    }
    
    public final void setStarted_at(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSymbol() {
        return null;
    }
    
    public final void setSymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.NITV.cryptoapp.data.remote.dto.Tag> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.NITV.cryptoapp.data.remote.dto.Tag> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.Tag> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.NITV.cryptoapp.data.remote.dto.TeamMember> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.NITV.cryptoapp.data.remote.dto.TeamMember> getTeam() {
        return null;
    }
    
    public final void setTeam(@org.jetbrains.annotations.NotNull()
    java.util.List<com.NITV.cryptoapp.data.remote.dto.TeamMember> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.NITV.cryptoapp.data.remote.dto.Whitepaper component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.NITV.cryptoapp.data.remote.dto.Whitepaper getWhitepaper() {
        return null;
    }
    
    public final void setWhitepaper(@org.jetbrains.annotations.NotNull()
    com.NITV.cryptoapp.data.remote.dto.Whitepaper p0) {
    }
}