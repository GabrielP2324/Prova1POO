package conta;

public class ContaCorrente extends Conta{
	public ContaCorrente(double saldo, double taxa) {
		super(saldo);
		this.taxa = taxa;
	}


	double taxa;

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public void setCredito(double credito) {
		super.setCredito(credito+taxa);
	}

	@Override
	public void setDebito(double debito) {
		super.setDebito(debito+taxa);
	}
	
	
}
