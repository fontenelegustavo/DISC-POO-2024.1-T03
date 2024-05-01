package br.principal.edu;

import java.util.Scanner;

public class Principal 
{
	public static void main(String[]args)
	{
		int seg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os a quantidade de segundos a qual você quer converter: ");
		seg = sc.nextInt();
		transformacao(seg);
	}
	public static void transformacao(int seg) 
	{
	int h, m, s, r;
	h = seg/3600;
	r = seg % 3600;
	m = r/60;
	s = r % 60;
	 
	System.out.println(h + " hora(s) " + m + " minuto(s) " + s + " segundo(s) ");
	}	
}
