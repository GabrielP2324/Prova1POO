package conta;

public class Conta {
	public Conta(double saldo) {
		if(saldo>0) {
			this.saldo = saldo;	
		}else {
			System.out.println("Saldo inválido. Por favor, use o método setSaldo(saldo) para atualizar. Saldo colocado como 0");
			this.saldo=0;
		}
		
	}
	private double saldo;

	
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void setCredito(double credito) {
		if(credito>0) {
			setSaldo(saldo+credito);
		}else {
			System.out.println("valor inválido");
		}
		
	}
	
	public void setDebito(double debito) {
		if(debito<saldo) {
			setSaldo(saldo-debito);
		}else {
			System.out.println("valor inválido");
		}
	}
	
}
