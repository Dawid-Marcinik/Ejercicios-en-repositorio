package junit.ej1;

public class Cadena {

	private String cadena="";
	
	public Cadena(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return cadena;
	}
	
	public void cDelante (String s) {
		
		cadena=s+" "+cadena;
		
	}
	
	public void cDetras (String s) {
		
		cadena=cadena+" "+s;
	
	}
	
	public void quitar (char c) {
		
		String nuevaCadena="";
		
		for (int cont=0;cont<cadena.length();cont++) {
			
			if (cadena.charAt(cont) != c) {

				nuevaCadena = nuevaCadena + cadena.charAt(cont);
				
			}
			
			else;
			
		}
		
		cadena=nuevaCadena;
		
	}
	
	public void quitar (int n, char c) {
		
		String nuevaCadena="";
		
		int cantidadDeVeces=0;

			for (int cont=0;cont<cadena.length();cont++) {
			
				if (cantidadDeVeces>=n) {
					
					nuevaCadena=nuevaCadena + cadena.charAt(cont);
					
				}
				
				else if (cadena.charAt(cont) == c) {
				
					cantidadDeVeces++;
					
				}
			
				else nuevaCadena=nuevaCadena + cadena.charAt(cont);
				
			}
		
		cadena=nuevaCadena;
		
	}
	
}
