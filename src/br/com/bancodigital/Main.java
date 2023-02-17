package br.com.bancodigital;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("André Nunes");

        Conta cCorrente = new ContaConrrente(cliente);
        Conta cPoupanca = new ContaPoupanca(cliente);

        cCorrente.depositar(100000);
        cCorrente.transferir(cCorrente,5000, cPoupanca);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();
    }
}
