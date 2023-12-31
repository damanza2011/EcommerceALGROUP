// Generated by view binder compiler. Do not edit!
package com.example.ecomerce.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecomerce.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentIntrodcutionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton buttonStart;

  @NonNull
  public final ImageView ellipse;

  @NonNull
  public final Guideline guidelineEllipseBottom;

  @NonNull
  public final Guideline guidelineEllipseLeft;

  @NonNull
  public final Guideline guidelineEllipseRight;

  @NonNull
  public final Guideline guidelineEllipseTop;

  @NonNull
  public final Guideline guidelineLeftTexture;

  @NonNull
  public final TextView tvQuality;

  @NonNull
  public final TextView tvRightAddressForShopping;

  private FragmentIntrodcutionBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton buttonStart, @NonNull ImageView ellipse,
      @NonNull Guideline guidelineEllipseBottom, @NonNull Guideline guidelineEllipseLeft,
      @NonNull Guideline guidelineEllipseRight, @NonNull Guideline guidelineEllipseTop,
      @NonNull Guideline guidelineLeftTexture, @NonNull TextView tvQuality,
      @NonNull TextView tvRightAddressForShopping) {
    this.rootView = rootView;
    this.buttonStart = buttonStart;
    this.ellipse = ellipse;
    this.guidelineEllipseBottom = guidelineEllipseBottom;
    this.guidelineEllipseLeft = guidelineEllipseLeft;
    this.guidelineEllipseRight = guidelineEllipseRight;
    this.guidelineEllipseTop = guidelineEllipseTop;
    this.guidelineLeftTexture = guidelineLeftTexture;
    this.tvQuality = tvQuality;
    this.tvRightAddressForShopping = tvRightAddressForShopping;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentIntrodcutionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentIntrodcutionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_introdcution, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentIntrodcutionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonStart;
      AppCompatButton buttonStart = ViewBindings.findChildViewById(rootView, id);
      if (buttonStart == null) {
        break missingId;
      }

      id = R.id.ellipse;
      ImageView ellipse = ViewBindings.findChildViewById(rootView, id);
      if (ellipse == null) {
        break missingId;
      }

      id = R.id.guidelineEllipseBottom;
      Guideline guidelineEllipseBottom = ViewBindings.findChildViewById(rootView, id);
      if (guidelineEllipseBottom == null) {
        break missingId;
      }

      id = R.id.guidelineEllipseLeft;
      Guideline guidelineEllipseLeft = ViewBindings.findChildViewById(rootView, id);
      if (guidelineEllipseLeft == null) {
        break missingId;
      }

      id = R.id.guidelineEllipseRight;
      Guideline guidelineEllipseRight = ViewBindings.findChildViewById(rootView, id);
      if (guidelineEllipseRight == null) {
        break missingId;
      }

      id = R.id.guidelineEllipseTop;
      Guideline guidelineEllipseTop = ViewBindings.findChildViewById(rootView, id);
      if (guidelineEllipseTop == null) {
        break missingId;
      }

      id = R.id.guidelineLeftTexture;
      Guideline guidelineLeftTexture = ViewBindings.findChildViewById(rootView, id);
      if (guidelineLeftTexture == null) {
        break missingId;
      }

      id = R.id.tvQuality;
      TextView tvQuality = ViewBindings.findChildViewById(rootView, id);
      if (tvQuality == null) {
        break missingId;
      }

      id = R.id.tvRightAddressForShopping;
      TextView tvRightAddressForShopping = ViewBindings.findChildViewById(rootView, id);
      if (tvRightAddressForShopping == null) {
        break missingId;
      }

      return new FragmentIntrodcutionBinding((ConstraintLayout) rootView, buttonStart, ellipse,
          guidelineEllipseBottom, guidelineEllipseLeft, guidelineEllipseRight, guidelineEllipseTop,
          guidelineLeftTexture, tvQuality, tvRightAddressForShopping);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
