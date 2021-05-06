package org.ferdev.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {

    private List<Component> hijos;

    public Directory(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directory addComponente(Component c){
        hijos.add(c);
        return this;
    }

    public void removeComponente(Component c){
        hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {

        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");
        for(Component hijo: this.hijos){
            sb.append(hijo.mostrar(nivel+1));
            if(hijo instanceof File) {
               sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
        return hijos.stream().anyMatch(h -> h.buscar(nombre));
    }
}
