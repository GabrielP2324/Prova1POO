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
	private double credito;
	private double debito;
	
	public double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getCrédito() {
		return credito;
	}
	
	public void setCredito(double credito) {
		if(credito>0) {
			this.credito = credito;
			setSaldo(saldo+credito);
		}else {
			System.out.println("valor inválido");
		}
		
	}
	public double getDebito() {
		return debito;
	}
	
	public void setDebito(double debito) {
		if(debito<saldo) {
			this.debito = debito;
			setSaldo(saldo-credito);
		}else {
			System.out.println("valor inválido");
		}
	}
	
}
