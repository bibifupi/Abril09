package com.softtek.presentacion;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Supplier;

public class PruebaProveedores {

    //Proveedor de números aleatorios: Generar un número aleatorio en el rango especificado.
    private void numAleatorios() {
        int min = 1;
        int max = 100;
        Supplier<Integer> aleatorio = () -> {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
        };

        int numero = aleatorio.get();
        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + numero);
    }

    //Proveedor de una lista predefinida:Devolver una lista predefinida de elementos.
    private void listaPredefinida() {
        Supplier<List<String>> lista = () -> Arrays.asList("Manzana", "Banana", "Naranja", "Uva");

        List<String> frutas = lista.get();
        System.out.println("Lista predefinida de frutas:");
        frutas.forEach(System.out::println);
    }

    //Proveedor de fecha y hora actual: Obtener la fecha y hora actual del sistema.
    private void fhActual() {
        Supplier<LocalDateTime> fx = () -> LocalDateTime.now();
        System.out.println(fx.get());
    }

    //Proveedor de un nuevo objeto String vacío: Crear y devolver una cadena de texto vacía.
    private void stringVacio() {
        Supplier<String> vacio = () -> "";

        String resu;
        System.out.println("Es una cadena vacía: \"" + resu + "\"");
    }

    //Proveedor de un objeto de configuración de la aplicación: Devolver un objeto que contiene la configuración de la aplicación, como rutas de archivos, ajustes de conexión, etc.
    private void configuracion() {
        Supplier<Map<String, String>> proveedorConfiguracion = () -> {
            Map<String, String> configuracion = new HashMap<>();
            configuracion.put("ruta_archivos", "/ruta/del/archivo");
            configuracion.put("ajustes_conexion", "localhost:8080");
            return configuracion;
        };
        Map<String, String> configuracion = proveedorConfiguracion.get();

        System.out.println("Configuración de la aplicación:");
        configuracion.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }

    public static void main(String[] args) {
        PruebaProveedores pr1 = new PruebaProveedores();
        pr1.numAleatorios();
        pr1.listaPredefinida();
        pr1.fhActual();
        pr1.stringVacio();
        pr1.configuracion();

    }

}
