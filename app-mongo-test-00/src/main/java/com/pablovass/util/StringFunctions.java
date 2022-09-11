package com.pablovass.util;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    /**
     * trabaja sobre un solo tipo extiende de funcion y recive un dato y devuelve otro dato
     * */
    UnaryOperator<String> quote=text->"\""+text+"\""; //le agrega commillas al elemento
    UnaryOperator<String>addMark= text->text+"!"; // le agrega un simbolo de exclamacion

    //System.out.println(quote.apply("hola estudiante"));
    //System.out.println(addMark.apply("hola estudiante"));

    /**
     * BiFunction va tomar dos tipos de datos y devolver un 3ser tipo de dato.
     * */
    BiFunction<Integer,Integer,Integer>multiplicacion=(x,y)->x*y;
    //multiplicacion.apply(5,4);

    BinaryOperator<Integer>multiplicacion2=(x,y)->x*y;

    BiFunction<String,Integer,String>leftPad=
            (text,number)->String.format("%"+ number +"s",text); //la s dice que formatee con spacios

   // System.out.println(leftPad.apply("java",10))
}
