package logicaCondicionalControleFluxos.operadoresRelacionais;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
        * CONCEITUAÇÃO
        * Sao simbolos especiais quais sao capases de realixar comparações lógicas entre
        * operandos lógicos ou expressoes e, em seguida, retornar um resultado
        *
        * TIPOS:
        * Conjuncao - operacao lógica que ó é verdadeira se as duas entradas tbm forem verdadeiras
        * Disjuncao - operacao logica que só é falsa se ambos forem falso
        * Disjuncao Exclusiva - operacao logica que só é verdade se ambos forem opostos
        * Negação - operacao que inverte o valor lógico
        *
        * AND &&
        * OR ||
        * XOR ^
        * NOT !
        *
        * OPERADORES BITWISE & e |
        * OPERADORES SHIFT ~, >>, >>>, <<
        *
        * */

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 29f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1) && true) " + ((i1 + i2) < (f2 - f1) && true));
        System.out.println("((i1 > i2) || (f2 < f1)) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

    }
}
