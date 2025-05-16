package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	@Test
	void testArea() {
		TrianguloRectangulo t = new TrianguloRectangulo();
		double valorEsperado = 0.0;
		double valorObtenido = t.area();
	}

	@Test
	void testHipotenusa() {
		TrianguloRectangulo t = new TrianguloRectangulo();
		double valorEsperado = 1.4;
		double valorObtenido = t.hipotenusa();
	}

	@Test
	void testPerimetro() {
		TrianguloRectangulo t = new TrianguloRectangulo();
		double valorEsperado = 3.0;
		double valorObtenido = t.perimetro();
	}
	
	@Test
	void testArea2() {
		TrianguloRectangulo t = new TrianguloRectangulo(2,3);
		double valorEsperado = 3.0;
		double valorObtenido = t.area();
	}

	@Test
	void testHipotenusa2() {
		TrianguloRectangulo t = new TrianguloRectangulo(2,3);
		double valorEsperado = 3.6;
		double valorObtenido = t.hipotenusa();
	}

	@Test
	void testPerimetro2() {
		TrianguloRectangulo t = new TrianguloRectangulo(2,3);
		double valorEsperado = 8.6;
		double valorObtenido = t.perimetro();
	}
	
	@Test
	void noValido() {
		assertThrows(IllegalArgumentException.class,() -> {TrianguloRectangulo t = new TrianguloRectangulo(-2,-1);});
		
	}
	
	

}
