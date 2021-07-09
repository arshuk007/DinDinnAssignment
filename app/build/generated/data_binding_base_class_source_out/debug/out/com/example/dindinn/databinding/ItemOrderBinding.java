// Generated by data binding compiler. Do not edit!
package com.example.dindinn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.dindinn.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemOrderBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView txtCount;

  @NonNull
  public final TextView txtOrderNo;

  @NonNull
  public final TextView txtOrderTime;

  @NonNull
  public final TextView txtStatus;

  @NonNull
  public final TextView txtTime;

  protected ItemOrderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar progressbar, RecyclerView recyclerView, TextView txtCount, TextView txtOrderNo,
      TextView txtOrderTime, TextView txtStatus, TextView txtTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressbar = progressbar;
    this.recyclerView = recyclerView;
    this.txtCount = txtCount;
    this.txtOrderNo = txtOrderNo;
    this.txtOrderTime = txtOrderTime;
    this.txtStatus = txtStatus;
    this.txtTime = txtTime;
  }

  @NonNull
  public static ItemOrderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_order, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemOrderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemOrderBinding>inflateInternal(inflater, R.layout.item_order, root, attachToRoot, component);
  }

  @NonNull
  public static ItemOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_order, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemOrderBinding>inflateInternal(inflater, R.layout.item_order, null, false, component);
  }

  public static ItemOrderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemOrderBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemOrderBinding)bind(component, view, R.layout.item_order);
  }
}