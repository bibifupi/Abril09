package com.softtek.presentacion;

import com.softtek.modelo.EJEstaticos.Globo;

public class PruebaGlobo {
    public static void main(String[] args) {
        System.out.println(Globo.CONTADOR);
        Globo g1 = new Globo();
        System.out.println(g1.toString());
        Globo g2 = new Globo();
        System.out.println(g2.toString());
        Globo g3 = new Globo();
        System.out.println(g3.toString());
    }
}
