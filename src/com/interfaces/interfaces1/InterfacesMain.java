package com.interfaces.interfaces1;

import com.oop.vehiculos.Coche;

public class InterfacesMain {
    public static void main(String[] args) {



        CocheService service = new CocheServiceSportImpl();

        Coche coche = service.crearCocheDemo();


    }
}
