package estruturasDeRepeticao_ArraysEmJava;

import java.util.Scanner;

public class Fatorial {
    /*
    * Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario.
    * Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero: ");
        int num = scan.nextInt();
        int fatorial = num;
        System.out.print(num);
        for(int i = 0; i < num; i++){
            num-= 1;
            fatorial *= num;
        }
        System.out.println("! = " + fatorial);
    }
}
