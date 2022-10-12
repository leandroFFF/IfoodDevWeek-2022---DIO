public class OperadoresMatematicos {
    public static void main(String[] args) {
        /*
        * =========== OPERADORES MATEMÁTICOS =============
        * SOMA +        //Soma numeros ou concatena strings
        * SUBTRAÇÃO -
        * MULTIPLICACAO *
        * DIVISÃO /
        * RESTO %
        *
        * =========== OPERADOR DE ATRIBUIÇÃO =============
        * IGUAL =
        *
        * =========== OPERADORES RELACIONAIS =============
        * IGUAL ==
        * DIFERENTE !=
        * MAIOR >
        * MENOR <
        * MAIOR OU IGUAL >=
        * MENOR OU IGUAL <=
        *
        * =========== OPERADORES LOGICOS =============
        * AND &&
        * OR ||
        * NOT !
        *
        * =========== OPERADOR UNÁRIO =============
        * POSITIVO +
        * NEGATIVO -
        * INCREMENTO ++
        * DECREMENTO --
        *
        * =========== OPERADOR TERNÁRIO =============
        * TERNÁRIO ?:
        *
        *
        * */

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        String nome = "Leandro";
        String sobreNome = "Franca";

        int soma = n1 + n2;
        int subtracao = n2 - n1;
        int multiplicacao = n1 * n3;
        float divisao = (float)n3 / (float)n2;
        double resto = (float)n3 / (float)n2;

        System.out.println(
                "Soma: " + soma + "\n" +
                "Subtração: " + subtracao + "\n" +
                "Multiplicação: " + multiplicacao + "\n" +
                "Divisão: " + divisao + "\n" +
                "Resto: " + resto + "\n" );

        System.out.println(
                "Concatenação: " + nome + " " + sobreNome + "\n" +
                "Concatenação 2: " + nome + n1 + "\n");

        System.out.println(
                "Positivo: " + ( +n1 ) + "\n" +
                "Negativo: " + ( -n2 ) + "\n" +
                "Pós Incremento: " + ( n1++ ) + "\n" +
                "Pós Decremento: " + ( n2-- ) + "\n" +
                "Pré Incremento: " + ( ++n1 ) + "\n" +
                "Pré Decremento: " + ( --n2 ) + "\n");

        System.out.println(
                "É igual? " + ( n1 == n2 ) + "\n" +
                "É diferente? " + ( n1 != n2 ) + "\n" +
                "É maior? " + ( n1 > n2 ) + "\n" +
                "É menor? " + ( n1 < n2 ) + "\n" +
                "É maior ou igual? " + ( n1 >= n2 ) + "\n" +
                "É menor ou igual? " + ( n1 <= n2 ) + "\n" +
                "Verdadeiro: " + true + "\n" +
                "Falso: " + false + "\n");


        int a, b;
        a = 5;
        b = 6;
        /*
        String resultado = "";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println("Resultado: " + resultado);
        */
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println("Ternário: " + resultado);
    }
}
