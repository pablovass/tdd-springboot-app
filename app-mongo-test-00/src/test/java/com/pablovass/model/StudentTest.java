package com.pablovass.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void should_isApproved_with_six() {
        Student maria =new Student(6.0);
        assertEquals(true,Student.isApproved.test(maria));
    }
    @Test
    void should_is_not_Approved_with_five_point_nine() {
        Student maria =new Student(5.9);
        assertEquals(false,Student.isApproved.test(maria));
    }
}