package br.com.bancodigital;

public class ContaConrrente extends Conta{

    public ContaConrrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("****** Extrato Conta Corrente ******");
        super.imprimirInfosComuns();
    }
}
