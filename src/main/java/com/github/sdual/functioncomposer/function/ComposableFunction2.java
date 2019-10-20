package com.github.sdual.functioncomposer.function;

import java.util.function.Function;

public class ComposableFunction2<S, T, R> implements ComposableFunction {

  private final ComposableFunction func;
  private final ComposableFunction nextFunc;

  private ComposableFunction2(ComposableFunction func, ComposableFunction nextFunc) {
    this.func = func;
    this.nextFunc = nextFunc;
  }


//
//  private final Function<S, T> func;
//  private final Function<T, R> nextFunc;
//
//  private ComposableFunction2(Function<S, T> func, Function<T, R> nextFunc) {
//    this.func = func;
//    this.nextFunc = nextFunc;
//  }
//
//  @SuppressWarnings("unchecked")
//  private ComposableFunction2(Function<S, T> func) {
//    this(func, (Function<T, R>) Function.identity());
//  }
//
//  public static <T, R, S> ComposableFunction2<T, R, S> from(Function<T, R> func) {
//    return new ComposableFunction2<>(func);
//  }
//
//  public static <T, R, S> ComposableFunction2<T, R, S> from(Function<T, R> func,
//      Function<R, S> nextFunc) {
//    return new ComposableFunction2<>(func, nextFunc);
//  }
//
//  @Override
//  public R apply(S s) {
//    return nextFunc.compose(func).apply(s);
//  }

}
