package com.kdanwoo.chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter4Section2 {

  public static void main(String[] args) {
    Consumer<String> myStringConsumer = (String str) -> {
      System.out.println(str);
    };
//    myStringConsumer.accept("hello world!");
    List<Integer> integerInputs = Arrays.asList(4, 2, 3); //immutable

    Consumer<Integer> myIntegerProcessor = (Integer x) -> {
      System.out.println("processing integer " + x);
    };

    process(integerInputs, myIntegerProcessor);



    Consumer<Double> myDoubleProcessor = x -> System.out.println("processing double "+ x);
    List<Double> doubles = Arrays.asList(1.1, 2.1, 3.3);

    process2(doubles, myDoubleProcessor);


  }

  public static void process(List<Integer> inputs, Consumer<Integer> processor) {
    for (Integer input : inputs) {
      processor.accept(input);
    }
  }

  public static <T> void process2(List<T> inputs, Consumer<T> processor) {
    for (T input : inputs) {
      processor.accept(input);
    }
  }
}
