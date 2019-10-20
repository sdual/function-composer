package com.github.sdual.functioncomposer.function;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.junit.Test;

public class ComposableFunctionTest {

  private String addAndToStringTestFunction(int x) {
    return String.valueOf(x + 10);
  }

  private List<String> splitAndToListTestFunction(String str) {
    return Arrays.asList(str.split(""));
  }

  @Test
  public void testComposeFunctions() {
    Function<Integer, List<String>> composedFunc =
        ComposableFunction2.from(this::addAndToStringTestFunction,
            ComposableFunction2.from(this::splitAndToListTestFunction));

    List<String> actual = composedFunc.apply(10);
    List<String> expected = Arrays.asList("2", "0");

    assertThat("The Composed Function returns a List of split number string",
        actual, is(expected));
  }

}
