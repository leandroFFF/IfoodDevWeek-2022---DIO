package collections.Set;

import java.util.*;

/*
* biblioteca java.util.Set
*
* nao permite elementos duplicados
* nao possui indice
*
* <<interface>> Collection
        * <<interface>> Set
            * <<interface>> SortedSet
                * <<interface>> NavigableSet
                    *   TreeSet
        * HashSet
            * LinkedHashSet

* */
public class Set {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        java.util.Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posicao da nota 5.0: ");    //o Set nao utiliza indice portanto nao sera possivel
        //System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");      //mesmo motivo do anterior
        //System.out.println("Substitua a nota 5.0 pela nota 6.0: ");     //mesmo motivo do anterior
        //System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        //System.out.println("Exiba a terceira nota adicionada: ");   //nao é possivel pois nao temo metodo get
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + soma / notas.size());

        System.out.println("Remova a nota 0: ");
        System.out.println(notas);
        notas.remove(0d);
        System.out.println(notas);

        //System.out.println("Remova a nota da posicao 0: ");       //o set nao trabalha com posicao

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram informados: ");
        java.util.Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);
        java.util.Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas3.clear();
        System.out.println(notas3);

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto3 está vazio: " + notas3.isEmpty());


    }
}
