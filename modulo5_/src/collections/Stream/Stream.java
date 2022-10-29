package collections.Stream;

import java.util.List;

/*
* 1 - Classe anônima
* 2 - Functional Interface
* 3 - Lambda
* 4 - Reference Method
* 5 - Stream API
*
* */
public class Stream {
    public static void main(String[] args) {
        /*
        1 - Classe Anônima = é uma classe que nao recebeu um nome e é tanto declarado e instanciado

        2 - Functional Interface = Qualquer interface com um SAM(Single Abstract Method) é uma interface funcional e
        sua implementacao pode ser tratada como expressoes lambda.
                Comparator
                Consumer
                Function
                Predicate

         3 - Lambda = é uma funcao sem declaracao, nao precisa colocar um nome, um tipo de retorno e o modificador de acesso.
             A ideia é que o metodo seja declarado no mesmo lugar em que será usado.
             As funções lambda em java tem a sintaxe definida como (argumento) -> (corpo/logica).

         4 - Reference Method = permite fazer referencia a um método ou construtor de uma classe (de forma funcional)
         e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível.
         Para utiliza-lo, basta informar uma classe ou referencia seguida do simbolo "::" e o nome do metodo sem os parenteses no final.
         resumindo: serve para simplificar uma funcao lambda
         exemplo:
            lambda                  meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));
            reference Method        meusGatos.sort(Comparator.comparing(Gato::getNome()));

         5 - Stream API = nova opcao para manipulacao de colecoes em Java seguindo os principios da programacao funcional.
         Combinada com expressoes lambda.
         */


    }
}
