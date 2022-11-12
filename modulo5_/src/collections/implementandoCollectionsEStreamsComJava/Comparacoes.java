package collections.implementandoCollectionsEStreamsComJava;

import java.awt.image.ImageProducer;
import java.util.*;

public class Comparacoes {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Leandro");
        lista.add("Leonardo");
        lista.add("Ladyjane");
        lista.add("Eduardo");
        lista.add("Lucas");

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        List<Protuto> protutos = new ArrayList<>(){{
            add(new Protuto("Maça", 5.60));
            add(new Protuto("Goiaba", 4.23));
            add(new Protuto("Acerola", 7.50));
            add(new Protuto("Banana", 3.80));
            add(new Protuto("Caju", 4.70));
            add(new Protuto("Abacaxi", 3.00));
        }};

        Collections.sort(protutos);
        System.out.println(protutos);
    }
    public static class Protuto implements Comparable<Protuto>{
        private String nome;
        private Double preco;

        public String getNome() {
            return this.nome;
        }

        public Double getPreco() {
            return this.preco;
        }

        Protuto(String nome, Double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return "{ " +
                    "nome = '" + nome + '\'' +
                    ", preco = " + preco +
                    " }";
        }

        @Override
        public int compareTo(Protuto o) {
            if (this.getPreco() < o.getPreco()) return -1;
            if (this.getPreco() > o.getPreco()) return 1;
            return 0;
        }
    }
}

