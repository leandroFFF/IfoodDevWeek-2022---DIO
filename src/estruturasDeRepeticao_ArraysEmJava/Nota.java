package estruturasDeRepeticao_ArraysEmJava;

import java.util.Scanner;

public class Nota {
    /*
     * Faça um programa que peça uma nota, entre zero e dez.
     * Mostre uma mensagem caso o valor seja invalido
     * e continue pedindo
     * até que o usuario informe um valor valido
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.print("Nota: ");
        nota = scan.nextInt();
        while(nota < 0 || nota > 10){
            System.out.print("Nota inválida!\n informe uma entre 0 e 10:  ");
            nota = scan.nextInt();
        }
    }
}
