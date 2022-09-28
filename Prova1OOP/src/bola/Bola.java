package bola;

public class Bola {
	public Bola(String cor, double raio) {
		this.color = cor;
		this.radius = raio;
	}

	String color;
	double radius;

	public Bola maiorBola(Bola bola2, Bola bola3) {
		Bola aux = new Bola(this.color, this.radius);
		if (bola2.radius >=this.radius && bola2.radius>= bola3.radius) {
			return bola2;
		} else if(bola3.radius>=this.radius && bola3.radius>=bola2.radius){
			return bola3;
		}else {
			return aux;
		}
	}

	public String retornarDados() {
		return "Bola " + color + " com o raio de " + radius;
	}

}
