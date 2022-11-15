package tratamentoDeExcecoes;

import javax.swing.*;
/*
* Unchecked (RunTime) Exceptions que PODEM ser evitados se tratados e analisados pelo desenvolvedor.
* está associado a Erro de lógica
* */
public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um numero inteiro! " + e.getMessage());
            //e.printStackTrace();
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Divisão por zero" + e.getMessage());
        } finally {
            System.out.println("Chegou no finaly!");
        }

        System.out.println("Chegou até aqui...");
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
