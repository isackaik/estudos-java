package main.estudos.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    List<Item> listaItens;

    public Venda(){
        listaItens = new ArrayList<>();
    }

    public void adicionar(Item item){
        if (item == null){
            throw new VendaException(500, "O item não pode ser nulo.");
        } else if (item.getPreco() <= 0){
            throw new VendaException(500, "O valor do item deve ser maior que zero.");
        }
        listaItens.add(item);
    }

    public double getTotal() {
        double total = 0;

        for (Item i : listaItens) {
            total += i.getPreco();
        }

        return total;
    }

}
