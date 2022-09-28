package bola;

public class Bola {
	public Bola(String cor, double raio) {
		this.color = cor;
		this.radius = raio;
	}

	String color;
	double radius;

	public Bola maiorBola(Bola bola2, Bola bola3) {
		if (bola2.radius >= bola3.radius) {
			return bola2;
		} else {
			return bola3;
		}
	}

	public String retornarDados() {
		return "Bola " + color + " com o raio de " + radius;
	}

}
