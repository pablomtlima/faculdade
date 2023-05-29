package com.pablo.cursojava.exercicioaula13;

import java.util.Scanner;

public class mediaNotas {

	public static void main(String[] args) {
		
		double media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota do 1° bimestre:");
		double b1 = scan.nextDouble();
		System.out.println("Nota do 2° bimestre:");
		double b2 = scan.nextDouble();
		System.out.println("Nota do 3° bimestre:");
		double b3 = scan.nextDouble();
		System.out.println("Nota do 4° bimestre:");
		double b4 = scan.nextDouble();
		
		
		media = (b1 + b2 + b3 + b4) / 4;
		
		System.out.println("A sua média é: " + media);
	}

}
