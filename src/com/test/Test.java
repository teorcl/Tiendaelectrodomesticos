package com.test;

import com.tiendadavidteo.Electrodomestico;
import com.tiendadavidteo.Nevera;

public class Test {
    public static void main(String[] args) {
        Electrodomestico licuadora=new Electrodomestico(true,"B");
        System.out.println(licuadora.calcularPrecio());
        
        Nevera lg=new Nevera(false,"A",180);
        System.out.println("nevera = " + lg.calcularPrecio());




    }
}
