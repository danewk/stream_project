package com.kdanwoo.chapter3;

import java.util.function.BiFunction;

public class Chapter3Section3 {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer> adder = (x, y) -> x + y;

    int result = adder.apply(3, 5);

    System.out.println(result);

  }
}
