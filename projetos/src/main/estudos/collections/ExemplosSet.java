package main.estudos.collections;

import java.util.HashSet;
import java.util.Set;

public class ExemplosSet {

    public static void main(String[] args) {

        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa(1, "Isac"));
        pessoas.add(new Pessoa(2, "Kaik"));
        pessoas.add(new Pessoa(3, "Katy"));

        Pessoa a = new Pessoa(4, "Carol");
        pessoas.add(a);

        for(Pessoa i : pessoas){
            System.out.println(i.getNome());
        }

        System.out.println("--------------------");

        pessoas.add(a); // não permite objetos repetidos

        for(Pessoa i : pessoas){
            System.out.println(i.getNome());
        }

    }

}
