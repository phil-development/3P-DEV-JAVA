package Question06;

public class Question06 {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 5.50, 100);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$" + produto1.getPreco());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());

        produto1.exibirInformacoes();
    }
}