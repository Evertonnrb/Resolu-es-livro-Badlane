import java.io.*;
import java.util.*;
public class Ex02{
	public static void main(String[]args){
		int n1,n2,n3;
		float media;
		Scanner dado = new Scanner (System.in);
		System.out.println("Digite a nota da N1 ");
		n1 = dado.nextInt();
		System.out.println("Digite a nota da N2 ");
		n2 = dado.nextInt();
		System.out.println("Digite a nota da N3 ");
		n3 = dado.nextInt();
		media = (n1 + n2 + n3)/3;
		if (media < 3 ){
			System.out.println("Reprovado");
		}
		else if(media >=3 && media <7){
			System.out.println("Recuperação");
		}
		else{
			System.out.println("Aprovado");
		}
		System.out.println(" "+media);
	}
}