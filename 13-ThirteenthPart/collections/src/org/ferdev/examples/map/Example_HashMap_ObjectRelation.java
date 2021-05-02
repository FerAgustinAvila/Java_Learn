package org.ferdev.examples.map;

import java.util.HashMap;
import java.util.Map;

public class Example_HashMap_ObjectRelation {
    public static void main(String[] args) {

        Map<String, Object> person = new HashMap<>();
        person.put("nombre", "John");
        person.put("apellido", "Doe");
        person.put("email", "john@correo.com");
        person.put("edad", "40");

        Map<String, String> address = new HashMap<>();
        address.put("Pais", "Argentina");
        address.put("Estado", "Cordoba");
        address.put("Ciudad", "Capital");
        address.put("Calle", "Av Siempre Viva");
        address.put("Numero", "742");

        person.put("direccion", address);

        String nombre = (String) person.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) person.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> addressPerson = (Map<String, String>)person.get("direccion");
        String pais = addressPerson.get("Pais");
        String ciudad = addressPerson.get("Ciudad");
        String barrio = addressPerson.getOrDefault("Barrio", "Springfield");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad);
        System.out.println("El barrio de " + nombre + " es: " + barrio);

        System.out.println();
        for(Map.Entry<String, Object> par: person.entrySet()){
            Object val = par.getValue();
            if(val instanceof Map){
                Map<String, String> addressMap = (Map<String, String>) val;
                System.out.println("--------- Direccion ---------");
                for(Map.Entry<String, String> parDir: addressMap.entrySet()){
                    System.out.println(parDir.getKey() + " === " + parDir.getValue());
                }
            }
            else {
                System.out.println(par.getKey() + " => " + val);
            }
        }

        System.out.println();
        for(String key: person.keySet()){
            Object val = person.get(key);
            if(val instanceof Map){
                String nom = (String) person.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) val;
                System.out.println("El país de " + nom + ": "   + direccionMap.get("Pais"));
                System.out.println("El estado de " + nom + ": " + direccionMap.get("Estado"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("Ciudad"));
            } else {
                System.out.println(key + " => " + val);
            }
        }
    }
}
