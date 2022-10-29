package collections.implementandoCollectionsEStreamsComJava.list;

import java.util.*;

/*
* java.util.Hashset             //nao permite duplicidade | nao permite ordenacao | é mais performatica
* java.util.LinkedHashSet       //nao permite duplicidade | mantem a ordem de insercao | é a mais lenta
* java.util.TreeSet             //nao permite duplicidade | mantem a ordem de insercao e permite ordenacao por comparators
*
* por padrao nao garante ordem
*
* nao permite itens repetidos
*
* permite a adicao e remocao normalmente.
* nao possui busca por item e atualizacao.
* para leitura, apenas navegacao
*
* nao permite mudanca de ordenacao
*
* */
public class Set_ {
    public static void main(String[] args) {
        //IMPLEMENTACAO DO HASHSET
        /*
        Set<Double> notasAluno = new HashSet<>();      //nao permite duplicidade | nao permite ordenacao | é mais performatica
        notasAluno.add(5.8);
        notasAluno.add(9.3);
        notasAluno.add(6.5);
        notasAluno.add(10d);
        notasAluno.add(5.4);
        notasAluno.add(7.3);
        notasAluno.add(3.8);
        notasAluno.add(4d);

        System.out.println(notasAluno);

        notasAluno.remove(3.8);     //remove o objeto 3.8 do set
        System.out.println(notasAluno);

        System.out.println(notasAluno.size());  //retorna a quantidade de itens do set

        Iterator<Double> iterator = notasAluno.iterator();  //navega todos os itens do set
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------");
        for (Double nota : notasAluno) {
            System.out.println(nota);
        }

        notasAluno.clear();
        System.out.println(notasAluno.isEmpty());
         */



        //IMPLEMENTACAO DO HASHSET
        /*
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        //Adiciona os numeros no set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);
        System.out.println(sequenciaNumerica);
        System.out.println(sequenciaNumerica.remove(4));    //Remove o numero do set
        System.out.println(sequenciaNumerica);
        System.out.println(sequenciaNumerica.size());           //retorna o tamanho do set
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer numero : sequenciaNumerica) {
            System.out.println(numero);
        }
        System.out.println("Lista está vazia: " + sequenciaNumerica.isEmpty());
        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica);
         */

        //IMPLEMENTANDO O TREESET
        TreeSet<String> treeCapitais = new TreeSet<>();
        //Monta a arvore com as capitais
        treeCapitais.add("Porto alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.first());   //Retorna a primeira capital no topo da arvore

        System.out.println(treeCapitais.last());    //retorna a ultima capital no final da arvore

        System.out.println(treeCapitais.lower("Florianópolis"));    //retorna a primeira capital abaico na arvore da capital parametrizada

        System.out.println(treeCapitais.floor("Florianópolis"));    //retorna a primeira capital acima na arvore da capital parametrizada

        System.out.println(treeCapitais);   //exibir todas as capitais no console

        System.out.println(treeCapitais.pollFirst());   //retorna a primeira capital no topo da arvore, removendo do set

        System.out.println(treeCapitais.pollLast());   //retorna a ultima capital no final da arvore, removendo do set

        Iterator<String> iterator = treeCapitais.iterator();    //navega em todos os itens do iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
