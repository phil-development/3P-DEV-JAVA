package Question09;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void deposita(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
    }
}
