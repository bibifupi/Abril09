package com.softtek.presentacion;

import com.softtek.modelo.Enumerados.EstadoCivil;
import com.softtek.modelo.Enumerados.Persona;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Lola", EstadoCivil.SOLTERO, 33);
        Persona p2 = new Persona("Alberto", EstadoCivil.CASADO, 32);
        Persona p3 = new Persona("Carmen", EstadoCivil.DIVORCIADO, 25);
        Persona p4 = new Persona("Antonio", EstadoCivil.VIUDO, 84);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
