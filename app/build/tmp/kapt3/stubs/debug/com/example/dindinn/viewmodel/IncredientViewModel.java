package com.example.dindinn.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/dindinn/viewmodel/IncredientViewModel;", "Landroidx/lifecycle/ViewModel;", "usecase", "Lcom/example/dindinn/usecase/IncredientUsecase;", "(Lcom/example/dindinn/usecase/IncredientUsecase;)V", "getIncredients", "Landroidx/lifecycle/LiveData;", "Lcom/example/dindinn/network/Resource;", "Lcom/example/dindinn/model/response/IncredientsResponseModel;", "app_debug"})
public final class IncredientViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.dindinn.usecase.IncredientUsecase usecase = null;
    
    public IncredientViewModel(@org.jetbrains.annotations.NotNull()
    com.example.dindinn.usecase.IncredientUsecase usecase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.dindinn.network.Resource<com.example.dindinn.model.response.IncredientsResponseModel>> getIncredients() {
        return null;
    }
}