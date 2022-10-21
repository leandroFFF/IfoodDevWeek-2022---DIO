package desafios_algoritmos_basicos;

import java.util.Scanner;

public class OsNumerosSaoIguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a == b) {
            System.out.println("Sao iguais!");
        }else {
            System.out.println("Nao sao iguais!");
        }
    }
}
