package com.tiendadavidteo;

public class Televisor extends Electrodomestico{
    private int tamano;
    private boolean isTDT;

    public Televisor(boolean procedencia, String consumo, int tamano, boolean isTDT) {
        super(procedencia, consumo);
        this.tamano = tamano;
        this.isTDT = isTDT;
    }

    @Override
    public double calcularPrecio() {
        this.precio = super.calcularPrecio();
        if (this.tamano>40){
            this.precio += this.precio*0.3;
        }
        //this.precio += 250000;
        this.precio = (isTDT==true)?this.precio+250000:this.precio;
        return this.precio;
    }
}
