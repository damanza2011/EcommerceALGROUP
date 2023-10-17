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
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  private final Provider<FirebaseFirestore> dbProvider;

  public RegisterViewModel_Factory(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<FirebaseFirestore> dbProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(firebaseAuthProvider.get(), dbProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<FirebaseFirestore> dbProvider) {
    return new RegisterViewModel_Factory(firebaseAuthProvider, dbProvider);
  }

  public static RegisterViewModel newInstance(FirebaseAuth firebaseAuth, FirebaseFirestore db) {
    return new RegisterViewModel(firebaseAuth, db);
  }
}