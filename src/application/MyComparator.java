package application;

import entities.Produto;

import java.util.Comparator;
                            //DEVE SER IMPLEMENTADA ESTA INTERFACE
public class MyComparator implements Comparator<Produto> {


    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
