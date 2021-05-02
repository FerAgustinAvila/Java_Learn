package org.ferdev.examples.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Example_HashMap {
    public static void main(String[] args) {

        Map<String, String> person = new HashMap<>();
        person.put("nombre", "John");
        person.put("apellido", "Doe");
        person.put("email", "john@correo.com");

        System.out.println("persona: " + person);

        String name = person.get("nombre");
        System.out.println("\nNombre: " + name);

        /*System.out.println("\nClear");
        person.clear();
        System.out.println("persona: " + person);*/

        String lastname = person.remove("apellido");
        System.out.println("eliminado: " + lastname);
        System.out.println(person);

        System.out.println();
        boolean b = person.containsKey("nombre");
        System.out.println("Contiene key 'nombre': " + b );

        boolean b2 = person.containsValue("john@correo.com");
        System.out.println("Contiene Value 'john@correo.com': " + b2 );


        System.out.println();
        Collection<String> values = person.values();
        values.forEach(System.out::println);

        System.out.println();
        Collection<String> keys = person.keySet();
        keys.forEach(System.out::println);

        System.out.println();
        //  person.forEach((key, value) -> System.out.println(key + " => " + value));
        for (Map.Entry<String, String> pair: person.entrySet()) {
            System.out.println(pair.getKey() + " => " + pair.getValue());
        }


        System.out.println();
        for (String key: person.keySet()){
            String val = person.get(key);
            System.out.println(key + " => " + val);
        }

        System.out.println();
        person.replace("nombre", "Francisco");
        boolean b3 = person.replace("nombre","Juan" ,"Francisco");
        System.out.println( b3 );
        person.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
