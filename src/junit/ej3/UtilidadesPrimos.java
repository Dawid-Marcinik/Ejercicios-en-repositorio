package junit.ej3;

public class UtilidadesPrimos {

	public static boolean primos(int numero) throws NumeroException {
		
		boolean resultado = true;
		
		if (numero<0 || numero>=1000000) throw new NumeroException("El n�mero introducido no es v�lido");
		
		else if (numero == 0 || numero == 1) resultado = false;
		
		else {
			
		    for(int i=2;i<numero;i++) {
		    	
		    	if(numero%i == 0) resultado = false;
		    	
		    }
		   
		}
		
		return resultado;
		
	}
	
}
