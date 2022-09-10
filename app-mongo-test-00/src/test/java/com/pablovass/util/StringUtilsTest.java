package com.pablovass.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void repeat_three_time() {
        assertEquals("holaholahola",StringUtils.repeat("hola",3));
    }

    @Test
    void reteat_once_time() {
        assertEquals("hola",StringUtils.repeat("hola",1));
    }

    @Test
    void repeat_string_zero_times() {
        assertEquals("",StringUtils.repeat("hola",0));
    }


    @Test
    public void repeat_string_negative_times() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.repeat("hola", -1);
        });


    }
}