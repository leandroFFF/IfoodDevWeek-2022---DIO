package estruturasDeRepeticao_ArraysEmJava;

import java.util.Scanner;

public class ExercicioNomeIdade {
    /*
     * Faça um programa que leia conjuntos de dois valores,
     * o primeiro representando o nome do aluno e o segundo representando a sua idade.
     * (Pare o programa inserindo o valor 0 no campo nome)
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeAluno;
        int idade;

        while (true){
                System.out.println("Nome no aluno: ");
                nomeAluno = scanner.next();
                if(nomeAluno.equals("0"))
                    break;

                System.out.println("Idade do aluno:");
                int idadeAluno = scanner.nextInt();
        }
        System.out.println("Continua aqui...");

    }
}
