package br.com.bancodigital;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaAtual, double valor, Conta contaDestino);

    void imprimirExtrato();
}
