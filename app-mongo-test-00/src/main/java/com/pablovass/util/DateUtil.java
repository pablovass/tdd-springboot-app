package com.pablovass.util;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        /**
         * ALTERNATIVA 02
         *     if ((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)) {
         *             return true;
         *         }
         *         else{
         *             return  false;
         *         }*/
        /**
         * ALTERNATIVA 01
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        } else {

            return false;

    }**/
}}