// Generated by Dagger (https://dagger.dev).
package com.example.ecomerce.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddressViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AddressViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AddressViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AddressViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AddressViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
