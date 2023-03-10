package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("12345678H", "Nombre Apellido 1");
        personas.put("12345678L", "Nombre Apellido 2");
        personas.put("12345678P", "Nombre Apellido 3");

        System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for (String value : personas.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
            //nos devuelve un objeto que tiene tanto la clave como el valor
        }

    }
}

