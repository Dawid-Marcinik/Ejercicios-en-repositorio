package org.marcinikDawid.tema9.ej01;

public class PruebaRefactorizada {

	/*
	 * Con respecto a los "Bad smells" mitigados en medida de lo posible se encuentran:
	 * 
	 * -Código Duplicado
	 * 
	 * -Cirugía de la escopeta
	 * 
	 * -Comentarios (En medida de lo posible)
	 * 
	 * -Métodos largos (Solo hasta cierto punto)
	 */
	
	//===============================================================================================//
	//==================================SEPARADORES DE TEXTO=========================================//
	//===============================================================================================//
	
	//SEPARADOR DEL TIPO: "===================="
	public void barrasDoblesDeIgualesLargas() {
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<20;j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
	}
	//SEPARADOR DEL TIPO: "==============="	
	public void barrasDoblesDeIgualesCortas() {
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<15;j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
	}
	//SEPARADOR DEL TIPO: "*******"
	public void separadorDeAstericos() {
		
		for (int i=0;i<1;i++) {
			for (int j=0;j<7;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void granEspacioEnBlanco() {
		
		System.out.println("\n");
		
	}
	
	//===============================================================================================//
	//===================================FUNCIÓN DE DIBUJO===========================================//
	//===============================================================================================//
	
	private void dibujarTema() {
		
			barrasDoblesDeIgualesCortas();
		
		System.out.println("TEMA 1. CONTROL de VERSIONES");
		
			barrasDoblesDeIgualesCortas();

		System.out.println("1. Conceptos generales");

			separadorDeAstericos();
		
		System.out.println("2. Repositorio centralizado. SVN");
		
			separadorDeAstericos();
		
		System.out.println("3. Repositorio distribuido. GIT");
		
			barrasDoblesDeIgualesCortas();

			granEspacioEnBlanco();
		
			barrasDoblesDeIgualesLargas();
		 
		System.out.println("REFACTORIZACIÓN");
		
			barrasDoblesDeIgualesLargas();

		System.out.println("1. Bad smells");
		
			separadorDeAstericos();

		System.out.println("2. Refactorizaciones habituales");

			separadorDeAstericos();

		System.out.println("3. Refactorizando con Eclipse");
		
			barrasDoblesDeIgualesLargas();
		
	}
	
	//===============================================================================================//
	//===================================FUNCIÓN PRINCIPAL===========================================//
	//===============================================================================================//
	
	public static void main(String[] args) {
		new PruebaRefactorizada().dibujarTema();
	}
	
}
