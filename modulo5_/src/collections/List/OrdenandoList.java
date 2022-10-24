package collections.List;
/*
* Dadas as seguintes informacoes sobre meus gatos, crie uma lista
* e ordene esta lista exibindo:
* (nome - idade - cor);
*
* Gato 1 = nome: Jon, idade: 18, cor: preto
* Gato 2 = nome: Simba, idade: 6, cor: tigrado
* Gato 3 = nome: Jon, idade: 12, cor: amarelo
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoList {
    public static void main(String[] args) {
        //Criando uma lista do tipo Gato
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);  //precisou sobrescrever o toString()

        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);        //precisou implementar Comparable na classe Gato e sobrescrever o compareTo
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());   //criado a class ComparatorIdade e o metodo compare
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Cor\t---");
        meusGatos.sort(new ComparatorCor());        //criado a class ComparatorCor
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

//CRIANDO OUTRA CLASSE
class Gato implements Comparable<Gato> {
    //Atributos
    private String nome;
    private Integer idade;
    private String cor;

    //Construtor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //Métodos Getters
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Sobrescrita
    @Override
    public String toString(){
        return "{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", cor: '" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}