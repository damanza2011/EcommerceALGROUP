package com.example.ecomerce;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = EcomerceApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface EcomerceApplication_GeneratedInjector {
  void injectEcomerceApplication(EcomerceApplication ecomerceApplication);
}
