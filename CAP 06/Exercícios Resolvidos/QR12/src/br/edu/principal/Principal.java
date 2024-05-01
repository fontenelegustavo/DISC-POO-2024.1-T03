package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] veiculo=new String[5];
		double[] consumo=new double[5];
		double menor_cons=0,valor;
		int menor_vei=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite o modelo do veiculo "+(i+1)+":");
			veiculo[i]=sc.next();
		}
		for(int i=0;i<5;i++) {
			System.out.println("Digite o consumo do veiculo "+(i+1)+"(Km/l):");
			consumo[i]=sc.nextDouble();
		
			if(i==0||consumo[i]>menor_cons) {
				menor_cons=consumo[i];
				menor_vei=i;
			}
		}
		for(int i=0;i<5;i++) {
			valor=1000/consumo[i];
			System.out.println("O veiculo "+veiculo[i]+" consome "+valor+" litro(s) de combustivel para percorrer 1000KM");
		}
		
		System.out.println("O veiculo mais econômico é o"+veiculo[menor_vei]);
		sc.close();
	}
}

