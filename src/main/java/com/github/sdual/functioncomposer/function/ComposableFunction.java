package com.github.sdual.functioncomposer.function;

import java.util.function.Function;

public class ComposableFunction<S, T, R> implements Function<S, R> {

  private final Function<S, T> func;
  private final Function<T, R> nextFunc;

  private ComposableFunction(Function<S, T> func, Function<T, R> nextFunc) {
    this.func = func;
    this.nextFunc = nextFunc;
  }

  @SuppressWarnings("unchecked")
  private ComposableFunction(Function<S, T> func) {
    this(func, (Function<T, R>) Function.identity());
  }

  public static <T, R, S> ComposableFunction<T, R, S> from(Function<T, R> func) {
    return new ComposableFunction<>(func);
  }

  public static <T, R, S> ComposableFunction<T, R, S> from(Function<T, R> func,
      Function<R, S> nextFunc) {
    return new ComposableFunction<>(func, nextFunc);
  }

  @Override
  public R apply(S s) {
    return nextFunc.compose(func).apply(s);
  }

}
