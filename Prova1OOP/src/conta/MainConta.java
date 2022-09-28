package conta;

public class MainConta {
	public static void main(String[] args) {
		Conta[] accounts = new Conta[10];
		
		for(int i = 0; i<accounts.length;i++) {
			if(i%2 == 0) {
				accounts[i] = new ContaCorrente(1000, i);
			}else {
				accounts[i] = new Poupanca(1000, i);
			}
		}
		double rend;
		
	
		for(Conta i: accounts) {
			if(i instanceof ContaCorrente ) {
				System.out.println("Conta Corrente " + ((ContaCorrente) i).getSaldo());
			}else if(i instanceof Poupanca) {
				rend = ((Poupanca) i).calculaRendimento();
				System.out.println("Conta Poupança " + rend);
			}
		}
	}
}
