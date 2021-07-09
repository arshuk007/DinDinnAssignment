package com.example.dindinn.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J&\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/example/dindinn/utils/AppUtils;", "", "()V", "calculateTimeDifference", "", "startDate", "endDate", "inputPattern", "getCurrentSecond", "getElapsedMinutes", "", "getException", "Lcom/example/dindinn/network/Response$Failure;", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getFormattedDate", "time", "outputPattern", "getTimeDifferenceInMilli", "", "hideKeyboard", "", "hostActivity", "Landroidx/fragment/app/FragmentActivity;", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.dindinn.utils.AppUtils INSTANCE = null;
    
    private AppUtils() {
        super();
    }
    
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dindinn.network.Response.Failure getException(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return null;
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity hostActivity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFormattedDate(@org.jetbrains.annotations.Nullable()
    java.lang.String time, @org.jetbrains.annotations.Nullable()
    java.lang.String inputPattern, @org.jetbrains.annotations.Nullable()
    java.lang.String outputPattern) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentSecond() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String calculateTimeDifference(@org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.lang.String inputPattern) {
        return null;
    }
    
    public final int getElapsedMinutes(@org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.lang.String inputPattern) {
        return 0;
    }
    
    public final long getTimeDifferenceInMilli(@org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String inputPattern) {
        return 0L;
    }
}