package pessoa;

public class Pessoa {
	public Pessoa() {
	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	private String nome ="", sobrenome="";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "" + nome + " " + sobrenome;
	}

}
