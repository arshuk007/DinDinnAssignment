package com.example.dindinn;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.dindinn.databinding.ActivityIncredientBindingImpl;
import com.example.dindinn.databinding.ActivityMainBindingImpl;
import com.example.dindinn.databinding.ActivitySplashBindingImpl;
import com.example.dindinn.databinding.FragmentIncredientBindingImpl;
import com.example.dindinn.databinding.ItemAddonBindingImpl;
import com.example.dindinn.databinding.ItemIncredientBindingImpl;
import com.example.dindinn.databinding.ItemItemBindingImpl;
import com.example.dindinn.databinding.ItemOrderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYINCREDIENT = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_FRAGMENTINCREDIENT = 4;

  private static final int LAYOUT_ITEMADDON = 5;

  private static final int LAYOUT_ITEMINCREDIENT = 6;

  private static final int LAYOUT_ITEMITEM = 7;

  private static final int LAYOUT_ITEMORDER = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.activity_incredient, LAYOUT_ACTIVITYINCREDIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.fragment_incredient, LAYOUT_FRAGMENTINCREDIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.item_addon, LAYOUT_ITEMADDON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.item_incredient, LAYOUT_ITEMINCREDIENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.item_item, LAYOUT_ITEMITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.dindinn.R.layout.item_order, LAYOUT_ITEMORDER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYINCREDIENT: {
          if ("layout/activity_incredient_0".equals(tag)) {
            return new ActivityIncredientBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_incredient is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINCREDIENT: {
          if ("layout/fragment_incredient_0".equals(tag)) {
            return new FragmentIncredientBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_incredient is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMADDON: {
          if ("layout/item_addon_0".equals(tag)) {
            return new ItemAddonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_addon is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMINCREDIENT: {
          if ("layout/item_incredient_0".equals(tag)) {
            return new ItemIncredientBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_incredient is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMITEM: {
          if ("layout/item_item_0".equals(tag)) {
            return new ItemItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMORDER: {
          if ("layout/item_order_0".equals(tag)) {
            return new ItemOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_order is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_incredient_0", com.example.dindinn.R.layout.activity_incredient);
      sKeys.put("layout/activity_main_0", com.example.dindinn.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.example.dindinn.R.layout.activity_splash);
      sKeys.put("layout/fragment_incredient_0", com.example.dindinn.R.layout.fragment_incredient);
      sKeys.put("layout/item_addon_0", com.example.dindinn.R.layout.item_addon);
      sKeys.put("layout/item_incredient_0", com.example.dindinn.R.layout.item_incredient);
      sKeys.put("layout/item_item_0", com.example.dindinn.R.layout.item_item);
      sKeys.put("layout/item_order_0", com.example.dindinn.R.layout.item_order);
    }
  }
}
