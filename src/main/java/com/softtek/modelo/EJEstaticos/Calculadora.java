package com.softtek.modelo.EJEstaticos;

import lombok.*;

@AllArgsConstructor
@Data
@Setter
@Getter
@ToString
public class Calculadora {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}
