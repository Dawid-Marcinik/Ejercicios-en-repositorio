package junit.ej1Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.ej1.Cadena;

class CadenaTest {

//Habr�a preferido inicializar con un @BeforeEach, pero no consegu� hacer que el resto de los m�todos de prueba consiguieran pillarme la variable "cad".
	
		Cadena cad = new Cadena("Original");
	
	@Test
	void testCDelante() {
		cad.cDelante("Delante");
		assertEquals("Delante Original",cad.getCadena());
	}
	@Test
	void testCDetras() {
		cad.cDetras("Detras");
		assertEquals("Original Detras",cad.getCadena());
	}
	@Test
	void testQuitarCaracteres() {
		cad.quitar('i');
		assertEquals("Orgnal",cad.getCadena());
	}
	@Test
	void testQuitarXCaracteres() {
		cad.quitar(1,'i');
		assertEquals("Orginal",cad.getCadena());
	}

}
