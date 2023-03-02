package com.interfaces.interfaces1;

import com.interfaces.interfaces1.CocheService;
import com.oop.vehiculos.Coche;
import com.oop.vehiculos.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");
    }
}
