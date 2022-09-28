package conta;

public class Poupanca extends Conta{
	public Poupanca(double saldo, double rendimento) {
		super(saldo);
		this.rendimento = rendimento;
	}

	double rendimento;

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double calculaRendimento() {
		return super.getSaldo()*rendimento;
	}
}
