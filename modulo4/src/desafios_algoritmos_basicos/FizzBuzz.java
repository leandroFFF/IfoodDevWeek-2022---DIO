package desafios_algoritmos_basicos;

import java.util.Scanner;
/*
* Desafio
Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".
Entrada
Você receberá um número onde:
Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
Se o número for apenas múltiplo de 3 -> "Fizz" ;
Se o número for apenas múltiplo de 5 -> "Buzz";
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
Saída
Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme exemplo abaixo:
* */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        System.out.println(fizzBuzz(num));

    }
    public static String fizzBuzz(int num) {
        String resultado = "";
        if(num % 3 == 0 && num % 5 == 0){
            resultado = "FizzBuzz";
        }else if (num % 3 == 0) {
            resultado = "Fizz";
        } else if (num % 5 == 0) {
            resultado = "Buzz";
        }else {
            resultado = String.valueOf(num);
        }
        return resultado;
    }
}
