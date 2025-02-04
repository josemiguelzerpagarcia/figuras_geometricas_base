package cuadrado;

import punto.Punto;

public class Cuadrado extends com.endes.figuras.FiguraGeometrica{

	protected Punto esquina;
	protected double lado;
	
	public Cuadrado(String nombre, String color, Punto esquina, double lado) {
		super(nombre, color);
		this.esquina = esquina;
		if (lado < 0) {
			this.lado = 0;
		} else {
			this.lado = lado;
		}
		
	}
	
	@Override
	public double area() {
		double area;
		area = lado * lado;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro;
		perimetro = lado * 4;
		return perimetro;
	}
	
	@Override
	public void rotar(double angulo) {
		
	}
	
	@Override
	public void trasladar(double dx, double dy) {
		
	}
	
}
