package com.Ejercicios.ejercicio4.clases;

public class SmartDevice {

    String color;
    String fabricante;
    String modelo;
    String procesador;
    Double peso;
    Double precio;

    public SmartDevice (){}


    public SmartDevice (String color, String fabricante, String modelo, String procesador, Double peso, Double precio) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = procesador;
        this.peso = peso;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}

