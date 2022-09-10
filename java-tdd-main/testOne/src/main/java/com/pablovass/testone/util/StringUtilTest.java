package com.pablovass.testone.util;

//mport static org.junit.Assert.*;

public class StringUtilTest {
    //psvm
    public static void main(String[] args) {
       String result= StringUtil.reapeat("hola", 3);
        //sout
       // System.out.println(result);
        if (result.equals("holaholahola")){
            System.out.println("OK");
        }
        //segunda comprobacion
        String result2= StringUtil.reapeat("hol", 1);
        //System.out.println(result2);
        if (result2.equals("hola")){
            System.out.println("OK");
        }else if(!result2.equals("hola")){
            System.out.println("ERROR");
        }
    }
}