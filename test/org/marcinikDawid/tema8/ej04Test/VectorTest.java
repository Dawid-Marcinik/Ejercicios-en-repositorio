package org.marcinikDawid.tema8.ej04Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.marcinikDawid.tema8.ej04.InputDataException;
import org.marcinikDawid.tema8.ej04.Vector;

class VectorTest {

	@Test
	void masDeCincoMilElementosTest() {
		int[] cincoMilPlus = new int[5001];
		assertThrows(InputDataException.class, () -> Vector.ordenar(cincoMilPlus));
	}
	@Test
	void cincoMilElementosTest() throws InputDataException {
		int[] resultado = new int[5000];
		int[] resultadoEsperado = new int[5000];
		assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
	}
//-----------------------------------------------------------------------------------
	@Test
	void Ordenar1() throws InputDataException {
		int[] resultado = new int[] {50,40,80};
		int[] resultadoEsperado = new int[] {40,50,80};
		assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
	}
	@Test
	void Ordenar2() throws InputDataException {
		int[] resultado = new int[] {23,56,84};
		int[] resultadoEsperado = new int[] {23,56,84};
		assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
	}
	@Test
	void Ordenar3() throws InputDataException {
		int[] resultado = new int[] {123,485,25,6405,3020};
		int[] resultadoEsperado = new int[] {25,123,485,3020,6405};
		assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
	}
	@Test
	void Ordenar4() throws InputDataException {
		int[] resultado = new int[] {9,8,7,6};
		int[] resultadoEsperado = new int[] {6,7,8,9};
		assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
	}
	@Test
	void Ordenar5() throws InputDataException {
		int[] resultado = new int[] {2,1};
		int[] resultadoEsperado = new int[] {1,2};
		assertArrayEquals(resultadoEsperado, Vector.ordenar(resultado));
	}
	

}
