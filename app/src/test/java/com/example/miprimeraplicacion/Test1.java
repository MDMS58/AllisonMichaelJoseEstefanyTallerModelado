package com.example.miprimeraplicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class Test1 {
    @Test
    public void Test1PasswordTooShort() {
        TestPU validator = new TestPU();
        assertFalse(validator.isValidPassword("5634rh")); // Menos de 8 caracteres
    }

    @Test
    public void Test2PasswordWithoutSpecialCharacters() {
        TestPU validator = new TestPU();
        assertTrue(validator.isValidPassword("abcd1234")); // Solo letras y dígitos
    }


    @Test
    public void Test3PasswordWithOnlyLetters() {
        TestPU validator = new TestPU();
        assertFalse(validator.isValidPassword("abcdefgh")); // Solo letras
    }
    @Test
    public void Test1ContieneProfanidades() {
        TestPU validator = new TestPU();
        assertFalse(validator.contieneProfanidades("zo123")); // Sin profanidades
    }
    @Test
    public void Test2ContieneProfanidades() {
        TestPU validator = new TestPU();
        assertFalse(validator.contieneProfanidades("MDMS123")); // Sin profanidades en false
    }
    @Test
    public void Test3ContieneProfanidades() {
        TestPU validator = new TestPU();
        assertFalse(validator.contieneProfanidades("HolaS123")); // Con profanidades
    }



}
