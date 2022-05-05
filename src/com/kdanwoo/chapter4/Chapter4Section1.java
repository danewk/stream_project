package com.kdanwoo.chapter4;

import java.util.function.Supplier;

//함수형 인터페이스는 단 하나의 추상메서드만 가진다
public class Chapter4Section1 {

  public static void main(String[] args) {
    Supplier<String> myStringSupplier = () -> "hello world!";
    System.out.println(myStringSupplier.get());

    Supplier<Double> myRandomDoubleSupplier = () -> Math.random();
    printRandomDoubles(myRandomDoubleSupplier, 3);
  }

  public static void printRandomDoubles(Supplier<Double> randomSupplier, int count){
    for (int i = 0; i < count; i++) {
      System.out.println(randomSupplier.get());
    }

  }

}
