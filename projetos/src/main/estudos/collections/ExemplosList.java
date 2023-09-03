package main.estudos.collections;

import java.util.ArrayList;
import java.util.List;

public class ExemplosList {

    public static void main(String[] args) {
        List<Pessoa> listPessoas = new ArrayList<>();

        listPessoas.add(new Pessoa(1, "Isac"));
        listPessoas.add(new Pessoa(2, "Kaik"));
        listPessoas.add(new Pessoa(3, "Katy"));
        listPessoas.add(new Pessoa(4, "Carol"));

        for(Pessoa i : listPessoas){
            System.out.println(i.getNome());
        }

        System.out.println("--------------------");

        Pessoa a = listPessoas.get(2);

        listPessoas.add(a); // permite objetos repetidos

        for(Pessoa i : listPessoas){
            System.out.println(i.getNome());
        }
    }

}
