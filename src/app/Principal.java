package app;

import Clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		int random = (int) (Math.random()*(10-0+1)+1);
		int random2 = (int) (Math.random()*(10-0+1)+1);
		TrianguloRectangulo t = new TrianguloRectangulo(random, random2);
		TrianguloRectangulo r = new TrianguloRectangulo();
		
		t.area();
		t.perimetro();
		r.area();
		r.perimetro();
	}
}
