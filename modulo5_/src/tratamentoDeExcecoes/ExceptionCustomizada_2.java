package tratamentoDeExcecoes;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 2, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++){
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
                throw new RuntimeException(e);
            }

            /*
            try {
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Revise os valores. " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Tamanho do vetor incompatível. " + e.getMessage());
            }*/
        }
            System.out.println("O programa continua...");
    }
}
