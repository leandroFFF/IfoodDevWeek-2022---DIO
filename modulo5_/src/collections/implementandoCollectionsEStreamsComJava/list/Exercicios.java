package collections.implementandoCollectionsEStreamsComJava.list;

import java.util.*;

/*
* Crie um lista e execute as seguintes operacoes
*
* Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
* Navegue na lista exibindo cada nome no console
* Substitua o nome Carlos por Roberto
* Retorne o nome da posicao 1
* Remova o nome da posicao 4
* Remova o nome Joao
* Retorne a quantidade de itens da lista
* Verifique se o nome Juliano existe na lista
* Crie uma nova lista com os nomes: Ismael e Rodrigo
* adicione todos os itens da l=nova lista na primeira lista criada
* Ordene os itens da lista por ordem alfabética
* Verifique se a lista está vazia
* */
public class Exercicios {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(){{
            add("Juliana");
            add("Pedro");
            add("Carlos");
            add("Larissa");
            add("João");
        }};
        System.out.println("------------FOR EACH-----------------");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------- WHILE ITERATOR----------------");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------- Substituir Carlos por Roberto ----------------");
        nomes.set(2, "Roberto");
        System.out.println(nomes);
        System.out.println("------------- Retorne o nome da posicao 1 ----------------");
        System.out.println("Objeto da posicao 1: " + nomes.get(1));
        System.out.println("------------- Remova o nome da posicao 4 ----------------");
        nomes.remove(4);
        System.out.println(nomes);
        System.out.println("------------- Remova o nome Joao ----------------");
        nomes.remove("Joao");
        System.out.println(nomes);
        System.out.println("------------- Retorne a quantidade de itens da lista ----------------");
        System.out.println("Quantidade de itens da lista: " + nomes.size());
        System.out.println("------------- Verifique se o nome Juliano existe na lista ----------------");
        boolean contemJuliano = nomes.contains("Juliano");
        if (contemJuliano) {
            System.out.println("Juliano existe na lista? Sim!");
        }else {
            System.out.println("Juliano existe na lista? Não!");
        }
        System.out.println("------------- Crie uma nova lista com os nomes: Ismael e Rodrigo ----------------");
        List<String> nomesNovos = new ArrayList<>(){{
            add("Ismael");
            add("Rodrigo");
        }};

        System.out.println("------------- adicione todos os itens da nova lista na primeira lista criada ----------------");
        System.out.println(nomes);
        nomes.addAll(nomesNovos);
        System.out.println(nomes);
        System.out.println("------------- Ordene os itens da lista por ordem alfabética ----------------");
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("------------- Verifique se a lista está vazia ----------------");
        boolean listaestaVazia = nomes.isEmpty();
        if (listaestaVazia) {
            System.out.println("Listra está vazia? Sim!");
            System.out.println(nomes);
        }else {
            System.out.println("Listra está vazia? Não!");
            System.out.println(nomes);
        }










    }
}
