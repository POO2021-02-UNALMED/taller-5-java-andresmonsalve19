package main;

import zooAnimales.*;

public class Main {

    public static void main(String[] args) {
        new Anfibio();
        new Anfibio();
        new Mamifero();
        new Mamifero();
        new Mamifero();
        new Reptil();
        new Pez();
        new Ave();
        new Ave();
        boolean ok = false;
        String  comp = "Mamiferos: 3\n" +
                "Aves: 2\n" +
                "Reptiles: 1\n" +
                "Peces: 1\n" +
                "Anfibios: 2";
        if(Animal.totalPorTipo().equals(comp)) {
            ok = true;
        }

        System.out.println(comp);
        System.out.println("----------------------");
        System.out.println(Animal.totalPorTipo());
        System.out.println("----------------------");
        System.out.println(ok);
    }
}
