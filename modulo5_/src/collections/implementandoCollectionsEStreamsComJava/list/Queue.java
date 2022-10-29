package collections.implementandoCollectionsEStreamsComJava.list;
/*
* java.util.Queue;
*
* garante ordem de insercao
*
* permite adicao, leitura e remocao considerando a regra básica de uma fila: Primeiro que entra, primeiro que sai
*
* nao permite mudanca de ordenacao
*
* */

import java.util.Iterator;
import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();      //retorna o primeiro elemento da fila e retira da lista
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();          //retorna o primeiro elemento da lista mas nao retira da lista;
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element(); //retorna o primeiro da lista ou um erro
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }

        Iterator<String> iterator = filaBanco.iterator();
        System.out.println("-------------------------------");
        while (iterator.hasNext()) {
            System.out.println("--->" + iterator.next());
        }

        System.out.println("Temanho da fila: " + filaBanco.size());
        System.out.println("Fila está vazia: " + filaBanco.isEmpty());



    }

}
