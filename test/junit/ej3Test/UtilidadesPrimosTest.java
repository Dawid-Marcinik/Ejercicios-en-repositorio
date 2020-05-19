package junit.ej3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.ej3.NumeroException;
import junit.ej3.UtilidadesPrimos;

class UtilidadesPrimosTest {

//Pruebas que combrueban que los n�meros fuera del rango tiran una excepci�n
	@Test
	void NumeroNegativoTest() throws NumeroException{
		assertThrows(NumeroException.class, () -> UtilidadesPrimos.primos(-1));
	}
	@Test
	void NumeroMayorLimite() throws NumeroException{
		assertThrows(NumeroException.class, () -> UtilidadesPrimos.primos(1000000));
	}
//Comprobaci�n que el n�mero anterior al l�mite no tira una excepci�n
	@Test
	void NumeroPreMillonTest() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(999999));
	}
//Comprobaci�n de que los n�meros 1 y 0 pese a cumplir el c�lculo, no devuelven True
	@Test
	void Numero0Test() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(0));
	}
	@Test
	void Numero1Test() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(1));
	}
//Comprobaci�n de que los n�meros primos devuelven True
	@Test
	void NumeroPrimoTest1() throws NumeroException{
		assertTrue(UtilidadesPrimos.primos(7));
	}
	@Test
	void NumeroPrimoTest2() throws NumeroException{
		assertTrue(UtilidadesPrimos.primos(31));
	}
	@Test
	void NumeroPrimoTest3() throws NumeroException{
		assertTrue(UtilidadesPrimos.primos(401));
	}
	@Test
	void NumeroPrimoTest4() throws NumeroException{
		assertTrue(UtilidadesPrimos.primos(999983));
	}
//Comprobaci�n de que los n�meros no primos devuelven False
	@Test
	void NumeroNoPrimoTest1() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(24));
	}
	@Test
	void NumeroNoPrimoTest2() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(42));
	}
	@Test
	void NumeroNoPrimoTest3() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(264));
	}
	@Test
	void NumeroNoPrimoTest4() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(150000));
	}
	

}
