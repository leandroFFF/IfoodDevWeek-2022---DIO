package metodosJava.sobrecarga;

import metodosJava.sobrecarga.SobrecargaQuadrilatero;

/*
* Sobrecarga de métodos
* */
public class Main2 {
    public static void main(String[] args) {
        //Quadrilatero
        System.out.println("Exercício quadrilátero");
        SobrecargaQuadrilatero.area(3);
        SobrecargaQuadrilatero.area(5d, 5d);
        SobrecargaQuadrilatero.area(7, 8, 9);
        SobrecargaQuadrilatero.area(5f, 5f);
    }
}
