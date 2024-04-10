package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public final class Producto {

    public static int CONTADOR = 0; //PARA TODAS LAS INSTANCIAS DE LAS CLASES
    private final int ID;
    private String nombre;
    private double precio;

    public Producto() {
        this.ID = ++CONTADOR;
    }

    public final double importe(int cantidad) {
        return cantidad * precio;
    }

}
