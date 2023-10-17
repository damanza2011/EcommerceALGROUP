// Generated by Dagger (https://dagger.dev).
package com.example.ecomerce.viewmodel;

import com.example.ecomerce.firebase.FirebaseCommon;
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
public final class DetailsViewModel_Factory implements Factory<DetailsViewModel> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<FirebaseAuth> authProvider;

  private final Provider<FirebaseCommon> firebaseCommonProvider;

  public DetailsViewModel_Factory(Provider<FirebaseFirestore> firestoreProvider,
      Provider<FirebaseAuth> authProvider, Provider<FirebaseCommon> firebaseCommonProvider) {
    this.firestoreProvider = firestoreProvider;
    this.authProvider = authProvider;
    this.firebaseCommonProvider = firebaseCommonProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(firestoreProvider.get(), authProvider.get(), firebaseCommonProvider.get());
  }

  public static DetailsViewModel_Factory create(Provider<FirebaseFirestore> firestoreProvider,
      Provider<FirebaseAuth> authProvider, Provider<FirebaseCommon> firebaseCommonProvider) {
    return new DetailsViewModel_Factory(firestoreProvider, authProvider, firebaseCommonProvider);
  }

  public static DetailsViewModel newInstance(FirebaseFirestore firestore, FirebaseAuth auth,
      FirebaseCommon firebaseCommon) {
    return new DetailsViewModel(firestore, auth, firebaseCommon);
  }
}
