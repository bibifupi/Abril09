package com.softtek.presentacion;

import javax.imageio.stream.ImageInputStream;
import java.util.function.Predicate;

//Predicado para números positivos: Verificar si un número entero es positivo.

public class PruebaPredicados {
    //Devuelve Boolean
    private void numerosPositivos() {
        Predicate<Integer> positivo = x -> x > 0;
        boolean resu = positivo.test(-8);
        System.out.println(resu);
    }

    //Predicado para cadenas no vacías: Comprobar si una cadena de texto no está vacía.
    private void cadenaNoVacia() {
        String cadena1 = "Hola, mundo!";
        String cadena2 = "";

        Predicate<String> noVacia = s -> !s.isEmpty();
        System.out.println("¿Cadena1 no está vacía? " + noVacia.test(cadena1));
        System.out.println("¿Cadena2 no está vacía? " + noVacia.test(cadena2));
    }

    //Predicado para números pares: Determinar si un número entero es par.
    private void numerosPares() {
        Predicate<Integer> par = x -> x % 2 == 0;
        boolean resu = par.test(34537483);
        System.out.println(resu);
    }

    //Predicado para números mayores que un valor dado:Comprobar si un número entero es mayor que un valor específico.
    private void numerosMayores() {
        int num = 25;
        int valor = 20;
        Predicate<Integer> mayor = x -> x > valor;
        System.out.println("¿El número " + num + " es mayor que " + valor + "? " + mayor.test(num));
    }

    //Predicado para números primos:Determinar si un número entero es primo.
    private void numerosPrimos() {
        Predicate<Integer> esPrimo = x -> {
            if (x <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };

        boolean resultadoPrimo = esPrimo.test(7);
        System.out.println("El número es primo?" + resultadoPrimo);
    }

    public static void main(String[] args) {
        PruebaPredicados p1 = new PruebaPredicados();
        p1.numerosPositivos();
        p1.cadenaNoVacia();
        p1.numerosPares();
        p1.numerosMayores();
        p1.numerosPrimos();
    }
}





