package com.zafirotaha.clases;

public class Algoritmos {
	
	    
	    public static boolean esPar(int numero) {
	        return numero % 2 == 0;
	    }
	    
	   
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i < numero; i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    
	    public static String stringEnReversa(String texto) {
	        String reversa = "";
	        
	        for (int i = texto.length() - 1; i >= 0; i--) {
	            reversa += texto.charAt(i);
	        }
	        return reversa;
	    }
	    
	    
	    public static boolean esPalindromo(String texto) {
	        texto = texto.toLowerCase().replace(" ", "");
	        
	        int izquierda = 0;
	        int derecha = texto.length() - 1;
	        
	        while (izquierda < derecha ) {
	            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
	                return false;
	            }
	            izquierda++;
	            derecha--;
	        }
	        return true;
	    }
	    
	    
	    public static void secuenciaFizzBuzz(int numero) {
	        for (int i = 1; i <= numero; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz" );
	            } else if (i % 3 == 0) {
	                System.out.println("Fizz ");
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz ");
	            } else {
	                System.out.println(i + " ");
	            }
	        }
	        System.out.println();
	    }
	}

