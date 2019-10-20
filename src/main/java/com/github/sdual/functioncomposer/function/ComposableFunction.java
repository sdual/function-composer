package com.github.sdual.functioncomposer.function;

import java.util.ConcurrentModificationException;
import sun.java2d.cmm.CMMServiceProvider;

public interface ComposableFunction {

  static ComposableFunction from(ComposableFunction func, ComposableFunction nextFunc) {
    return new ComposableFunction2<>(func, nextFunc);
  }

  interface Function0<R> extends ComposableFunction {

    R apply();

    default R run() {
      return apply();
    }
  }

  @FunctionalInterface
  interface Function1<T extends ComposableFunction, R> extends ComposableFunction {

    R apply(T t);

    default R run(T t) {
      return apply(t);
    }
  }

  @FunctionalInterface
  interface Function2<T extends ComposableFunction, U extends ComposableFunction, R> {

    R apply(U u, T t);

    default Function1<T, R> run(U u, T t) {
      return u -> t -> apply(u, t);
    }

  }

  @FunctionalInterface
  interface Function3<T extends ComposableFunction, U extends ComposableFunction, V extends ComposableFunction, R> extends
      ComposableFunction {

    R apply(T t, U u, V v);

  }

  @FunctionalInterface
  interface Function4<T1
      extends ComposableFunction, T2
      extends ComposableFunction, T3
      extends ComposableFunction, T4
      extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4);

  }

  @FunctionalInterface
  interface Function5<T1 extends ComposableFunction,
      T2 extends ComposableFunction,
      T3 extends ComposableFunction,
      T4 extends ComposableFunction,
      T5 extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

  }

  @FunctionalInterface
  interface Function6<T1 extends ComposableFunction,
      T2 extends ComposableFunction,
      T3 extends ComposableFunction,
      T4 extends ComposableFunction,
      T5 extends ComposableFunction,
      T6 extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);

  }

  @FunctionalInterface
  interface Function7<T1 extends ComposableFunction,
      T2 extends ComposableFunction,
      T3 extends ComposableFunction,
      T4 extends ComposableFunction,
      T5 extends ComposableFunction,
      T6 extends ComposableFunction,
      T7 extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7);

  }

  @FunctionalInterface
  interface Function8<T1 extends ComposableFunction,
      T2 extends ComposableFunction,
      T3 extends ComposableFunction,
      T4 extends ComposableFunction,
      T5 extends ComposableFunction,
      T6 extends ComposableFunction,
      T7 extends ComposableFunction,
      T8 extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

  }

  @FunctionalInterface
  interface Function9<T1 extends ComposableFunction,
      T2 extends ComposableFunction,
      T3 extends ComposableFunction,
      T4 extends ComposableFunction,
      T5 extends ComposableFunction,
      T6 extends ComposableFunction,
      T7 extends ComposableFunction,
      T8 extends ComposableFunction,
      T9 extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9);

  }

  @FunctionalInterface
  interface Function10<T1 extends ComposableFunction,
      T2 extends ComposableFunction,
      T3 extends ComposableFunction,
      T4 extends ComposableFunction,
      T5 extends ComposableFunction,
      T6 extends ComposableFunction,
      T7 extends ComposableFunction,
      T8 extends ComposableFunction,
      T9 extends ComposableFunction,
      T10 extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10);

  }

  @FunctionalInterface
  interface Function11<T1 extends ComposableFunction,
      T2 extends ComposableFunction,
      T3 extends ComposableFunction,
      T4 extends ComposableFunction,
      T5 extends ComposableFunction,
      T6 extends ComposableFunction,
      T7 extends ComposableFunction,
      T8 extends ComposableFunction,
      T9 extends ComposableFunction,
      T10 extends ComposableFunction,
      T11 extends ComposableFunction, R> extends ComposableFunction {

    R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

  }

}
