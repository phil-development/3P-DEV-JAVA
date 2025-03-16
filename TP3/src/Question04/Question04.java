package Question04;

public class Question04 {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Arroz";
        produto1.preco = 5.50;
        produto1.quantidadeEmEstoque = 100;

        System.out.println("Informações iniciais do produto:");
        produto1.exibirInformacoes();

        produto1.alterarPreco(6.00);
        produto1.alterarQuantidade(90);

        System.out.println("\nInformações do produto após alterações:");
        produto1.exibirInformacoes();
    }
}