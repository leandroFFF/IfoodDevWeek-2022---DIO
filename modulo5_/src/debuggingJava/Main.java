package debuggingJava;
/*
* ERROS DE SINTAXE
*
* ERROS DE SEMANTICA
*
* PILHA DE EXECUÇAO DE UM PROGRAMA JAVA
*   Toda invocacao de metodo é empilhada em uma estrutura de dados. Quando um metodo termina(retorna), volta p o metodo que o invocou.
*
* STACK TRACE
*   É a matriz onde encontramos a pilha de exceduçao da exceçao.
*   O rastreamento da pilha busca para a proxima linha onde a excecao pode surgir
*
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa no metodo main");
        a();
        System.out.println("Finalizou o programa no metodo main");
    }

    static void a() {
        System.out.println("Iniciou o metodo a");
        b();
        System.out.println("Finalizou o metodo a");
    }

    static void b() {
        System.out.println("Iniciou o metodo b");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b");
    }

    static void c() {
        System.out.println("Iniciou o metodo c");
//        Thread.dumpStack();
        System.out.println("Finalizou o metodo c");
    }
}
