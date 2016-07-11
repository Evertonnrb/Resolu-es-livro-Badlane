import java.util.*;
import java.io.*;
public class Ex04{

public static void main(String[]args){
	int n1,n2,n3;
	Scanner dado = new Scanner (System.in);
	System.out.println("Digite o numero1");
	n1 = dado.nextInt();
	System.out.println("Digite o numero2");
	n2 = dado.nextInt();
	System.out.println("Digite o numero3");
	n3 = dado.nextInt();
	if (n1>n2 && n1>n3){
		if (n2>n3){
			System.out.println(" Ordem crescente "+n3+" "+n2+" "+n1);
		}
	}
	else if (n2>n1 && n2>n3){
		if (n1>n3){
			System.out.println("Ordem crescente "+n3+" "+n1+" "+n2);
		}
		else{
			System.out.println("Ordem cescente "+n1+" "+n3+" "+n2);
		}
	}
	else if (n3>n1 && n3>n2){
		if (n1>n2){
			System.out.println(" Ordem crescente "+n2+" "+n1+" "+n3);
		}
		else{
			System.out.println("Ordem crescente "+n1+" "+n2+" "+n3);
		}
	}
}
}