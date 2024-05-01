package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[]temp=new double[12];
	String[]meses= {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro"
,"dezembro"};
	double maior=0,menor=0;
	int maior_mes=0,menor_mes=0;
	
	for(int i=0;i<temp.length;i++) {
		System.out.println("Digite a temperatura media do mês "+meses[i]+":");
		temp[i]=sc.nextDouble();
		
		if(i==0) {
			maior = temp[i];
			menor = temp[i];
			maior_mes = i;
			maior_mes = i;
		}else {
			if(temp[i]>maior) {
			  maior = temp[i];
			  maior_mes = i;
			}
	        if(temp[i]<menor) {
	          menor = temp[i];
	          menor_mes = i;
	        }
		}
		}
	System.out.println("A menor temperatura do anoo foi "+maior+" em "+meses[maior_mes]);
	System.out.println("A menor temperatura do anoo foi "+menor+" em "+meses[menor_mes]);
    sc.close();
	}
	
}