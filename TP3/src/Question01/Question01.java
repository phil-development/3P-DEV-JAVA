package Question01;

public class Question01 {

    public static class Carro {
        String marca;
        int ano;

        public void exibirInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Ano: " + ano);
        }
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Ford";
        carro2.ano = 2022;

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

    }
}
