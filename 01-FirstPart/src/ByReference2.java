import java.lang.String;


class Person {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class ByReference2 {
    public static void main(String[] args) {

        Person person = new Person();
        person.modificarNombre("Fernando");

        System.out.println("iniciamos el método main");

        System.out.println("persona.nombre = " + person.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(person);
        System.out.println("Después de llamar al método test");

        System.out.println("persona.nombre = " + person.leerNombre());

        System.out.println("Finaliza el método main con los datos de la persona modificados!");
    }

    public static void test(Person person){
        System.out.println("Iniciamos el método test");
        person.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}

