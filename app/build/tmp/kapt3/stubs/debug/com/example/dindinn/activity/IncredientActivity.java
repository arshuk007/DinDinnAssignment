package com.example.dindinn.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/example/dindinn/activity/IncredientActivity;", "Lcom/example/dindinn/activity/BaseActivity;", "()V", "binding", "Lcom/example/dindinn/databinding/ActivityIncredientBinding;", "getBinding", "()Lcom/example/dindinn/databinding/ActivityIncredientBinding;", "setBinding", "(Lcom/example/dindinn/databinding/ActivityIncredientBinding;)V", "observer", "Landroidx/lifecycle/Observer;", "Lcom/example/dindinn/network/Resource;", "Lcom/example/dindinn/model/response/IncredientsResponseModel;", "viewModel", "Lcom/example/dindinn/viewmodel/IncredientViewModel;", "getViewModel", "()Lcom/example/dindinn/viewmodel/IncredientViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getIncredientData", "", "handleOrderDataSuccess", "data", "Ljava/util/ArrayList;", "Lcom/example/dindinn/model/IncredientCategory;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showFailure", "message", "", "app_debug"})
public final class IncredientActivity extends com.example.dindinn.activity.BaseActivity {
    public com.example.dindinn.databinding.ActivityIncredientBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    /**
     * observer for the incredient response
     */
    private final androidx.lifecycle.Observer<com.example.dindinn.network.Resource<com.example.dindinn.model.response.IncredientsResponseModel>> observer = null;
    private java.util.HashMap _$_findViewCache;
    
    public IncredientActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dindinn.databinding.ActivityIncredientBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.dindinn.databinding.ActivityIncredientBinding p0) {
    }
    
    private final com.example.dindinn.viewmodel.IncredientViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * to fetch the initial orders
     */
    private final void getIncredientData() {
    }
    
    /**
     * setup view pager with data
     */
    private final void handleOrderDataSuccess(java.util.ArrayList<com.example.dindinn.model.IncredientCategory> data) {
    }
    
    /**
     * show failure message
     */
    private final void showFailure(java.lang.String message) {
    }
}