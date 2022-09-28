package bola;
public class PrincipalBola {

	public static void main(String[] args) {

		Bola bola1 = new Bola("azul", 2.75);
		Bola bola2 = new Bola("branca", 3.5);
		Bola bola3 = new Bola("vermelha", 3.25);

		Bola aux = bola1.maiorBola(bola2, bola3);

		System.out.println("Dados da bola com o maior raio -> " + aux.retornarDados());
		
		
		Circulo c = new Circulo(3.5);
		
		System.out.printf("Área do circulo -> %.2f\n", c.getArea());
		System.out.printf("Perimetro do circulo -> %.2f\n", c.getCircumference());

	}

}