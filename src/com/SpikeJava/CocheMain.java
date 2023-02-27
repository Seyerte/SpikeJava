package com.SpikeJava;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "Opel Corsa";
        Coche cocheObj = new Coche();

        Coche cocheObj2 =new Coche("azul", "opel", "corsa", 1030.50, 4.5);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1100.5;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico ="Ejemplo motor";
        cocheElectrico.color ="Rojo";
        cocheElectrico.fabricante ="Honda";
        cocheElectrico.modelo ="civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("verde", "seat", "ibiza",
                1200.20, 4.8,"TXZ");

        System.out.println(cocheElectrico);
    }
}
