package sintaxeJava.javaDoc;

public class Comentarios {
    public static void main(String[] args) {
        //Comentario de uma linha

        /**Olá
         * Eu sou um comentario
         * que posso ser mais detalhado
         * quandonecessário
         */
    }

    public void metodo() {

    }

    public int somaMultiplica (int n, int x, String m) {
        int r = 0;      //r é igual ao resultado
        if(m == "M") {      //M = multiplicacao
            r = n * x;
        }else {
            // Se não soma mesmo
            r = n + x;
        }
        return r;
    }

}
