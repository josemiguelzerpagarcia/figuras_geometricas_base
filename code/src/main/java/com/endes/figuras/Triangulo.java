package com.endes.figuras;


public class Triangulo extends com.endes.figuras.FiguraGeometrica{

	Punto vertice1;
	Punto vertice2;
	Punto vertice3;
	
	public Triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
		super(nombre, color);
		this.vertice1 = v1;
		this.vertice2 = v2;
		this.vertice3 = v3;
		
	}

	@Override
	public double area() {
		double base = Math.sqrt((vertice2.getX()- vertice1.getX()) * (vertice2.getX()- vertice1.getX()) + (vertice2.getY()- vertice1.getY()) * (vertice2.getY()- vertice1.getY()));
		double mitadBase = base / 2.0;
		double lado2 = Math.sqrt((vertice3.getX()- vertice1.getX()) * (vertice3.getX()- vertice1.getX()) + (vertice3.getY()- vertice1.getY()) * (vertice3.getY()- vertice1.getY()));
		double altura = Math.sqrt( (lado2*lado2) + (mitadBase*mitadBase) );
		double area = base * altura * 0.5;
		return area;
	}

	@Override
	public double perimetro() {
		double lado1 = Math.sqrt((vertice2.getX()- vertice1.getX()) * (vertice2.getX()- vertice1.getX()) + (vertice2.getY()- vertice1.getY()) * (vertice2.getY()- vertice1.getY()));
		double lado2 = Math.sqrt((vertice3.getX()- vertice1.getX()) * (vertice3.getX()- vertice1.getX()) + (vertice3.getY()- vertice1.getY()) * (vertice3.getY()- vertice1.getY()));
		double lado3 = Math.sqrt((vertice3.getX()- vertice2.getX()) * (vertice3.getX()- vertice2.getX()) + (vertice3.getY()- vertice2.getY()) * (vertice3.getY()- vertice2.getY()));
		double perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}

}
