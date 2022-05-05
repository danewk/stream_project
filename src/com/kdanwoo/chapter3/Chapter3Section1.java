package com.kdanwoo.chapter3;

import com.kdanwoo.util.Adder;
import java.util.function.Function;

public class Chapter3Section1 {
  public static void main(String[] args) {
    Function<Integer, Integer> myAdder = new Adder();
    Function<Integer, Integer> myAdder2 = x -> x + 10; // anonymous function

    Integer result = myAdder.apply(5);
    Integer result2 = myAdder2.apply(5);
    System.out.println(result);
    System.out.println(result2);
  }
}
