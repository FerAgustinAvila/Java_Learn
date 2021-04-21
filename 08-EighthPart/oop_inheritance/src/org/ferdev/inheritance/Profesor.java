package org.ferdev.inheritance;

public class Profesor extends Persona{
    private String materia;

    public Profesor(){
        System.out.println(" Profesor: iniciando constructor... ");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String materia) {
        super(nombre, apellido);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String saludar() {
        return "Buenas! Soy profesor de " + getMateria() + " y mi nombre es: " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "\nmateria='" + materia + '\'';
    }
}
