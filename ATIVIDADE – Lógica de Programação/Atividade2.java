package br.com.atividade;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		String indiceImpar = "";
		String indicePar = "";
		int soma = 0;
		int media = 0;

		Scanner vet = new Scanner(System.in);
		int elementos[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o numero %d:", i);
			elementos[i] = vet.nextInt();
		}

		// int elementos[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		for (int i = 0; i < 10; i++) {
			if ((i % 2) != 0) {
				indiceImpar = indiceImpar.concat(elementos[i] + " ");
			}
		}

		for (int i = 0; i < 10; i++) {
			if ((elementos[i] % 2) == 0) {
				indicePar = indicePar.concat(elementos[i] + " ");
			}
		}

		for (int i = 0; i < 10; i++) {
			soma = soma + elementos[i];
		}

		media = soma / 10;

		System.out.println("Elementos nos indices impares: ");
		System.out.println(indiceImpar);
		System.out.println();
		System.out.println("Elementos pares: ");
		System.out.println(indicePar);
		System.out.println();
		System.out.println("Soma:");
		System.out.println(soma);
		System.out.println();
		System.out.println("Média");
		System.out.println(media);
	}
}
