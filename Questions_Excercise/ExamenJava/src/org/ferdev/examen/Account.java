package org.ferdev.examen;

import java.util.List;

public class Account {

    public void say(List<String> list){
        System.out.println("parent");
    }

    public void withdraw(int a){
        System.out.println( a );
    }
}
