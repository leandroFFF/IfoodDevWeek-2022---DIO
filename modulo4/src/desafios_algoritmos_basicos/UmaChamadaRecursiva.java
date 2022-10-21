package desafios_algoritmos_basicos;
/*
* Descrição
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.
Entrada
A Entrada será composta por um número inteiro, N.
Saída
Será  impresso o somatório de N até 0, como no exemplo a baixo:
* */
import java.util.Scanner;

public class UmaChamadaRecursiva {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        System.out.println(somatorio(num));
    }
    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
