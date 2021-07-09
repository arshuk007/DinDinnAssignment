package com.example.dindinn.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006#"}, d2 = {"Lcom/example/dindinn/activity/MainActivity;", "Lcom/example/dindinn/activity/BaseActivity;", "()V", "adapter", "Lcom/example/dindinn/adapter/OrderListAdapter;", "binding", "Lcom/example/dindinn/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/dindinn/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/dindinn/databinding/ActivityMainBinding;)V", "orderObserver", "Landroidx/lifecycle/Observer;", "Lcom/example/dindinn/network/Resource;", "Lcom/example/dindinn/model/response/OrderResponseModel;", "viewModel", "Lcom/example/dindinn/viewmodel/OrderViewModel;", "getViewModel", "()Lcom/example/dindinn/viewmodel/OrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getData", "", "handleOrderDataSuccess", "data", "Ljava/util/ArrayList;", "Lcom/example/dindinn/model/Order;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "refreshListInEveryHalfMinute", "setupListeners", "showFailure", "message", "", "app_debug"})
public final class MainActivity extends com.example.dindinn.activity.BaseActivity {
    public com.example.dindinn.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.dindinn.adapter.OrderListAdapter adapter;
    private final androidx.lifecycle.Observer<com.example.dindinn.network.Resource<com.example.dindinn.model.response.OrderResponseModel>> orderObserver = null;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dindinn.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.dindinn.databinding.ActivityMainBinding p0) {
    }
    
    private final com.example.dindinn.viewmodel.OrderViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * to fetch the initial orders
     */
    private final void getData() {
    }
    
    /**
     * set listeners
     */
    private final void setupListeners() {
    }
    
    private final void handleOrderDataSuccess(java.util.ArrayList<com.example.dindinn.model.Order> data) {
    }
    
    /**
     * show failure message
     */
    private final void showFailure(java.lang.String message) {
    }
    
    /**
     * refresh list for every half minute
     * to handle the timer effectively
     */
    private final void refreshListInEveryHalfMinute() {
    }
}