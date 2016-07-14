import java.io.*;
import java.util.*;
public class Ex06{
	public static void main(String[]args){
		int num,div;
		Scanner dado = new Scanner(System.in);
		System.out.println("Digite um numero ");
		num = dado.nextInt();
		div = num %2;
		if(div == 0)
			System.out.println("Numero par");
		else
			System.out.println("Numero impar");
	}
}