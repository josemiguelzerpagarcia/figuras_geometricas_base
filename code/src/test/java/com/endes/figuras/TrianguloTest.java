package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TrianguloTest {
	
	Triangulo triangulo;
	
	@BeforeEach
    void setup() throws Exception {
        triangulo = new Triangulo("Triangulo 1" , "amarillo" , new Punto(0,0),new Punto(1,1),new Punto(1,0));
   }

	@Test
	@DisplayName("Prueba Area")
	void test1() {
		double resultadoEsperado = 0.8660254037844386;
		double resultado = triangulo.area();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	@DisplayName("Prueba Perimetro")
	void test2() {
		double resultadoEsperado = 3.414213562373095;
		double resultado = triangulo.perimetro();
		assertEquals(resultadoEsperado, resultado);
	}
}
