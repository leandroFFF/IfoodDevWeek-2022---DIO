package collections.implementandoCollectionsEStreamsComJava.list;

import java.util.*;

/*
* java.util.HashMap
* java.util.HashTable
* java.util.TreeMap
*
* entrada de chave e valor
*
* permite valores repetidos, mas nao permite repeticao de chave
*
* permite adicao, buscar por chave ou valor, atualizacao, remocao e navegacao
*
* pode ser ordenado
*
* */
public class Map_ {
    public static void main(String[] args) {
        /*
        HashMap<String, Integer> campeoesMundialFifa = new HashMap<>();
        //adiciona os campeoes mundiais da fifa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil", 6);       //atualiza o valor para a chave brasil
        System.out.println(campeoesMundialFifa);

        System.out.println(campeoesMundialFifa.get("Argentina"));   //retorna o valor para a chave argentina

        System.out.println(campeoesMundialFifa.containsKey("França"));  //retorna se existe ou não a chave franca

        System.out.println(campeoesMundialFifa.remove("França"));   //remove o campeao França

        System.out.println(campeoesMundialFifa.containsValue(6));   //retorna se existe ou nao alguma selecao hexa campeã

        System.out.println(campeoesMundialFifa.size());     //retorna o tamanho do mapa

        System.out.println(campeoesMundialFifa);

        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {   //navega nos registros do mapa
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : campeoesMundialFifa.keySet()) {                           //navega nos registros do mapa
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));      //verifica se tem a chave Estados Unidos

        System.out.println(campeoesMundialFifa.containsValue(5));                   //verifica se tem o valor 5

        System.out.println(campeoesMundialFifa.size());     //verifica o tamanho do mapa antes de limpar o mapa

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());     //verifica o tamanho do mapa antes de limpar o mapa

         */

        TreeMap<String, String> treeCapitais = new TreeMap<>();
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstKey());        //retorna a primeira capital no topo da arvore

        System.out.println(treeCapitais.lastKey());         //retorna a ultima capital no final da arvore

        System.out.println(treeCapitais.lowerKey("SC"));    //retorna a primeira capital abaixo na arvore da capital parametrizada

        System.out.println(treeCapitais.higherKey("SC"));   //retorna a primeira capital acima na arvore da capital parametrizada

        System.out.println(treeCapitais);                   //exibe todas as capitais no console

        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());  //retorna a primeira capital no topo da arvore

        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());    //retorna a ultima capital no final da arvore

        //Retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println("primeira capital abaixo da arvore de SC");
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println("primeira capital acima da arvore de SC");
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue());

        System.out.println(treeCapitais);                   //exibe todas as capitais no console

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());    //retorna a primeira capital no topo da arvore, removendo do map

        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());      //retorna a primeira capital no final da arvore, removendo do map

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();       //navega em todas as chaves do iterator

        System.out.println("-----------------------------WHILE---------------------------------");
        while (iterator.hasNext()) {
            String key = iterator.next();                                   //
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        System.out.println("-----------------------------FOR (keySet())---------------------------------");
        for (String capital : treeCapitais.keySet()) {
            System.out.println(capital + " -- " + treeCapitais.get(capital));
        }

        System.out.println("----------------------------FOR (entrySet())----------------------------------");
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }




    }
}
