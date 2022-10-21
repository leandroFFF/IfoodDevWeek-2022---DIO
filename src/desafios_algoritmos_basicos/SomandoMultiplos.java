package desafios_algoritmos_basicos;
/*
* Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.
Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
* */
import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        int A, N;
        int soma = 0;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for (int i = 1; i < N; i++){
            if (i * A <= N) {

                soma += (i * A);
            }
        }
        System.out.println(soma);


    }
}
