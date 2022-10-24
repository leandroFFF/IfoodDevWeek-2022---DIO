package collections.Set;


import java.util.*;

/*Dadas as seguintes informacoes sobre minhas series favoritas
crie um conjunto e ordene este conjunto exibindo:
(home - genero - tempo de episodio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = Nome: that '70s show, genero: comedia, tempoEpisodio: 25
* */
public class OrdenacaoDeElementosColecaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t---");
        java.util.Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie : minhasSeries) {
            System.out.println(
                    serie.getNome() + " - " +
                    serie.getGenero() + " - " +
                    serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem de Inserção\t---");
        java.util.Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie1 : minhasSeries1) {
            System.out.println(
                    serie1.getNome() + " - " +
                    serie1.getGenero() + " - " +
                    serie1.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Natural (tempoEpisodio)\t---");
        java.util.Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie2 : minhasSeries2) {
            System.out.println(                     //preciso implementar o Comparable na classe Serie
                    serie2.getNome() + " - " +
                    serie2.getGenero() + " - " +
                    serie2.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t---");
        java.util.Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie3 : minhasSeries3) {
            System.out.println(                     //preciso implementar a classe Comparator na classe Serie
                    serie3.getNome() + " - " +
                    serie3.getGenero() + " - " +
                    serie3.getTempoEpisodio());
        }

//        System.out.println("--\tOrdem Genero\t---");

//        System.out.println("--\tOrdem de Tempo Episodio\t---");
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}