package com.pablovass.model;

import java.util.function.Predicate;

public class Student {
    private double calificaciones;

    public Student(double calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
    //el studiante aprobo
   static Predicate<Student>isApproved= student -> student.getCalificaciones()>=6.0;
    //predicados para validar datos +
}
