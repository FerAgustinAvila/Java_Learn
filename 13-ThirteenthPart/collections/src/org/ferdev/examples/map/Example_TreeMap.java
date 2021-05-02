package org.ferdev.examples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example_TreeMap {
    public static void main(String[] args) {

        Map<String, Object> person = new TreeMap<>();
        person.put("nombre", "John");
        person.put("apellido", "Doe");
        person.put("email", "john@correo.com");
        person.put("edad", "40");

        Map<String, String> address = new TreeMap<>();
        address.put("Pais", "Argentina");
        address.put("Estado", "Cordoba");
        address.put("Ciudad", "Capital");
        address.put("Calle", "Av Siempre Viva");
        address.put("Numero", "742");

        person.put("direccion", address);

        person.forEach((s, o) -> System.out.println(s + " =>" + o));
    }
}
