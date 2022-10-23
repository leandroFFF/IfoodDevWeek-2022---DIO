package estruturaBasicaOO;

public class Main {
    public static void main(String[] args) {
        //CRIANDO OBJETO COM CONSTRUTOR PADRAO
        Carro carro1 = new Carro();
        //ATRIBUINDO VALORES PELO METODO SETTER
        carro1.setCor("azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);
        //SOLICITANDO VALORES PELO METODO GETTER
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //CRIANDO OBJETO COM CONSTRUTOR DE SOBRECARGA
        Carro carro2 = new Carro("red", "gol", 50);
        //SOLICITANDO VALORES PELO METODO GETTER
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
