package com.oop.polimorfismo;

import com.oop.vehiculos.Coche;
import com.oop.vehiculos.CocheElectrico;
import com.oop.vehiculos.CocheHibrido;

public class PolimorfismoMain {

    public static void main(String[] args) {


        Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        // polimorfismo

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        //instanceof
        if(coche4 instanceof Coche){
            System.out.println("coche");
        }

        if(coche4 instanceof CocheElectrico){
            System.out.println("coche electrico");
        }

        if(coche4 instanceof CocheHibrido){
            System.out.println("coche hibrido");
        }



    }
}
