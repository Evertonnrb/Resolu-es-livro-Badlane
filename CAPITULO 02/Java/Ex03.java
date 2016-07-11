import java.util.*;
import java.io.*;
public class Ex03{
	public static void
		 main(String[]args){
		int n1,n2;
		Scanner num = new Scanner (System.in);
		System.out.println("Digite um numero1");
		n1 = num.nextInt();
		System.out.println("Digite o numero2");
		n2 = num.nextInt();
		if (n1>n2)
			System.out.println("Numero1 maior");
		else
			System.out.println("Numero2 maior");
			
	}
}