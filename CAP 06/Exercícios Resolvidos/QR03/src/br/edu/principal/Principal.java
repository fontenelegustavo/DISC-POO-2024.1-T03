package br.edu.principal;

import java.util.Scanner;

public class Principal {

   public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);
	   
       double vet1[], vet2[], vet3[];
       int i, j = 1;
       
       vet1 = new double[10]; 
       vet2 = new double[10]; 
       vet3 = new double[20]; 
       
       for(i = 1; i < 10; i++) {
    	   System.out.println("Digite o vetor 1:");
    	   vet1[i] = sc.nextDouble();
    	   vet3[j] = vet1[i];
    	   j = j + 1;
    	   System.out.println("Digite o vetor 2:");
    	   vet2[i] = sc.nextDouble();
    	   vet3[j] = vet2[i];
    	   j = j + 1;
       }
       for(i = 1; i < 20; i++) {
    	   System.out.println("Esse é o vetor 3:");
    	   System.out.println(vet3[i]);
    	   
    sc.close();
       }
       
   }
}
