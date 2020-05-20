package org.marcinikDawid.tema8.ej02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UtilidadesFinDeSemana {

	public static boolean esFinDeSemana(int dia, int mes, int anyo) throws FechaException{
		
		boolean resultado = true;
		
		Calendar cal = new GregorianCalendar();
		
		cal.set(anyo, mes, dia);
		
		if (anyo<1900||(dia>1 && mes>=1 && anyo>=3000)) {
			
			throw new FechaException("La fecha introducida no es válida");
			
		}
		
		else {
			
			int diaSemana = cal.get(Calendar.DAY_OF_WEEK);
			
			if (diaSemana==Calendar.SATURDAY || diaSemana==Calendar.SUNDAY) resultado = true;
			else resultado = false;
			
		}
		
		return resultado;
		
	}
	
}
