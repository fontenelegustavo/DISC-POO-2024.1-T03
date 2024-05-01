package br.edu.principal;

import java.util.Scanner;

public class Principal 
{
	public static void main(String[]args) 
	{
		float precoantigo, precoatual, acrescimo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o preço antigo do produto?");
		precoantigo = sc.nextFloat();
		System.out.println("Qual o preço atual do produto?");
		precoatual = sc.nextFloat();
		
		acrescimo = calculo_reajuste(precoantigo, precoatual);
		System.out.println("O acrésimo será de " + acrescimo + "%");
	}
	public static float calculo_reajuste(float precoantigo, float precoatual)
	{
		float result;
		result = (100 * precoatual - 100 * precoantigo) / 100;
		return result;
	}
}
