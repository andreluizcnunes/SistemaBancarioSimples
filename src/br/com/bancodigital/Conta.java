package br.com.bancodigital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {

        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            System.out.println("valor indisponivel para saque.");
            System.out.println("Valor disponivel na conta: R$ "+this.saldo);
        }

    }

    @Override
    public void depositar(double valor) {

        if(valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Valor para deposito desconhecido, tente novamente com saldo positivo.");
        }

    }

    @Override
    public void transferir(Conta contaAtual, double valor, Conta contaDestino) {

        if(contaAtual != contaDestino){
            if (this.saldo >= valor && valor > 0){
                contaAtual.sacar(valor);
                contaDestino.depositar(valor);
            }else {
                System.out.println("Operação invalidade!!!");
                System.out.println("Você não tem esse saldo em conta.");
            }
        }else{
            System.out.println("Operação invalidade!!!");
            System.out.println("Não é possivel transferir para o mesmo tipo de conta.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void imprimirInfosComuns(){
        LocalDate d1 = LocalDate.now();
        String d1Str = d1.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Data :  " + d1Str);

        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }
}
