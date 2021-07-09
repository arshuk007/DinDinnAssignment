// Generated by data binding compiler. Do not edit!
package com.example.dindinn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.dindinn.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemAddonBinding extends ViewDataBinding {
  @NonNull
  public final TextView txtComment;

  @NonNull
  public final TextView txtName;

  protected ItemAddonBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView txtComment, TextView txtName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.txtComment = txtComment;
    this.txtName = txtName;
  }

  @NonNull
  public static ItemAddonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_addon, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemAddonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemAddonBinding>inflateInternal(inflater, R.layout.item_addon, root, attachToRoot, component);
  }

  @NonNull
  public static ItemAddonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_addon, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemAddonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemAddonBinding>inflateInternal(inflater, R.layout.item_addon, null, false, component);
  }

  public static ItemAddonBinding bind(@NonNull View view) {
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
  public static ItemAddonBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemAddonBinding)bind(component, view, R.layout.item_addon);
  }
}