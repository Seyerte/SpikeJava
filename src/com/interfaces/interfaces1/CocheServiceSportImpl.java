package com.interfaces.interfaces1;

import com.interfaces.interfaces1.CocheService;
import com.oop.vehiculos.Coche;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return null;
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
