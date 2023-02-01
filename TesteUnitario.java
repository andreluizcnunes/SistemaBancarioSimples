package br.com.fiap.banco;

public class TesteUnitario {
	
	public static void main(String[] args) {
		
		// usando construtor padrão
		Conta cc = new Conta();
		
		cc.saldo = 50.0;
		cc.agencia = 123;
		cc.numero = 321;
		
		cc.depositar(1000);
		
		System.out.println("Conta Corrente");
		System.out.println("_____________________");
		System.out.println("Saldo na Conta: "+cc.verificarSaldo());
		System.out.println("Agencia: "+cc.agencia);
		System.out.println("Conta: "+cc.numero);
		
		System.out.println("---------------------------------");
		
		// utilizando o construtor
		Conta poupanca = new Conta(111, 222, 1000);
		
		poupanca.retirar(50);
		
		System.out.println("Conta Poupança");
		System.out.println("_____________________");
		System.out.println("Saldo na Conta: "+poupanca.verificarSaldo());
		System.out.println("Agencia: "+poupanca.agencia);
		System.out.println("Conta: "+poupanca.numero);
		
	}

}
