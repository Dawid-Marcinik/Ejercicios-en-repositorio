package org.marcinikDawid.tema8.ej04;

import java.util.Arrays;

public class Vector {

	public static int[] ordenar(int[] vectores) throws InputDataException{
		
		if (vectores.length>5000 || vectores.length == 0) throw new InputDataException("El array está vacío o tiene más de 5000 elementos");
		
		else Arrays.sort(vectores);
		
		return vectores;
		
	}
	
}
