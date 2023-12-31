// Generated by Dagger (https://dagger.dev).
package com.example.ecomerce.fragments.categories;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FiltroCabinaFragment_MembersInjector implements MembersInjector<FiltroCabinaFragment> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  public FiltroCabinaFragment_MembersInjector(Provider<FirebaseFirestore> firestoreProvider) {
    this.firestoreProvider = firestoreProvider;
  }

  public static MembersInjector<FiltroCabinaFragment> create(
      Provider<FirebaseFirestore> firestoreProvider) {
    return new FiltroCabinaFragment_MembersInjector(firestoreProvider);
  }

  @Override
  public void injectMembers(FiltroCabinaFragment instance) {
    injectFirestore(instance, firestoreProvider.get());
  }

  @InjectedFieldSignature("com.example.ecomerce.fragments.categories.FiltroCabinaFragment.firestore")
  public static void injectFirestore(FiltroCabinaFragment instance, FirebaseFirestore firestore) {
    instance.firestore = firestore;
  }
}
