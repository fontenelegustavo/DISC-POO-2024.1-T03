package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        int qtd[], i, maior, ind = 0;      
        double preco[], tot_vend = 0, tot_geral, comissao;
        
        qtd = new int [10];
        preco = new double [10];
        
        tot_geral = 0;
        
        for (i = 0; i < 10; i++) {
            System.out.print("Digite a quantidade vendida do produto: ");
            qtd[i] = sc.nextInt();
            System.out.print("Digite o preço do produto:");
            preco[i] = sc.nextDouble();
        }
        
        for (i = 0; i < 10; i++) {
            tot_vend = qtd[i] * preco[i];
            System.out.println("Produto " + (i+1) + ": Quantidade: " + qtd[i] + ", Preço: " + preco[i] + ", Total: " + tot_vend);
            tot_geral += tot_vend;
        }
        
        comissao = tot_geral * 5/100;
        System.out.println("Total geral de vendas: " + tot_geral);
        System.out.println("Comissão: " + comissao);
        
        maior = qtd[1];
        ind = 0;	
        
        for (i = 1; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = 1;
            }
        }
        	
        System.out.println("Produto com maior quantidade vendida: Produto " + (ind+1) + ", Preço: " + preco[ind]);
        
        sc.close();
	}
}		
