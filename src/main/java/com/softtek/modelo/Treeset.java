package com.softtek.modelo;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        // Crear un TreeSet de cadenas (Strings)
        TreeSet<String> miTreeSet = new TreeSet<>();

        // Agregar elementos al TreeSet
        miTreeSet.add("Manzana");
        miTreeSet.add("Banana");
        miTreeSet.add("Naranja");
        miTreeSet.add("Naranja");
        miTreeSet.add("Uva");

        // Mostrar los elementos del TreeSet
        System.out.println("Elementos en el TreeSet:");
        for (String fruta : miTreeSet) {
            System.out.println(fruta);
        }
        System.out.println("¿Mi Treeset contiene Pera? " + miTreeSet.contains("Pera"));

        miTreeSet.remove("Manzana");
        System.out.println("Elimino Manzana");

        System.out.println("Elementos en el TreeSet:");
        for (String fruta : miTreeSet) {
            System.out.println(fruta);
        }
        System.out.println("El tamaño de mi TreeSet es: "+ miTreeSet.size());

        System.out.println("Primer elemento: "+ miTreeSet.first());
        System.out.println("Último elemento: "+ miTreeSet.last());
    }
}

