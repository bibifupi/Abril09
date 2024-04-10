package com.softtek.presentacion;

import com.softtek.modelo.EJEstaticos.Calculadora;

public class PruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora();

        try {
            System.out.println("Suma: " + calcu.sumar(5.5, 4.5));
            System.out.println("Resta: " + calcu.restar(10, 5));
            System.out.println("Multiplicación: " + calcu.multiplicar(3, 3));
            System.out.println("División: " + calcu.dividir(10, 2));
            System.out.println("División por cero: " + calcu.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
