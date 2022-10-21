package sintaxeJava.tiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        /*
         * TEMOS 8 TIPOS PRIMITIVOS (Não sao considerados objetos)
         * int 4 bytes
         * byte 1 byte
         * short 2 bytes
         * long
         * float 4 bytes
         * double 8 bytes
         * boolean
         * char
         *
         * exemplo:
         * tipo nomeVariavel = valor;
         */

        double salarioMinimo = 2500.33;
        byte idade = 123;
        short ano = 2022;
        int cep = 59060000;
        long cpf = 125211460L;
        float pi = 3.14F;
        double salario = 175.33;
        char letra = 'a';
        String nome = "Leandro";

        /*Fazer um CAST - (tipo) variavel*/

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        /*variaveis vs constantes*/

        final float PI = 3.1415F;    //constante usa "final"

        System.out.println("ola galera");
    }

}
