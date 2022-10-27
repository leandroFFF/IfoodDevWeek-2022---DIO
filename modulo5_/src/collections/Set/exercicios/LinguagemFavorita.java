package collections.Set.exercicios;

import java.util.*;

/*
* Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:
Ordem de Inserção
Ordem Natural (nome)
IDE
Ano de criação e nome
Nome, ano de criacao e IDE
Ao final, exiba as linguagens no console, um abaixo da outra.
* */
public class LinguagemFavorita {
    public static void main(String[] args) {
        /*
        List<Integer> lista = new ArrayList<>();    //essa lista permite elementos repetidos e trabalha com indice
        lista.add(1);
        lista.add(3);
        lista.add(null);
        lista.add(null);
        lista.add(1);

        printList(lista);

        Set<Integer> set = new HashSet<>();         //essa lista NAO permite elementos repetidos, NAO tem indice e NAO garante uma ordem
        set.add(1);
        set.add(3);
        set.add(null);
        set.add(null);
        set.add(1);

        printSet(set);
*/
        Map<String, Integer> map = new HashMap<>();//essa lista NAO permite elementos repetidos, tem indice personalizado e garante a ordem
        map.put("joao", 20);
        map.put(null, 40);
        map.put(null, 50);
        if (!map.containsKey("joao")) map.put("joao", null);
        map.put("carlos", null);
        map.put("pedro", 55);

        printMap(map);

    }
    public static void printList(List<Integer> itemList) {
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i));
        }
    }

    public static void printSet(Set<Integer> itemSet) {
        Iterator<Integer> iterator = itemSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printMap(Map<String, Integer> mapItem) {
        mapItem.forEach((chave, valor) -> {
            System.out.println("Chave: " + chave + ", valor: " + valor);
        });
    }
}