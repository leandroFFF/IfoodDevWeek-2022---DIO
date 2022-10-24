package collections.List.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
* Faça um programa que receba a temperatura média dos 6
* primeiros meses do ano e armazene-os em uma lista.
* Após isto, calcule a media semestral das temperaturas e mostre todas as temperaturas acima desta media,
* e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
* */
public class ExercicioMediaTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temps = new ArrayList<>();

        int cont = 0;
        double soma = 0;
        while (cont < 6) {
            System.out.println("Informe a temperatura média do " + (cont + 1) + "º mês: ");
            temps.add(sc.nextDouble());
            soma += temps.get(cont);
            cont++;
        }
        System.out.println(temps);
        System.out.println("Média de temperatura dos 6 primeiros meses do ano: " + (soma / 6));
        //Collections.
    }
}
