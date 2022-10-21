package estruturasDeRepeticao_ArraysEmJava;

import java.util.Random;

public class Arrays_NumerosAleatorios {
    /*
    * Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100) armazene-os num vetor.
    * Ao final mostre os numeros e seus sucessores.
    * */

    public static void main(String[] args) {
        Random random = new Random();       //classe para gerar numeros aleatorios

        int[] numerosAleatorios = new int[20];      //vetor de 20 posicoes

        for (int i = 0; i < numerosAleatorios.length; i++) {    //for para preencher o vetor com os numeros aleatorios
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números antecessores: ");
        for (int antecessor : numerosAleatorios) {          //for para printar o vetor de numeros antecessores
            System.out.print((antecessor - 1) + " ");
        }

        System.out.println("\nNúmeros aleatórios: ");
        for (int numero : numerosAleatorios) {              //for para printar o vetor de numeros aleatorios
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos numeros aleatórios: ");
        for (int sucessor : numerosAleatorios) {            //for para printar o vetor de numeros sucessores
            System.out.print((sucessor + 1) + " ");
        }
    }
}