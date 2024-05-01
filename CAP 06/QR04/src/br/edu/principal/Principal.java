package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

int num[] = new int [8], pos[] = new int [8], neg[] = new int [8], cont, cont_n, cont_p, i;

cont = 0;
cont_n = 0;
cont_p = 0;

for (i = 0; i < 8; i++) {
	System.out.println("Digite o valor da posição " + (i + 1) + " do vetor."); 
	num[i] = sc.nextInt();
	
	if (num[i] >= 0) {
		pos[cont_p] = num[i];
		cont_p = cont_p + 1;
	} else {
		neg[cont_n] = num[i];
		cont_n = cont_n + 1;
	}
}
if (cont_n == 0) {
	System.out.println("Vetor de negativos vazio.");
} else {
	System.out.println("Vetor de negativos: ");
	for (i = 0; i <= cont_n - 1; i++) {
		System.out.println(neg[i]);
	}
}
if (cont_p == 0) {
	System.out.println("Vetor de positivos vazio.");
} else {
	System.out.println("Vetor de positivos: ");
	for (i = 0; i <= cont_p - 1; i++) {
		System.out.println(pos[i]);
	}
}

sc.close();
	}
}
