package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
		int vet[] = new int[10], i, j, aux;
		
		for (i = 0; i <= 9; i++) {
			System.out.println("Digite o " + (i + 1) + "º número do vetor");
			vet[i] = sc.nextInt(); // só repete até aqui
		}
		
		for (i = 0; i <= 9; i++) {
			for (j = 0; j <= 8; j++) {
				if (vet[j] < vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j + 1] = aux;
				}
			}
		}
		for (i = 0; i <= 9; i++) {
			System.out.println(vet[i]);
		}
		sc.close();
	}
}
