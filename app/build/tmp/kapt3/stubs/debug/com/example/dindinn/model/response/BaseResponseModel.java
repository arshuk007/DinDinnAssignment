package com.example.dindinn.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/dindinn/model/response/BaseResponseModel;", "", "()V", "status", "Lcom/example/dindinn/model/Status;", "getStatus", "()Lcom/example/dindinn/model/Status;", "setStatus", "(Lcom/example/dindinn/model/Status;)V", "app_debug"})
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponseModel {
    @org.jetbrains.annotations.Nullable()
    private com.example.dindinn.model.Status status;
    
    public BaseResponseModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.dindinn.model.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    com.example.dindinn.model.Status p0) {
    }
}