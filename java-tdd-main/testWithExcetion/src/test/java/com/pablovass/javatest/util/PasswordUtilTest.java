package com.pablovass.javatest.util;

import org.junit.Test;

import static com.pablovass.javatest.util.PasswordUtil.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {


    @Test
    public void weak_when_has_less_than_8_letters() {
        //alt enter y me sale un static import // reduce el assertEcuals
        assertEquals(SecurityLevel.WEAK, assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        //alt enter y me sale un static import // reduce el assertEcuals
        assertEquals(SecurityLevel.WEAK, assessPassword("abcdefg"));
    }

    @Test
    public void weak_when_has_numbers_and_letters() {
        //alt enter y me sale un static import // reduce el assertEcuals
        assertEquals(SecurityLevel.MEDIUM, assessPassword("abcdefg12345"));
    }
    @Test
    public void weak_when_has_numbers_letters_and_symbols() {
        assertEquals(SecurityLevel.STRONG, assessPassword("abcdefg12345!"));
    }

}