package junit.ej2Test;

import static org.junit.jupiter.api.Assertions.*;

import junit.ej2.FechaException;
import junit.ej2.UtilidadesFinDeSemana;

import org.junit.jupiter.api.Test;

class UtilidadesFinDeSemanaTest {

//Pruebas que combrueban que se lanza la excepción FechaException al salirse del rango de fechas.
	@Test
	void testMayorQue3000() throws FechaException {
		assertThrows(FechaException.class, () -> UtilidadesFinDeSemana.esFinDeSemana(2,1,3000));
	}
	@Test 
	void testMenorQue1900() throws FechaException{
		assertThrows(FechaException.class, () -> UtilidadesFinDeSemana.esFinDeSemana(31,12,1899));
	}
//Pruebas que comprueban que los valores límite están dentro del rango de fechas comprendido por el programa.
	@Test
	void testFechaLimite3000() throws FechaException{
		assertTrue(UtilidadesFinDeSemana.esFinDeSemana(1, 1, 3000));
	}
	@Test
	void testFechaLimite1900() throws FechaException{
		assertFalse(UtilidadesFinDeSemana.esFinDeSemana(1,1,1900));
	}
//----------------------------------------------------------------------------------------------------------
	@Test
	void testNoEsSabado1() throws FechaException{
		assertFalse(UtilidadesFinDeSemana.esFinDeSemana(6,12,2003));
	}
	@Test
	void testEsSabado2() throws FechaException{
		assertTrue(UtilidadesFinDeSemana.esFinDeSemana(20,6,1975));
	}
	@Test
	void testEsDomingo1() throws FechaException{
		assertTrue(UtilidadesFinDeSemana.esFinDeSemana(7,9,1923));
	}
	@Test
	void testNoEsDomingo2() throws FechaException{
		assertFalse(UtilidadesFinDeSemana.esFinDeSemana(21,7,1907));
	}
	@Test
	void testNiSabadoNiDomingo1() throws FechaException{
		assertFalse(UtilidadesFinDeSemana.esFinDeSemana(1,2,1999));
	}
	@Test
	void testNiSabadoNiDomingo2() throws FechaException{
		assertFalse(UtilidadesFinDeSemana.esFinDeSemana(24,4,2462));
	}
	

}
