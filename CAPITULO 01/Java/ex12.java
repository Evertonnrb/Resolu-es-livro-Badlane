import java.io.*;
import java.util.*;
import java.math.*;

public class ex12{
	public static void main(String[]args){
		double num1,num2,a,b;
		Scanner dado;
		dado =new Scanner(System.in);
		System.out.println("Digite um numero inteiro e positivo maior do que 0 :");
		num1 = dado.nextDouble();
		System.out.println("Digite outro numero inteiro e positivo maior do que 0 :");
		num2 = dado.nextDouble();
		a = Math.pow(num1,num2);
		b = Math.pow(num2,num1);
		System.out.println("Numero "+num1+" elevado a "+num2+" = "+a+
			"\nNumero "+num2+ "elevado "+num1+" = "+ b);
	}
}