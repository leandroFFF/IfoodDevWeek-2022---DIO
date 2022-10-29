package collections.implementandoCollectionsEStreamsComJava.list;
/*
 * java.util.Vector;
 *
 * implementacoes que aprenderemos
 *       java.util.ArrayList
 *       java.util.Vector
 * garante uma ordem de insercao
 * permite adicao, atualizacao, leitura e remocao sem regras adicionais
 * permite ordenacao atraves de comparators
 *
 * */
import java.util.List;
import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        //Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis");
        esportes.add("Handbol");
        //Exibe o Vector
        System.out.println(esportes);
        //Altera o valor da posicao 2 no vetor
        esportes.set(2,"Ping Pong");
        //Remove o esporte da posicao 2
        esportes.remove(2);
        //Remove o esporte da posicao 2
        esportes.remove("Handebol");
        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));
        //Navega nos esportes
        for (String esporte : esportes ){
            System.out.println(esporte);
        }

    }
}
