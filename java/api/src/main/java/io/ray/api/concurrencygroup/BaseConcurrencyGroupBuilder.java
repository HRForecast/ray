// Generated by `BaseConcurrencyGroupBuilderGenerator.java`. DO NOT EDIT.

package io.ray.api.concurrencygroup;

import io.ray.api.function.RayFunc;
import io.ray.api.function.RayFunc1;
import io.ray.api.function.RayFunc2;
import io.ray.api.function.RayFunc3;
import io.ray.api.function.RayFunc4;
import io.ray.api.function.RayFunc5;
import io.ray.api.function.RayFunc6;
import io.ray.api.function.RayFuncVoid1;
import io.ray.api.function.RayFuncVoid2;
import io.ray.api.function.RayFuncVoid3;
import io.ray.api.function.RayFuncVoid4;
import io.ray.api.function.RayFuncVoid5;
import io.ray.api.function.RayFuncVoid6;

/** This class provides type-safe interfaces for concurrency groups. */
abstract class BaseConcurrencyGroupBuilder<A> {

  protected abstract ConcurrencyGroupBuilder<A> internalAddMethod(RayFunc func);

  public <R> ConcurrencyGroupBuilder<A> addMethod(RayFunc1<A, R> f) {
    return internalAddMethod(f);
  }

  public ConcurrencyGroupBuilder<A> addMethod(RayFuncVoid1<A> f) {
    return internalAddMethod(f);
  }

  public <T0, R> ConcurrencyGroupBuilder<A> addMethod(RayFunc2<A, T0, R> f) {
    return internalAddMethod(f);
  }

  public <T0> ConcurrencyGroupBuilder<A> addMethod(RayFuncVoid2<A, T0> f) {
    return internalAddMethod(f);
  }

  public <T0, T1, R> ConcurrencyGroupBuilder<A> addMethod(RayFunc3<A, T0, T1, R> f) {
    return internalAddMethod(f);
  }

  public <T0, T1> ConcurrencyGroupBuilder<A> addMethod(RayFuncVoid3<A, T0, T1> f) {
    return internalAddMethod(f);
  }

  public <T0, T1, T2, R> ConcurrencyGroupBuilder<A> addMethod(RayFunc4<A, T0, T1, T2, R> f) {
    return internalAddMethod(f);
  }

  public <T0, T1, T2> ConcurrencyGroupBuilder<A> addMethod(RayFuncVoid4<A, T0, T1, T2> f) {
    return internalAddMethod(f);
  }

  public <T0, T1, T2, T3, R> ConcurrencyGroupBuilder<A> addMethod(
      RayFunc5<A, T0, T1, T2, T3, R> f) {
    return internalAddMethod(f);
  }

  public <T0, T1, T2, T3> ConcurrencyGroupBuilder<A> addMethod(RayFuncVoid5<A, T0, T1, T2, T3> f) {
    return internalAddMethod(f);
  }

  public <T0, T1, T2, T3, T4, R> ConcurrencyGroupBuilder<A> addMethod(
      RayFunc6<A, T0, T1, T2, T3, T4, R> f) {
    return internalAddMethod(f);
  }

  public <T0, T1, T2, T3, T4> ConcurrencyGroupBuilder<A> addMethod(
      RayFuncVoid6<A, T0, T1, T2, T3, T4> f) {
    return internalAddMethod(f);
  }
}
