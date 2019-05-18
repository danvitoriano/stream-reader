package br.com.fiap;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) {
        treeSet();
    }

    static void treeSet(){
        SortedSet<String> nomes = new TreeSet<>();
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Henrique");
        nomes.add("Matias");
        nomes.add("Nascimento");
        nomes.add("Maria");
        System.out.println(nomes);
        System.out.println(nomes.contains("José"));
    }

    static void hashSet(){
        Set<String> nomes = new HashSet<String>();
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Henrique");
        nomes.add("Matias");
        nomes.add("Nascimento");
        nomes.add("Maria");
        System.out.println(nomes);
        System.out.println(nomes.contains("José"));
    }
}
