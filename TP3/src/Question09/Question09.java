package Question09;

public class Question09 {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.titular = "João da Silva";
        minhaConta.numero = 12345;
        minhaConta.agencia = "123-4";
        minhaConta.saldo = 1000.0;
        minhaConta.dataAbertura = "01/01/2023";

        System.out.println("Saldo inicial: R$" + minhaConta.saldo);

        minhaConta.deposita(500.0);
        System.out.println("Saldo após depósito: R$" + minhaConta.saldo);

        minhaConta.saca(200.0);
        System.out.println("Saldo após saque: R$" + minhaConta.saldo);

        double rendimento = minhaConta.calculaRendimento();
        System.out.println("Rendimento mensal: R$" + rendimento);

        minhaConta.exibirInformacoes();
    }
}
