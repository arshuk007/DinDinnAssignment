package com.example.dindinn.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002#$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/example/dindinn/adapter/OrderListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/dindinn/adapter/OrderListAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "items", "Ljava/util/ArrayList;", "Lcom/example/dindinn/model/Order;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "myClickListener", "Lcom/example/dindinn/adapter/OrderListAdapter$MyClickListener;", "getMyClickListener", "()Lcom/example/dindinn/adapter/OrderListAdapter$MyClickListener;", "setMyClickListener", "(Lcom/example/dindinn/adapter/OrderListAdapter$MyClickListener;)V", "sound", "Landroid/net/Uri;", "getSound", "()Landroid/net/Uri;", "setSound", "(Landroid/net/Uri;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "MyClickListener", "MyViewHolder", "app_debug"})
public final class OrderListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.dindinn.adapter.OrderListAdapter.MyViewHolder> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.example.dindinn.model.Order> items = null;
    private android.view.LayoutInflater layoutInflater;
    public com.example.dindinn.adapter.OrderListAdapter.MyClickListener myClickListener;
    @org.jetbrains.annotations.NotNull()
    private android.net.Uri sound;
    
    public OrderListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.dindinn.model.Order> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dindinn.adapter.OrderListAdapter.MyClickListener getMyClickListener() {
        return null;
    }
    
    public final void setMyClickListener(@org.jetbrains.annotations.NotNull()
    com.example.dindinn.adapter.OrderListAdapter.MyClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getSound() {
        return null;
    }
    
    public final void setSound(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.dindinn.adapter.OrderListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.dindinn.adapter.OrderListAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.dindinn.adapter.OrderListAdapter.MyClickListener myClickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/dindinn/adapter/OrderListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/dindinn/databinding/ItemOrderBinding;", "(Lcom/example/dindinn/adapter/OrderListAdapter;Lcom/example/dindinn/databinding/ItemOrderBinding;)V", "getBinding", "()Lcom/example/dindinn/databinding/ItemOrderBinding;", "player", "Landroid/media/MediaPlayer;", "getPlayer", "()Landroid/media/MediaPlayer;", "setPlayer", "(Landroid/media/MediaPlayer;)V", "timer", "Landroid/os/CountDownTimer;", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.dindinn.databinding.ItemOrderBinding binding = null;
        @org.jetbrains.annotations.Nullable()
        private android.os.CountDownTimer timer;
        @org.jetbrains.annotations.NotNull()
        private android.media.MediaPlayer player;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.dindinn.databinding.ItemOrderBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.dindinn.databinding.ItemOrderBinding getBinding() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.CountDownTimer getTimer() {
            return null;
        }
        
        public final void setTimer(@org.jetbrains.annotations.Nullable()
        android.os.CountDownTimer p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.media.MediaPlayer getPlayer() {
            return null;
        }
        
        public final void setPlayer(@org.jetbrains.annotations.NotNull()
        android.media.MediaPlayer p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/dindinn/adapter/OrderListAdapter$MyClickListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface MyClickListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
        android.view.View view);
    }
}