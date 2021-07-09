package com.example.dindinn.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/dindinn/network/ResponseHandler;", "", "()V", "handleFail", "Lcom/example/dindinn/network/Resource;", "T", "msg", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/example/dindinn/network/Resource;", "handleSuccess", "(Ljava/lang/Object;)Lcom/example/dindinn/network/Resource;", "app_debug"})
public class ResponseHandler {
    
    public ResponseHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.dindinn.network.Resource<T> handleSuccess(@org.jetbrains.annotations.Nullable()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.dindinn.network.Resource<T> handleFail(@org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    T data) {
        return null;
    }
}