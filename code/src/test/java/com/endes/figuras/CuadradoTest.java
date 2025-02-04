package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CuadradoTest {
	Cuadrado cuadrado;
	
	@BeforeEach
	void setup()throws Exception{
		cuadrado = new Cuadrado("cuadrado1", "verde", new Punto(2,2), 2);
	}
	
	@Test
	@DisplayName ("test Constructor bueno")
	void testConstructorBueno() {
		double resultadoEsperado = 2;
		double resultado = cuadrado.getLado();	
		assertEquals(resultadoEsperado, resultado);
}
	@Test
	@DisplayName ("test Constructor malo")
	void testConstructorMalo() {
		Cuadrado cuadrado = new Cuadrado("cuadrado1", "verde", new Punto(2,2), -1);
		double resultadoEsperado = 1;
		double resultado = cuadrado.getLado();	
		assertEquals(resultadoEsperado, resultado);
}
	@Test
	@DisplayName ("test Area")
	void testArea() {
		double resultadoEsperado = 4;
		double resultado = cuadrado.area();	
		assertEquals(resultadoEsperado, resultado);
}
	@Test
	@DisplayName ("test perimetro")
	void testPerimetro() {
		double resultadoEsperado = 8;
		double resultado = cuadrado.perimetro();
		assertEquals(resultadoEsperado, resultado);
}

}
