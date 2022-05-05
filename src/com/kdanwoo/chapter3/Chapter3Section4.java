package com.kdanwoo.chapter3;

import com.kdanwoo.util.TriFunction;

public class Chapter3Section4 {

  public static void main(String[] args) {
    TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (x, y, z) -> x + y + z;

    int result = addThreeNumbers.apply(3, 4, 5);
    System.out.println(result);
  }
}
