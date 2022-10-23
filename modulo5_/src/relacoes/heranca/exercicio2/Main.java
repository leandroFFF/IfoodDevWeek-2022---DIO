package relacoes.heranca.exercicio2;

public class Main {
    public static void main(String[] args) {

        //========== CRIANO UM OBJETO ==========
        Funcionario funcionario = new Funcionario();

        //========== UPCAST ==========
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //========== DOWNCAST ========== -> DEVE SER EVITADO O USO DE DOWNCAST EM OO
        //Gerente gerente_ = (Gerente) new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
