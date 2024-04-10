package com.softtek.presentacion;

import com.softtek.modelo.Producto;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class PruebaConsumidores {
    public static void main(String[] args) {
        //Consumidor para imprimir en mayúsculas: Tomar una cadena de texto y mostrarla en mayúsculas.
        String texto = "Hola Mundo.";
        Consumer<String> mayus = x -> System.out.println(x.toUpperCase());

        mayus.accept(texto);

        //Consumidor para imprimir números y sus cuadrados: Tomar un número entero y mostrarlo junto con su cuadrado.
        int num = 5;
        Consumer<Integer> cuadrado = x -> System.out.println(Math.pow(num, 2));
        cuadrado.accept(num);

        //Consumidor para imprimir detalles de un producto: Tomar un objeto Producto y mostrar sus detalles como nombre, precio, etc.
        Producto prod = new Producto(4, "Cascos", 20);
        Consumer<Producto> producto = x -> System.out.println(x.toString());
        producto.accept(prod);

//Consumidor para mostrar un mensaje en un cuadro de diálogo: Tomar un mensaje de texto y mostrarlo en un cuadro de diálogo en la interfaz de usuario.
        String mensaje = "¡Hola desde el cuadro de diálogo!";

        Consumer<String> dialogo = s -> JOptionPane.showMessageDialog(null, s);

        dialogo.accept(mensaje);

        //Consumidor para escribir en un archivo de registro: Tomar un registro de eventos y escribirlo en un archivo de registro para su seguimiento.
        String msj = "Evento registrado en el registro.";
String rutaArchivo= "registro.txt";
        Consumer<String> escribirEnArchivo = s -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
                writer.write(s);
                writer.newLine();
                System.out.println("Evento registrado en el archivo de registro.");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo de registro: " + e.getMessage());
            }
        };

        // Ejecutar el Consumer con el mensaje dado
        escribirEnArchivo.accept(msj);

    }

}






