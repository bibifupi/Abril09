package com.softtek.presentacion;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PruebaFuncionalFunction {
    //1. Filtrado de elementos de una lista: Define una función que tome una lista de números como entrada y devuelva una lista que solo contenga los números pares. Utiliza la interfaz funcional Function para filtrar los elementos de la lista.
    public static List<Integer> filtraPares(List<Integer> inputList) {
        Function<Integer, Boolean> esPar = number -> number % 2 == 0;

        List<Integer> listaFiltrada = inputList.stream()
                .filter(esPar::apply)
                .collect(Collectors.toList());

        return listaFiltrada;

    }

    //2. Cálculo de estadísticas:Escribe una función que tome una lista de números como entrada y devuelva un objeto Stats que contenga estadísticas como el mínimo, el máximo, la media de los números en la lista. Utiliza la interfaz funcional Function para realizar los cálculos necesarios.
    public static class Stats {
        private final double min;
        private final double max;
        private final double media;

        public Stats(double min, double max, double average) {
            this.min = min;
            this.max = max;
            this.media = average;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }

        public double getMedia() {
            return media;
        }
    }

    public static Stats calcularStats(List<Double> inputList) {
        // Utilizamos la interfaz funcional Function para calcular las estadísticas
        Function<List<Double>, Stats> Stats = list -> {
            double min = list.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
            double max = list.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
            double media = list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            return new Stats(min, max, media);
        };

        return Stats.apply(inputList);
    }


    //3. Validación de contraseñas:Crea una función que tome una cadena que representa una contraseña y devuelva true si la contraseña cumple con ciertos criterios de validación, como tener al menos ocho caracteres, incluir al menos una letra mayúscula, una letra minúscula, un número y un carácter especial. Utiliza la interfaz funcional Function para representar cada criterio de validación como una función independiente y combina estas funciones para verificar la contraseña completa.

    public static boolean validarContraseña(String password) {
        Function<String, Boolean> longitudMinima = pass -> pass.length() >= 8;
        Function<String, Boolean> mayuscula = pass -> pass.matches(".*[A-Z].*");
        Function<String, Boolean> minuscula = pass -> pass.matches(".*[a-z].*");
        Function<String, Boolean> numero = pass -> pass.matches(".*\\d.*");
        Function<String, Boolean> caracterEspecial = pass -> pass.matches(".*[!@#$%^&*()].*");

        return longitudMinima.apply(password)
                && mayuscula.apply(password)
                && minuscula.apply(password)
                && numero.apply(password)
                && caracterEspecial.apply(password);
    }

    public static void main(String[] args) {

        System.out.println("\nEjercicio 1");
        List<Integer> num1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = filtraPares(num1);
        System.out.println("Lista Original: " + num1);
        System.out.println("Lista filtrada por pares: " + pares);

        System.out.println("\nEjercicio 2");
        List<Double> num2 = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        Stats stats = calcularStats(num2);
        System.out.println("Lista: " + num2);
        System.out.println("Minimum: " + stats.getMin());
        System.out.println("Maximum: " + stats.getMax());
        System.out.println("Average: " + stats.getMedia());

        System.out.println("\nEjercicio 3");
        String contra = "C0ntr@seña";

        boolean valida = validarContraseña(contra);

        System.out.println("¿La contraeña " + contra + " es una contraseña válida? " + valida);
    }
}


