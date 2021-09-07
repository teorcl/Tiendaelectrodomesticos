package com.tiendadavidteo;

public class Nevera extends Electrodomestico{
    /**Atributos*/
    private int capacidad;

    public Nevera(boolean procedencia, String consumo, int capacidad) {
        super(procedencia, consumo);
        this.capacidad = capacidad;
    }

    @Override
    public double calcularPrecio() {
        this.precio = super.calcularPrecio();
        if (this.capacidad > 120) {
            int incremento = (this.capacidad -120)/10;
            this.precio = this.precio + (this.precio)*0.05*incremento;
        }
        return this.precio;
    }
}
