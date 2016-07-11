import java.util.*;
import java.io.*;
public class ex18{
	public static void main(String[]args){
		int saco,gato1,gato2,kg_saco,peso_saco,fim_saco;
		float sobra_saco;
		Scanner dado = new Scanner(System.in);
		System.out.println("Digite o peso do saco de ração em kg: ");
		saco = dado.nextInt();
		kg_saco = 1000;
		peso_saco = saco * kg_saco;
		System.out.println("Digite a quantidade de ração fornecida para o gato 1 (em gramas): ");
		gato1 = dado.nextInt();
		System.out.println("Digite a quantidade de ração fornecida para o gato 2 (em gramas): ");
		gato2 = dado.nextInt();
		sobra_saco =(peso_saco - (5*(gato1 + gato2)));
		System.out.println(" "+sobra_saco+" gramas e o que sobrara após 5 dias");
	}
}