package com.tiendadavidteo;

public class Electrodomestico {
    /**Atributos*/
    protected boolean procedencia; //False para importado, true para nacional
    protected String consumo;
    protected double precio;

    /**Metodos*/
    //Constructor
    public Electrodomestico(boolean procedencia, String consumo) {
        this.procedencia = procedencia;
        this.consumo = consumo;
        this.precio = 0.0;
    }

    //Getters and setters


    public boolean isProcedencia() {
        return procedencia;
    }

    public void setProcedencia(boolean procedencia) {
        this.procedencia = procedencia;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio(){
        if(this.procedencia) this.precio = this.precio + 250000;
         else this.precio = this.precio + 350000;
        switch (this.consumo){
            case "A":
                this.precio = this.precio + 450000;
                break;
            case "B":
                this.precio = this.precio + 350000;
                break;
            case "C":
                this.precio = this.precio + 250000;
                break;
            default:
                System.out.println("Ingrese A,B o C");

        }
        return this.precio;
    }

}
