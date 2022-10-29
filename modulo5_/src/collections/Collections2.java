package collections;

import relacoes.associacao.exercicio1.Pessoa;

import java.util.*;
import java.util.Collections;

/*
* */
public class Collections2 {
    public static void main(String[] args) {
        System.out.println("---\tList\t---");
        List_ list_ = new List_();
        
        System.out.println("---\tArrayList\t---");
        Collections_ArrayList collections_arrayList = new Collections_ArrayList();

        System.out.println("---\tSet\t---");
        Set_ set_ = new Set_();

        System.out.println("---\tHashSet\t---");
        Collections_HashSet collections_hashSet = new Collections_HashSet();

        System.out.println("---\tHashSet Pessoa\t---");
        Collections_HashSet Collections_hashSet_pessoas = new Collections_HashSet();

        System.out.println("---\tLinkedHashSet Pessoa\t---");
        Collections_LinkedhashSet_pessoas Collections_linkedhashSet_pessoas = new Collections_LinkedhashSet_pessoas();

        System.out.println("---\tTreeSet\t---");
        Collections_TreeSet collections_treeSet = new Collections_TreeSet();

        System.out.println("---\tTreeSet Pessoa\t---");
        Collections_TreeSet_Pessoas collections_treeSet_pessoas = new Collections_TreeSet_Pessoas();

        System.out.println("---\tStream Pessoa\t---");
        Collections_Stream_Pessoas collections_stream_pessoas = new Collections_Stream_Pessoas();
    }

    static class List_ {
        List_() {
            //Tem ordenação | Pode repetir elemento | nao precisa implementar nada
            List<Integer> arr = new ArrayList<>();
            arr.add(5);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            arr.add(3);
            arr.add(7);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            System.out.println(arr);
        }
    }
    static class Collections_ArrayList {
        private Integer num;
        Collections_ArrayList() {
            //Tem ordenação | Pode repetir elemento | nao precisa implementar nada
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(5);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            arr.add(3);
            arr.add(7);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            System.out.println(arr);
        }
    }
    static class Set_ {
        Set_() {
            //Não tem ordenação | Nao aceita repeticao
            //Todos os Set nao aceitam repeticao (Set/HashSet/LinkedHashSet)
            //HashSet tem o processamento mais rapido que o TreeSet
            Set<Integer> arr = new HashSet<>();
            arr.add(5);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            arr.add(3);
            arr.add(7);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            System.out.println(arr);
        }
    }
    static class Collections_HashSet {
        public Collections_HashSet() {
            //Não tem ordenação | Nao aceita repeticao | Precisa implementar os Métodos equals() e hashcode()
            //Todos os Set nao aceitam repeticao (Set/HashSet/LinkedHashSet)
            //HashSet tem o processamento mais rapido que o TreeSet
            HashSet<String> arr = new HashSet<>();
            arr.add("Ciclano");
            arr.add("Beltrano");
            arr.add("Fulano");
            arr.add("Fulano");
            arr.add("Beltrano2");
            System.out.println(arr);
        }
    }
    static class Collections_hashSet_pessoas {
        Collections_hashSet_pessoas() {
            //Não tem ordenação | Nao aceita repeticao | Precisa implementar os Métodos equals() e hashcode()
            //Todos os Set nao aceitam repeticao (Set/HashSet/LinkedHashSet)
            //HashSet tem o processamento mais rapido que o TreeSet
            HashSet<Pessoa> arr = new HashSet<>();
            arr.add(new Pessoa(2, "Ciclano"));
            arr.add(new Pessoa(3, "Beltrano"));
            arr.add(new Pessoa(1, "Fulano"));
            arr.add(new Pessoa(1, "Fulano"));
            arr.add(new Pessoa(4, "Beltrano2"));
            System.out.println(arr);
        }
    }

    static class Collections_LinkedhashSet_pessoas {
        Collections_LinkedhashSet_pessoas() {
            //mantem a ordem de insercao e indice | Nao aceita repeticao | Precisa implementar os Métodos equals() e hashcode()
            //Todos os Set nao aceitam repeticao (Set/HashSet/LinkedHashSet)
            //HashSet tem o processamento mais rapido que o TreeSet
            HashSet<Pessoa> arr = new LinkedHashSet<>();
            arr.add(new Pessoa(2, "Ciclano"));
            arr.add(new Pessoa(3, "Beltrano"));
            arr.add(new Pessoa(1, "Fulano"));
            arr.add(new Pessoa(1, "Fulano"));
            arr.add(new Pessoa(4, "Beltrano2"));
            System.out.println(arr);
        }
    }
    static class Collections_TreeSet {
        Collections_TreeSet() {
            //Tem ordenacao | Nao aceita repeticao | precisa implementar o Comparable + o compareTo()
            //Todos os Set nao aceitam repeticao (Set/HashSet/LinkedHashSet)
            TreeSet<Integer> arr = new TreeSet<>();
            arr.add(5);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            arr.add(3);
            arr.add(7);
            arr.add(3);
            arr.add(1);
            arr.add(4);
            System.out.println(arr);
        }
    }

    static class Collections_TreeSet_Pessoas {
        public Collections_TreeSet_Pessoas() {
            //Tem ordenacao | Nao aceita repeticao | precisa implementar o Comparable + o compareTo()
            //Todos os Set nao aceitam repeticao (Set/HashSet/LinkedHashSet)
            TreeSet<Pessoa> arr = new TreeSet<>();
            arr.add(new Pessoa(1, "Fulano"));
            arr.add(new Pessoa(1, "Fulano"));   //para diferenciar objetos precisa criar as comparacoes com o compareTo()
            arr.add(new Pessoa(2, "Ciclano"));
            arr.add(new Pessoa(3, "Beltrano"));
            System.out.println(arr);
        }
    }

    static class Collections_Stream_Pessoas {
        public Collections_Stream_Pessoas() {
            //Tem ordenacao | Nao aceita repeticao | Precisa implementar os Métodos equals() e hashcode()
            TreeSet<Pessoa> arr = new TreeSet<>();
            arr.add(new Pessoa(1, "Fulano"));
            arr.add(new Pessoa(1, "Fulano"));
            arr.add(new Pessoa(2, "Ciclano"));
            arr.add(new Pessoa(3, "Beltrano"));
            /*
            arr.stream()                        //stream com operacoes intermediarias
                    .skip(2)                 //manda pular os dois primeiros itens
                    .limit(3)           //processa no maximo 3 itens
                    .distinct()                 //Precisa implementar os Métodos equals() e hashcode()
                    .filter(e -> e.cpf > 0)     //cria um filtro mais específico
                    //.map(e -> e.cpf * 2)        //a lista original nao é modificada  (usar o map por ultimo)
                    .forEach(e -> System.out.println(e));      //funcao lambda
             */
            /*
            long count = arr.stream().count();
            System.out.println("Quantidade de itens: " + count);
             */
            System.out.println(arr.stream().min(Comparator.naturalOrder()));
        }
    }
    static class Pessoa implements Comparable<Pessoa> {
        private Integer cpf;
        private String nome;

        Pessoa(Integer cpf, String nome) {
            this.cpf = cpf;
            this.nome = nome;
        }
        //============================ Para usar o HashSet ===============================
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pessoa pessoa = (Pessoa) o;
            return cpf.equals(pessoa.cpf) && nome.equals(pessoa.nome);
            /* ou assim:
            Pessoa pessoa1 = (Pessoa)o;
            return cpf == pessoa1.cpf;      //compara pelo cpf
            */
        }

        @Override
        public int hashCode() {
            return Objects.hash(cpf, nome);
        }
        //=========================== para impressao ================================
        @Override
        public String toString() {
            return "Pessoa{" +
                    "cpf=" + cpf +
                    ", nome='" + nome + '\'' +
                    '}';
        }
        //=========================== para comparar objetos usando o TreeSet ================================
        @Override
        public int compareTo(Pessoa o) {
            //Se os objetos sao iguais = retorna 0
            //Se o primeiro objeto á Menor/VemAntes que o segundo, retorna um numero negativo
            //Se o primeiro objeto á Maior/VemDepois que o segundo, retorna um numero positivo
            if (this.cpf == o.cpf)  return 0;   //iguais
            if (this.cpf < o.cpf)  return -1;   //Primeiro < Segundo
            else return 1;                      //Primeiro > Segundo

            //Ou poderia ser assim que tbm retornaria (negativo ou zero ou positivo)
            //return this.cpf - o.cpf;
        }
    }
}