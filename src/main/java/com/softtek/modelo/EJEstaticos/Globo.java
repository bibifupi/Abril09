package com.softtek.modelo.EJEstaticos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Globo {
    private final int ID;
    public static int CONTADOR = 0;

    public Globo() {
        this.ID = ++CONTADOR;
    }

}
