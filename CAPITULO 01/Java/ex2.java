import java.io.*;
import java.util.*;
import java.text.*;
		//segundo exercicio do livro da Edilene BadLene.wordPress
		//Utilizando a classe formatadora de casas decimais DecialFormat
public class ex2{
	public static void main(String[]args){
		float n1,n2,n3,n4,media;
		Scanner dado; 
		dado = new Scanner (System.in);
		System.out.println("Digite a primeira nota : ");
		n1 = dado.nextFloat();
		System.out.println("Digite a segunda nota :");
		n2 =dado.nextFloat();
		System.out.println("Digite a terceira nota :");
		n3 = dado.nextFloat();
		media =  (n1+n2+n3)/3;
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		System.out.println("A media das notas e de "+casas.format(media));
	}
}