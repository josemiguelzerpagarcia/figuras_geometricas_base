package com.endes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cuadrado.Cuadrado;
import punto.Punto;

class CuadradoTest {

	Cuadrado cuadrado;
	Punto punto;
	@BeforeEach
	void setUp() throws Exception{
		cuadrado = new Cuadrado("Cuadrado 1", "verde", new Punto(0,0), 1);
	}

	@Test
	@DisplayName("Prueba del constructor")
	void testConstructor() {
		double resultadoEsperado = 1;
				double resultado;
				resultado = cuadrado.lado();
	assertEquals(resultadoEsperado, resultado);
	}
}
