package estruturasDeRepeticao_ArraysEmJava;

public class Arrays_OrdemInversa {
    /*
    * Crie um vetor de 6 numeros inteiros
    * e mostre-os na ordem inversa
    * */
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6};
        int cont = 0;
        System.out.print("Vetor: [ ");
        while(cont < vetor.length){
            System.out.print(vetor[cont] + " ");
            cont++;
        }
        System.out.println("]");

        int contr = vetor.length - 1;
        System.out.print("Vetor reverso: [ ");
        while (contr >= 0) {
            System.out.print(vetor[contr] + " ");
            contr--;
        }
        System.out.println("]");
    }
}
