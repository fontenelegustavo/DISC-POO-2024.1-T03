package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] X = new int[10];
		int[] Y = new int[10];
		int[] U = new int[20];
		int[] D = new int[10];
		int[] S = new int[10];
		int[] P = new int[10];
		int[] IT = new int[10];
		int i, j, k, cont_u = 0, cont_d = 0, cont_i = 1;
		
		for (i = 0; i < 10; i++) {
			System.out.println("Escreva um valor para o vetor X: ");
			X[i] = sc.nextInt();
			System.out.println("Escreva um valor para o vetor Y: ");
			Y[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
		    j = 0;
		    while (j < cont_u && X[i] != U[j]) {
		        j++;
		    }
		    
		    if (j >= cont_u) {
		        U[cont_u] = X[i];
		        cont_u++;
		    }
		}

		for (i = 0; i < 10; i++) {
		    j = 0;
		    while (j < cont_u && Y[i] != U[j]) {
		        j++;
		    }
		    
		    if (j >= cont_u) {
		        U[cont_u] = Y[i];
		        cont_u++;
		    }
		}
		System.out.println("cont_u =" + cont_u);
		for (i = 1; i <= (cont_u -1); i++) {
			System.out.println("A posição " + (i-1) + " do vetor união contém o número: " + U[i-1]);
		}
		
		for (i = 0; i < 10; i++) {
		    j = 0;
		    while (X[i] != Y[j] && j < 9) {
		        j++;
		    }
		    
		    if (j >= 10) {
		        k = 0;
		        while (k < cont_d && X[i] != D[k]) {
		            k++;
		        }
				
				if (k>=cont_d) {
					D[cont_d] = X[i];
					cont_d++;
				}
			}
		}
		
		for (i = 1; i <= (cont_d -1); i++) {
			System.out.println("A posição " + (i-1) + " do vetor diferença contém o número: " + D[i-1]);
		}
		
		for (i = 0; i < 10; i++) {
			S[i] = X[i] + Y[i];
			P[i] = X[i] * Y[i];
		}
		
		for (i = 0; i < 10; i++) {
			System.out.println("A posição " + (i) + " do vetor soma contém o número: " + S[i]);
		}
		
		for (i = 0; i < 10; i++) {
			System.out.println("A posição " + (i) + " do vetor produto contém o número: " + P[i]);
		}
		
		for (i = 1; i <= 10; i++) {
			j =1;
			
			while (j <= 10 && X[i-1] != Y[j-1]) {
				j++;
			}
			
			if (j <= 10) {
				k =1;
				while( k < cont_i && IT[k-1] != X[i-1]) {
					k++;
				}
				
				if (k >= cont_i) {
					IT[cont_i-1] = X[i-1];
					cont_i++;
				}
			}
		}
		
		for (i = 1; i <= (cont_i -1); i++) {
			System.out.println("A posição " + (i-1) + " do vetor interseção contém o número: " + IT[i-1]);
		}
		sc.close();
	}
}