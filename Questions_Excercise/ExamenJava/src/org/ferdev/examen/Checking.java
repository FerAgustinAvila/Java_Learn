package org.ferdev.examen;

import java.util.List;

public class Checking extends Account{

    public void say(List<String> list){
        System.out.println("chidd");
    }

    public void withdraw(int a){
        System.out.println("Desde checking " + a );
    }
}
