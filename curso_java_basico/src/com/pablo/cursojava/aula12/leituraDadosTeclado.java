package com.pablo.cursojava.aula12;

import java.util.Scanner;

public class leituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto );
		
		System.out.println("Digite seu primeiro nome:" );
		String primeiroNome = scan.next();
		System.out.print("Seu primeiro nome é: " + primeiroNome);
	}

}
