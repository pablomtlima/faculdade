package com.pablo.cursojava.exercicioaula13;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int soma;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		int n2 = scan.nextInt();
		
		System.out.println("A soma de " + n1 + " + " + n2 + " é " + (n1+n2));
		
	}
}
