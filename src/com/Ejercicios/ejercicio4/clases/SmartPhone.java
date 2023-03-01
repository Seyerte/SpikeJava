package com.Ejercicios.ejercicio4.clases;

public class SmartPhone extends SmartDevice {


    public SmartPhone(String color, String fabricante, String modelo, String procesador, Double peso, Double precio ) {
        super(color, fabricante, modelo, procesador, peso, precio);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", peso=" + peso +
                ", precio=" + precio +
                '}';
    }
}
