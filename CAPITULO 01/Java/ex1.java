import java.io.*;
import java.util.*;
		//Primeiro exercicio do livro da porfessora Edilene fácil esse *-)
	public class ex1 {
 	 public static void main (String [] args){		
		int n1,n2,n3,n4,soma;
		Scanner dado;
		dado = new Scanner (System.in);
		System.out.println("Digite um numero inteiro e positivo:  ");
		n1 = dado.nextInt();
		System.out.println("Digite outro numero inteiro e positivo: ");
		n2 = dado.nextInt();
		System.out.println("Digite um terceiro numero inteiro e positivo ");
		n3 = dado.nextInt();
		System.out.println("Digite um quarto numero inteiro e positivo :");
		n4 = dado.nextInt();
		soma = n1+n2+n3+n4;
		System.out.println("A soma de todos os numeros que você digitou e de "+soma+" numeros");
		//System.exit(0);
		
   	 }
	}		
