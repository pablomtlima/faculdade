package com.pablo.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 e 1 and valor2 é 2 - resultado: " + resultado1);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(	verdadeiro && falso);
		System.out.println(	verdadeiro || falso);
		System.out.println(	verdadeiro ^ falso);
		System.out.println(	!verdadeiro && falso);


	}

}
