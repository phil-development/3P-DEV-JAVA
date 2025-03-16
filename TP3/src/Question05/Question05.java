package Question05;

public class Question05 {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Arroz");
        produto1.setPreco(5.50);
        produto1.setQuantidadeEmEstoque(100);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$" + produto1.getPreco());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());

        produto1.setPreco(6.00);
        System.out.println("\nNovo preço: R$" + produto1.getPreco());
    }
}