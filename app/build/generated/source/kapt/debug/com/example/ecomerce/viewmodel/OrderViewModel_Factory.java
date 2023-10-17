// Generated by Dagger (https://dagger.dev).
package com.example.ecomerce.viewmodel;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OrderViewModel_Factory implements Factory<OrderViewModel> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<FirebaseAuth> authProvider;

  public OrderViewModel_Factory(Provider<FirebaseFirestore> firestoreProvider,
      Provider<FirebaseAuth> authProvider) {
    this.firestoreProvider = firestoreProvider;
    this.authProvider = authProvider;
  }

  @Override
  public OrderViewModel get() {
    return newInstance(firestoreProvider.get(), authProvider.get());
  }

  public static OrderViewModel_Factory create(Provider<FirebaseFirestore> firestoreProvider,
      Provider<FirebaseAuth> authProvider) {
    return new OrderViewModel_Factory(firestoreProvider, authProvider);
  }

  public static OrderViewModel newInstance(FirebaseFirestore firestore, FirebaseAuth auth) {
    return new OrderViewModel(firestore, auth);
  }
}
