package com.zafirotaha;

import com.zafirotaha.clases.Algoritmos;

public class Aplicacion {

	public static void main(String[] args) {
		
		
		
		Boolean esPar= Algoritmos.esPar(5);
		System.out.println(esPar);
		
		boolean esPrimo= Algoritmos.esPrimo(7);
		System.out.println(esPrimo);
		
		
		String stringEnReserva= Algoritmos.stringEnReversa("saludos");
		System.out.println(stringEnReserva);
		
		boolean esPalindromo= Algoritmos.esPalindromo("ojo");
		System.out.println(esPalindromo);
		
		
		Algoritmos.secuenciaFizzBuzz(14);
				
		
		

	}

}
