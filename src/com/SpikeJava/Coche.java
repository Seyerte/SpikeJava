package com.SpikeJava;

public class Coche {

    //atributo
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //constructores
    public Coche (String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }

    //comportamiento

    public void acelerar (Integer cantidad){
        if (cantidad > 0 && cantindad <= 120) {
            this.velocidad += cantidad;
        }

    }

}
