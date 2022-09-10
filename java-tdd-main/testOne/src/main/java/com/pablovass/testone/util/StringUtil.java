package com.pablovass.testone.util;

public class StringUtil {
    // devuelve un string apartir de repetir una serie de veces
    public static  String reapeat(String str, int times){
        String result="";
        //fori
        for (int i = 0; i < times; i++) {
            result+=str;
        }
        return result;
    }
}
