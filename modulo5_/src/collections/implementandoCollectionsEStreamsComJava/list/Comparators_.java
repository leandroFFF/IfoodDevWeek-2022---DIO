package collections.implementandoCollectionsEStreamsComJava.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/*
* Comparators
* interfaces que aprendemos
*       java.util.Comparator - interface para definir classe com regra de ordenação
*       java.util.Comparable - interface para sefinir regra de ordenacao em uma classe de dominio
* Algoritmo de ordenacao
* Utilizado primariamente em java.util.List
* Permite a ordenacao de objetos complexos (criados pelo usuario)
* */
public class Comparators_ {
    public static void main(String[] args) {
        HashMap<String, Integer> alunos = new HashMap<>();
        alunos.put("Leandro", 34);
        alunos.put("Isabelle", 26);
        alunos.put("Alice", 4);
        alunos.put("Leonardo", 33);
        alunos.put("Ladyjane", 27);
        alunos.put("Eduardo", 25);
        alunos.put("Lucas", 21);

        Iterator<Map.Entry<String, Integer>> iterator = alunos.entrySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next().getKey();
            System.out.println(next);
        }
        System.out.println("-------------------------------------------");
        HashMap<Aluno, Integer> alunoHashMap = new HashMap<>();
        alunoHashMap.put(new Aluno("Leandro", 34), 1);
        alunoHashMap.put(new Aluno("Leonardo", 33), 2);
        alunoHashMap.put(new Aluno("Ladyjane", 27), 3);
        alunoHashMap.put(new Aluno("Eduardo", 25), 4);
        alunoHashMap.put(new Aluno("Lucas", 22), 5);


        for (Map.Entry<Aluno, Integer> item : alunoHashMap.entrySet()) {
            System.out.println(item.getKey().nome + " - " + item.getKey().idade);
        }

    }

    static class Aluno{
        String nome;
        Integer idade;

        Aluno(String nome, Integer idade) {
            this.nome = nome;
            this.idade = idade;
        }
    }
    
}
