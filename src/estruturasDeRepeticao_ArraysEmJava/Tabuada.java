package estruturasDeRepeticao_ArraysEmJava;

import java.util.Scanner;

public class Tabuada {
    /*
    * Desenvolva um gerador de tabuada,
    * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
    * O usuario deve informar de qual numero ele deseja ver a tabuada.
    * Asaída deve ser conforme o exemplo abaixo:
    *
    * Tabuada de 5:
    * 5 x 1 = 5
    * 5 x 2 = 10
    * ...
    * 5 x 10 = 50
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inforem a tabuada desejada: ");
        int tab = scan.nextInt();

        System.out.println("Tabuada de " + tab);
        System.out.println("---------------------");
        for (int cont = 1; cont <= 10; cont++)
            System.out.println(tab + " x " + cont + " = " + (tab * cont));

    }
}
