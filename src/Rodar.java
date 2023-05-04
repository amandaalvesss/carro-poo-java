public class Rodar {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("preto");
        carro1.setModelo("Fox");
        carro1.setCapacidadeTanque(10);


        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotal(5));

        Carro carro2 = new Carro("amararelo","caminhao", 40);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotal(80));



    }
}
