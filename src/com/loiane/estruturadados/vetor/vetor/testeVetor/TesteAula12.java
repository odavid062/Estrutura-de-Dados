package com.loiane.estruturadados.vetor.vetor.testeVetor;

import java.util.ArrayList;

public class TesteAula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList); // [A, C]

        arrayList.add(1, "B");

        System.out.println(arrayList); // [A, B, C]

        // Verifica se "A" existe
        boolean existe = arrayList.contains("A");
        if (existe) {
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        // Verifica se "D" existe, usando indexOf
        int pos = arrayList.indexOf("D");
        if (pos > -1) {
            System.out.println("Elemento 'D' existe no array na posição: " + pos);
            System.out.println("Valor encontrado: " + arrayList.get(pos));
        } else {
            System.out.println("Elemento 'D' não existe no array. Resultado da busca: " + pos);
        }

        // Verificação segura antes de acessar a posição 5
        if (arrayList.size() > 5) {
            System.out.println(arrayList.get(5));
        } else {
            System.out.println("⚠️ Não existe valor na posição 5 do array.");
        }

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);


        System.out.println(arrayList.size());



    }
}
