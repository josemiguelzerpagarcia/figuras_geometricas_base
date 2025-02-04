package com.endes.figuras;

import punto.Punto;

public class Cuadrado extends com.endes.figuras.FiguraGeometrica{

	protected Punto esquina;
	protected double lado;
	
	public Cuadrado(String nombre, String color, Punto esquina, double lado) {
		super(nombre, color);
		this.esquina = esquina;
		if (lado < 0) {
			this.lado = 1;
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
	
	
	public double getLado() {
		return lado;
	}
	
}
