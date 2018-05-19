package Conta;

public class ContaCorrente extends ContaBancaria {
	 private double chequeEspecial;
	   double deposito;

	    
	   
		public ContaCorrente(int numConta, String titulaDaConta, double saldoConta, double chequeEspecia) {
			super(numConta, titulaDaConta, saldoConta);
			this.chequeEspecial = chequeEspecial;
	               
		}
		
		public void sacar(double valorDoSaque) {
			
			if (valorDoSaque < (this.getSaldoConta() + this.chequeEspecial)) {
				
				double saldoAnterior = this.getSaldoConta();
				
				this.setSaldoConta(this.getSaldoConta() - valorDoSaque);
				
				System.out.println("Saldo anterior: " + saldoAnterior
						+ "\n" + "Valor do saque: " + valorDoSaque
						+ "\n" + "Saldo atual: " + this.getSaldoConta());
				
			}		
		}
		
		public void depositar(double deposito){
			
	            System.out.println("Valor antes do Deposito"+ this.getSaldoConta());
	            
	            if(deposito>0){
	               this.setSaldoConta(this.getSaldoConta() + deposito); 
	               
	               System.out.println("Valor do deposito:"+ deposito);  
	                                  
	            }        
	        }
	        public void verificarSaldo(){
	            System.out.println("Voce tem:"+this.getSaldoConta()+"Na sua conta Corrente");
	            
	        }
	        public void verificarTitularidade(){
	            System.out.println("Essa conta Corrente pertence ao(a):"+ getTitulaDaConta()
	                                            +"\n"+"Numero da conta:"+getNumConta()
	                                            +"\n"+ "Com o saldo de:" + getSaldoConta());
	            
	        }

	}