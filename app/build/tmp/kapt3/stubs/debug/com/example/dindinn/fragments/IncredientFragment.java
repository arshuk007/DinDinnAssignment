package com.example.dindinn.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/example/dindinn/fragments/IncredientFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/dindinn/databinding/FragmentIncredientBinding;", "getBinding", "()Lcom/example/dindinn/databinding/FragmentIncredientBinding;", "setBinding", "(Lcom/example/dindinn/databinding/FragmentIncredientBinding;)V", "items", "Ljava/util/ArrayList;", "Lcom/example/dindinn/model/IncredientItem;", "viewModel", "Lcom/example/dindinn/viewmodel/IncredientViewModel;", "getViewModel", "()Lcom/example/dindinn/viewmodel/IncredientViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setData", "Companion", "app_debug"})
public final class IncredientFragment extends androidx.fragment.app.Fragment {
    public com.example.dindinn.databinding.FragmentIncredientBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.ArrayList<com.example.dindinn.model.IncredientItem> items;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.dindinn.fragments.IncredientFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public IncredientFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dindinn.databinding.FragmentIncredientBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.dindinn.databinding.FragmentIncredientBinding p0) {
    }
    
    private final com.example.dindinn.viewmodel.IncredientViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    /**
     * set data to recyclerview
     */
    private final void setData() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/dindinn/fragments/IncredientFragment$Companion;", "", "()V", "newInstance", "Lcom/example/dindinn/fragments/IncredientFragment;", "items", "Ljava/util/ArrayList;", "Lcom/example/dindinn/model/IncredientItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.dindinn.fragments.IncredientFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.example.dindinn.model.IncredientItem> items) {
            return null;
        }
    }
}