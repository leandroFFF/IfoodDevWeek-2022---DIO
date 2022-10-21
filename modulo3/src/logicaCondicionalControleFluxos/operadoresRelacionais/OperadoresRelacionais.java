package logicaCondicionalControleFluxos.operadoresRelacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*
         * SIMILARIDADE
         * Igualdade ==
         * Diferença !=
         * SIMBOLOGIA
         * Maior >
         * Maior ou Igual >=
         * Menor <
         * Menor ou Igual <=
         */
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short n1 = 25;

        System.out.println("i1 == i1 " + (i1 == i2));
        System.out.println("i1 != i1 " + (i1 != i2));
        System.out.println("i1 > i1 " + (i1 > i2));
        System.out.println("i1 <= i1 " + (i1 <= i2));
        System.out.println("i1 < i1 " + (i1 < i2));
        System.out.println("i1 >= i1 " + (i1 >= i2));


    }
}
