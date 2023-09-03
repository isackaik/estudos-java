package main.estudos.collections;

import java.util.HashMap;
import java.util.Map;

public class ExemplosMap {

    public static void main(String[] args) {

        Map<Integer, Pessoa> mapPessoas = new HashMap<>();

        Pessoa a = new Pessoa(1, "Isac");
        Pessoa b = new Pessoa(2, "Kaik");

        mapPessoas.put(a.getId(), a);
        mapPessoas.put(b.getId(), b);

        System.out.println("Pessoa: " + mapPessoas.get(2).getNome());

    }

}
