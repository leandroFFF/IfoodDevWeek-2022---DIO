package estruturasDeRepeticao_ArraysEmJava;

import java.util.Scanner;

public class Maior_e_Media {
    /*
    * Faça um programa que leia 5 numeros
    * e informe o maior numero
    * e a media desses numeros
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        int maior = 0;
        double soma = 0;
        double media = 0;

        do{
            System.out.println("Informe o " + (cont + 1) + " Número: ");
            int num = scan.nextInt();

            if(maior < num) {   //coleta o maior numero digitado
                maior = num;
            }

            soma+=num;

            cont++;
        }while (cont < 5);
        System.out.println("Maior numero digitado foi: " + maior);

        media = soma / 5;
        System.out.println("Media: " + media);
    }
}