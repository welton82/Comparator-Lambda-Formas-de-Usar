package application;


//import java.io.*;
import entities.Produto;

import java.io.*;
import java.util.*;
//import java.util.*;

public class Program {

    public static void main(String[] args) {
//1ª MANEIRA DE USAR COMPARETO
        Scanner sc = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto(15600.00, "tv 4K panasonic"));
        lista.add(new Produto(1200.55, "geladeira simples"));
        lista.add(new Produto(5625.32, "Máquina de lavar"));
        lista.add(new Produto(1300.00, "Armario simples"));

        //ordenar
        lista.sort(new MyComparator());

        for(Produto p: lista){
            System.out.println(p);
        }




    }

}
