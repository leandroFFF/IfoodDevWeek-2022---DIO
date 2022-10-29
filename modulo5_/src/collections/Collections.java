package collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        /*
        * */

        /*
        List<Integer> listaList;            //List tem indice e pode repetir valores
        lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(null);
        lista.add(null);
        lista.add(1);
        print(listaList);
         */

        /*TUDO QUE SOR COLOCAR NO SET PRECISA SER COMPARAVEL

        Set<Integer> listaSet = new HashSet<>();    //Set nao tem indice, nao tem ordem e nao pode repetir valores
        listaSet.add(1);
        listaSet.add(3);
        listaSet.add(null);
        listaSet.add(null);
        listaSet.add(1);
        printSet(listaSet);
         */

        Map<String, Integer> map = new HashMap<>();
        map.put("joao", 20);
        map.put(null, 40);
        if (!map.containsKey(null)) map.put(null, 50);
        if (!map.containsKey("joao")) map.put("joao", null);
        map.put("carlos", null);
        map.put("pedro", 55);
        printMap(map);




        /*
        String pokemon1 = "Nidoking";
        String pokemon2 = "Mewtwo";
        String pokemon3 = "Zapdos";

        ArrayList<String> pokemons = new ArrayList<>();

        pokemons.add(pokemon1);
        pokemons.add(pokemon2);
        pokemons.add(pokemon3);

        System.out.println(pokemons);

        java.util.Collections.sort(pokemons);
        System.out.println(pokemons);

        pokemons.add(pokemon3);
        System.out.println(pokemons);

        HashSet<Object> listaNaoDuplicada = new HashSet<>(pokemons);
        System.out.println(listaNaoDuplicada);
         */
    }

    private static void print(List<Integer> item) {
        for (int i = 0; i < item.size(); i++){
            System.out.println(item.get(i));
        }
    }

    private static void printSet(Set<Integer> itemSet) {
        Iterator<Integer> iterator = itemSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printMap(Map<String, Integer> itemMap) {
        itemMap.forEach((chave, valor) -> {
            System.out.println("Chave: " + chave + ", valor: " + valor);
        });
    }
}
