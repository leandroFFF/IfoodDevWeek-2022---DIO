package collections.implementandoCollectionsEStreamsComJava.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
 * java.util.List
 *
 * implementacoes que aprenderemos
 *       java.util.ArrayList
 *       java.util.Vector
 * garante uma ordem de insercao
 * permite adicao, atualizacao, leitura e remocao sem regras adicionais
 * permite ordenacao atraves de comparators
 *
 * */
public class List_ {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        nomes.set(2, "Larissa");        //Seta a posicao 2 para Larissa
        System.out.println(nomes);
        Collections.sort(nomes);        //Ordena a ordem crescente
        nomes.set(2, "Wesley");         //Seta a posicao 2 para Wesley
        System.out.println(nomes);
        nomes.remove(4);          //remove a posicao 4
        System.out.println(nomes);
        nomes.remove("Wesley");     //remove o objeto Wesley
        System.out.println(nomes);
        String nome = nomes.get(3);    //retorna o objeto da indice 1
        System.out.println("Objeto do indice 1: " + nome);
        int posicao = nomes.indexOf("Carlos");      //retorna o index do objeto Carlos
        System.out.println("Index do objeto Carlos: ");
        int tamanho = nomes.size();    //retorna o tamanho da lista
        System.out.println("Tamanho da lista: " + tamanho);
        boolean temAnderson = nomes.contains("Anderson");   //retorna um boolean se tem ou nao Anderson na lista
        System.out.println("Tem Anderson: " + temAnderson);
        boolean listaEstaVazia = nomes.isEmpty();           //retorna se a lista está vazia
        System.out.println("Lista está vazia: " + listaEstaVazia);
        for (String nomeDoItem : nomes ) {
            System.out.println(nomeDoItem);
        }
//        nomes.clear();
        listaEstaVazia = nomes.isEmpty();       //verifica se a lista está vazia
        System.out.println("Lista está vazia: " + listaEstaVazia);

        Iterator<String> iterator = nomes.iterator();
        System.out.println("---\t---------------------------------\t---");
        while (iterator.hasNext()) {        //hasNext() retorna true sempre que tem um proximo elemento na lista
            System.out.println(iterator.next());
        }
        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        if (listaEstaVazia) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("A lista NAO está vazia!");
        }


    }
}
