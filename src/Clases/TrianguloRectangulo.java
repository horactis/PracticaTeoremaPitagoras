package Clases;

public class TrianguloRectangulo {
	int a;
	int b;
	int c;
	/*
	 * Crea un triangulo rectangulo con los valores de los catetos por defecto
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	/*
	 * Crea un triangulo rectangulo con los valores que le pasan por parametros
	 * @param a		Cateto1
	 * @param b 	Cateto2
	 */
	public TrianguloRectangulo(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException();
		}
		this.a = a;
		this.b = b;
	}
	/*
	 * Calcula el area del triangulo rectangulo
	 */
	public double area() {
		int total = a * b / 2;
		return total;
	}
	/*
	 * Calcula la hipotenusa del triangulo rectangulo
	 */
	public double hipotenusa() {
		c = (int) Math.sqrt(a*a+b*b);
		return c;
	}
	/*
	 * Calcula el perimetro del triangulo rectangulo 
	 */
	public double perimetro() {
		double total = a + b + hipotenusa();
		return total;
	}
	/*
	 * Devuelve el valor del cateto1
	 */
	public int getCateto1() {
		return a;
	}
	/*
	 * Devuelve el valor del cateto2
	 */
	public int getCateto2() {
		return b;
	}
	/*
	 * Devuelve el valor de la hipotenusa
	 */
	public int getHipotenusta() {
		return c;
	}
	/*
	 * Recibe y cambia el valor del cateto1
	 */
	public void setCateto1(int a) {
		this.a = a;
	}
	/*
	 * Recibe y cambia el valor del cateto2
	 */
	public void setCateto2(int b) {
		this.b = b;
	}
	/*
	 * Recibe y cambia el valor de la hipotenusa
	 */
	public void setHipotenusa(int c) {
		this.c = c;
	}
	/*
	 * Muestra la informacion del triangulo rectangulo
	 */
	public String toString() {
		return "Cateto1: "+this.a+"Cateto2"+this.b+"Hipotenusa: "+this.c;
	}
}
