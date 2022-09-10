package com.pablovass.util;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    static Function<Integer, Integer> square = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return integer;
        }
    };

    static Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
    // dice is algo es par
   static Predicate<Integer> isEven = x -> x % 2 == 0; // trabaja sobre un tipo y genera un boolean y lo que haces testear si algo es valido
    //isEven.test(4);

}