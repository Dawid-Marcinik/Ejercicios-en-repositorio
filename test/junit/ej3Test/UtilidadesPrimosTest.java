package junit.ej3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.ej3.NumeroException;
import junit.ej3.UtilidadesPrimos;

class UtilidadesPrimosTest {

//Pruebas que combrueban que los números fuera del rango tiran una excepción
	@Test
	void NumeroNegativoTest() throws NumeroException{
		assertThrows(NumeroException.class, () -> UtilidadesPrimos.primos(-1));
	}
	@Test
	void NumeroMayorLimite() throws NumeroException{
		assertThrows(NumeroException.class, () -> UtilidadesPrimos.primos(1000000));
	}
//Comprobación que el número anterior al límite no tira una excepción
	@Test
	void NumeroPreMillonTest() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(999999));
	}
//Comprobación de que los números 1 y 0 pese a cumplir el cálculo, no devuelven True
	@Test
	void Numero0Test() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(0));
	}
	@Test
	void Numero1Test() throws NumeroException{
		assertFalse(UtilidadesPrimos.primos(1));
	}
//Comprobación de que los números primos devuelven True
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
//Comprobación de que los números no primos devuelven False
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
