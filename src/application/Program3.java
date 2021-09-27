package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {
        //USANDO A FUNÇÃO LAMBDA

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto(15600.00, "tv 4K panasonic"));
        lista.add(new Produto(1200.55, "geladeira simples"));
        lista.add(new Produto(1980.66, "Cama de Belixe"));
        lista.add(new Produto(1300.00, "Armario simples"));
    //DEFININDO UMA FUNÇÃO ANÔNIMA
                                     //  (Produto p1, Produto p2) ->{
        Comparator<Produto> comparator = (p1, p2) ->{
            return p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase());
        };


        //ordenar
        lista.sort(comparator);

        for(Produto p: lista){
            System.out.println(p);
        }

    }


}
