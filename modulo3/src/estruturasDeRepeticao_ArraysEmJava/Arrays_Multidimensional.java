package estruturasDeRepeticao_ArraysEmJava;

import java.util.Random;

public class Arrays_Multidimensional {
    /*
    * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
    * */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrizAleatoria = new int[4][4];

        System.out.println("Matriz: 4 x 4");
        /*============PRIMEIRA FORMA DE FAZER================
        for (int i = 0; i < matrizAleatoria.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                int numeroAleatorio = random.nextInt(0, 9);
                matrizAleatoria[i][j] = numeroAleatorio;
                System.out.print("[" + numeroAleatorio + "]");
            }
        }
         */
        /*============SEGUNDA FORMA DE FAZER==================*/
        for (int i = 0; i < matrizAleatoria.length; i++){           //cria as linhas da matriz
            for (int j = 0; j < matrizAleatoria[i].length; j++) {   //cria as colunas da matriz
                int numeroAleatorio = random.nextInt(9);     //gera um numero aleatorio
                matrizAleatoria[i][j] = numeroAleatorio;            //insere o numero aleatorio no elemento da matriz
            }
        }

        for (int[] linha : matrizAleatoria) {                       //
            for (int coluna : linha) {
                System.out.print("[" + coluna + "] ");
            }
            System.out.println();
        }
    }
}
