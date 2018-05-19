package Conta;

public class TestaConta {

	public static void main(String[] args) {
ContaCorrente cc = new ContaCorrente(0001, "Messias Batista", 1500, 3000);


		System.out.println("----CRIANDO UMA CONTA CORRENTE----");
		cc.sacar(1700);
		System.out.println("-------------------------");
		cc.depositar(555);
		System.out.println("--------------------------");
		cc.verificarSaldo();
       System.out.println("---------------------------");
       cc.verificarTitularidade();
       
       
       ContaPoupanca cp = new ContaPoupanca(0002,"Nicole da Silva", 2000);
       System.out.println("------CRIANDO UMA CONTA PUPANÇA-----");
       cp.sacar(1000);
       System.out.println("------------------------------");
       cp.depositar(80000);
       System.out.println("------------------------------");
       cp.verificarSaldo();
       System.out.println("--------------------------------");
       cp.verificarTitularidade();
       
	}

}
