package collections.Map;

import java.util.*;

/*
biblioteca java.util.Map

elementos unicos (key) para cada valor (value)

* <<interface>> Map
*       Hashtable   ->  itera de acordo com a "ordem de inserção", permite chaves nulas
*       Hashmap    ->    itera os elementos "aleatoriamente", permite chaves nulas
*           LinkedHashMap
*       <<interface>> SortedMap
*           <<interface>> NavegableMap
*               TreeMap    ->    itera os elementos de acordo com a "ordem natural das chaves", NAO permite chaves nulas

* */
public class Map {
    public static void main(String[] args) {
        System.out.println("crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        java.util.Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno") + " km/l");

        //System.out.println("Exiba o terceiro modelo adicionado: "); //nao tem como puxar a ordem

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<java.util.Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (java.util.Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente + " km/l");
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<java.util.Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (java.util.Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("Exiba a media dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator3 = carrosPopulares.values().iterator();
        while (iterator3.hasNext()){
            if (iterator3.next().equals(15.6)) {
                iterator3.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram inseridos: ");
        java.util.Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        java.util.Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares2.clear();
        System.out.println(carrosPopulares2);

        System.out.println("Confira se a lista está vazia: " + carrosPopulares2.isEmpty());


    }
}
