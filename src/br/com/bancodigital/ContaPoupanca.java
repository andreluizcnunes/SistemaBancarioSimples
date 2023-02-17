package br.com.bancodigital;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("****** Extrato Conta Poupança ******");
        super.imprimirInfosComuns();
    }
}
