package com.interfaces;

import com.SpikeJava.Coche;
import com.interfaces.CocheService;

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
