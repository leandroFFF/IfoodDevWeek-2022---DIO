package estruturasDeRepeticao_ArraysEmJava;

import java.util.Scanner;

public class ParImpar {
    /*
    * Faça um programa que peça N numeros inteiros
    * calcule e mostre a quantidade de numeros pares
    * e a quantidade de numeros impares
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        int num = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Informe a quantidade de numeros: ");
        int qtd = scan.nextInt();

        do{
            System.out.println("Numero: ");
            num = scan.nextInt();

            if(num % 2 == 0) {
                par+=1;
            }else {
                impar+=1;
            }

            cont+=1;
        }while(cont < qtd);

        System.out.println("Números Pares: " + par);
        System.out.println("Números Ímpares: " + impar);
    }
}
