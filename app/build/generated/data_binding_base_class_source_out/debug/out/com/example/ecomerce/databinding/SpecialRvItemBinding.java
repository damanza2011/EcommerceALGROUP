// Generated by view binder compiler. Do not edit!
package com.example.ecomerce.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.com.simplepass.loadingbutton.customViews.CircularProgressButton;
import com.example.ecomerce.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SpecialRvItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CircularProgressButton btnAddToCart;

  @NonNull
  public final ImageView imageSpecialRvItem;

  @NonNull
  public final TextView tvSpecialPrdouctPrice;

  @NonNull
  public final TextView tvSpecialProductName;

  private SpecialRvItemBinding(@NonNull CardView rootView,
      @NonNull CircularProgressButton btnAddToCart, @NonNull ImageView imageSpecialRvItem,
      @NonNull TextView tvSpecialPrdouctPrice, @NonNull TextView tvSpecialProductName) {
    this.rootView = rootView;
    this.btnAddToCart = btnAddToCart;
    this.imageSpecialRvItem = imageSpecialRvItem;
    this.tvSpecialPrdouctPrice = tvSpecialPrdouctPrice;
    this.tvSpecialProductName = tvSpecialProductName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SpecialRvItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SpecialRvItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.special_rv_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SpecialRvItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_to_cart;
      CircularProgressButton btnAddToCart = ViewBindings.findChildViewById(rootView, id);
      if (btnAddToCart == null) {
        break missingId;
      }

      id = R.id.imageSpecialRvItem;
      ImageView imageSpecialRvItem = ViewBindings.findChildViewById(rootView, id);
      if (imageSpecialRvItem == null) {
        break missingId;
      }

      id = R.id.tvSpecialPrdouctPrice;
      TextView tvSpecialPrdouctPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvSpecialPrdouctPrice == null) {
        break missingId;
      }

      id = R.id.tvSpecialProductName;
      TextView tvSpecialProductName = ViewBindings.findChildViewById(rootView, id);
      if (tvSpecialProductName == null) {
        break missingId;
      }

      return new SpecialRvItemBinding((CardView) rootView, btnAddToCart, imageSpecialRvItem,
          tvSpecialPrdouctPrice, tvSpecialProductName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
