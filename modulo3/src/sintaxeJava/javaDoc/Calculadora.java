package sintaxeJava.javaDoc;
/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operacoes matermaticas entre numeros inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentacao desta classe
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Leandro França
 * @version 1.0
 * @since 14/10/2022
 * */

public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parametro do metodo
     * @param numeroDois este é o segundo parametro do medoto
     * @return int o resultado deste metodo é a soma dos dois numeros.
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
