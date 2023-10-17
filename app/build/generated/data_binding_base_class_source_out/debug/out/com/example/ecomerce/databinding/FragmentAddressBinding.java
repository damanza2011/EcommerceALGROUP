// Generated by view binder compiler. Do not edit!
package com.example.ecomerce.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecomerce.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddressBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton buttonDelelte;

  @NonNull
  public final AppCompatButton buttonSave;

  @NonNull
  public final EditText edAddressTitle;

  @NonNull
  public final EditText edCity;

  @NonNull
  public final EditText edFullName;

  @NonNull
  public final EditText edPhone;

  @NonNull
  public final EditText edState;

  @NonNull
  public final EditText edStreet;

  @NonNull
  public final ImageView imageAddressClose;

  @NonNull
  public final Guideline leftGuideline;

  @NonNull
  public final LinearLayout linear;

  @NonNull
  public final ProgressBar progressbarAddress;

  @NonNull
  public final Guideline rightGuideline;

  @NonNull
  public final Toolbar toolbarAddresses;

  @NonNull
  public final View topLine;

  @NonNull
  public final TextView tvPaymentMethods;

  private FragmentAddressBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton buttonDelelte, @NonNull AppCompatButton buttonSave,
      @NonNull EditText edAddressTitle, @NonNull EditText edCity, @NonNull EditText edFullName,
      @NonNull EditText edPhone, @NonNull EditText edState, @NonNull EditText edStreet,
      @NonNull ImageView imageAddressClose, @NonNull Guideline leftGuideline,
      @NonNull LinearLayout linear, @NonNull ProgressBar progressbarAddress,
      @NonNull Guideline rightGuideline, @NonNull Toolbar toolbarAddresses, @NonNull View topLine,
      @NonNull TextView tvPaymentMethods) {
    this.rootView = rootView;
    this.buttonDelelte = buttonDelelte;
    this.buttonSave = buttonSave;
    this.edAddressTitle = edAddressTitle;
    this.edCity = edCity;
    this.edFullName = edFullName;
    this.edPhone = edPhone;
    this.edState = edState;
    this.edStreet = edStreet;
    this.imageAddressClose = imageAddressClose;
    this.leftGuideline = leftGuideline;
    this.linear = linear;
    this.progressbarAddress = progressbarAddress;
    this.rightGuideline = rightGuideline;
    this.toolbarAddresses = toolbarAddresses;
    this.topLine = topLine;
    this.tvPaymentMethods = tvPaymentMethods;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_address, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDelelte;
      AppCompatButton buttonDelelte = ViewBindings.findChildViewById(rootView, id);
      if (buttonDelelte == null) {
        break missingId;
      }

      id = R.id.buttonSave;
      AppCompatButton buttonSave = ViewBindings.findChildViewById(rootView, id);
      if (buttonSave == null) {
        break missingId;
      }

      id = R.id.edAddressTitle;
      EditText edAddressTitle = ViewBindings.findChildViewById(rootView, id);
      if (edAddressTitle == null) {
        break missingId;
      }

      id = R.id.edCity;
      EditText edCity = ViewBindings.findChildViewById(rootView, id);
      if (edCity == null) {
        break missingId;
      }

      id = R.id.edFullName;
      EditText edFullName = ViewBindings.findChildViewById(rootView, id);
      if (edFullName == null) {
        break missingId;
      }

      id = R.id.edPhone;
      EditText edPhone = ViewBindings.findChildViewById(rootView, id);
      if (edPhone == null) {
        break missingId;
      }

      id = R.id.edState;
      EditText edState = ViewBindings.findChildViewById(rootView, id);
      if (edState == null) {
        break missingId;
      }

      id = R.id.edStreet;
      EditText edStreet = ViewBindings.findChildViewById(rootView, id);
      if (edStreet == null) {
        break missingId;
      }

      id = R.id.imageAddressClose;
      ImageView imageAddressClose = ViewBindings.findChildViewById(rootView, id);
      if (imageAddressClose == null) {
        break missingId;
      }

      id = R.id.leftGuideline;
      Guideline leftGuideline = ViewBindings.findChildViewById(rootView, id);
      if (leftGuideline == null) {
        break missingId;
      }

      id = R.id.linear;
      LinearLayout linear = ViewBindings.findChildViewById(rootView, id);
      if (linear == null) {
        break missingId;
      }

      id = R.id.progressbarAddress;
      ProgressBar progressbarAddress = ViewBindings.findChildViewById(rootView, id);
      if (progressbarAddress == null) {
        break missingId;
      }

      id = R.id.rightGuideline;
      Guideline rightGuideline = ViewBindings.findChildViewById(rootView, id);
      if (rightGuideline == null) {
        break missingId;
      }

      id = R.id.toolbarAddresses;
      Toolbar toolbarAddresses = ViewBindings.findChildViewById(rootView, id);
      if (toolbarAddresses == null) {
        break missingId;
      }

      id = R.id.topLine;
      View topLine = ViewBindings.findChildViewById(rootView, id);
      if (topLine == null) {
        break missingId;
      }

      id = R.id.tvPaymentMethods;
      TextView tvPaymentMethods = ViewBindings.findChildViewById(rootView, id);
      if (tvPaymentMethods == null) {
        break missingId;
      }

      return new FragmentAddressBinding((ConstraintLayout) rootView, buttonDelelte, buttonSave,
          edAddressTitle, edCity, edFullName, edPhone, edState, edStreet, imageAddressClose,
          leftGuideline, linear, progressbarAddress, rightGuideline, toolbarAddresses, topLine,
          tvPaymentMethods);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
