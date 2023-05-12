package br.com.atividade;

public class Atividade1 {

	public static void main(String[] args) {

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		ordena(vetor);

		System.out.println("Numeros em ordem decrescente: ");
		for (int numero : vetor) {
			System.out.println(numero);
		}
	}

	public static void ordena(int vetor[]) {
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < 10; cont1++) {
			for (cont2 = 0; cont2 < 9; cont2++) {
				if (vetor[cont2] < vetor[cont2 + 1]) {
					aux = vetor[cont2];
					vetor[cont2] = vetor[cont2 + 1];
					vetor[cont2 + 1] = aux;
				}
			}
		}
	}
}
