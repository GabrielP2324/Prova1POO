package pessoa;

public class MainPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Gabriel","Peixoto");
		
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		pessoa1.setNome("João Vitor");
		pessoa1.setSobrenome("Miranda");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getSobrenome());
		System.out.println(pessoa1.getNomeCompleto());
	}
}
