import java.io.*;
import java.util.*;
import java.math.*;

public class Ex08{
	public static void main(String[]args){
		int opc,sum,n1,n2;
		double n3,raiz;
		Scanner dado = new Scanner (System.in);
		System.out.println("Selecione uma opção \n1-Para Soma\n2-Para radiciação");
		opc = dado.nextInt();
		switch(opc)
		{
				case 1:
				 System.out.println("Digite um numero ");
				 n1 = dado.nextInt();
				 System.out.println("Digite outro numero");
				 n2 = dado.nextInt();
				 sum = n1+n2;
				 System.out.println("O resultado sa soma e "+sum);
				 break;
			case 2:
				System.out.println("Digite o numero ");
				n3 = dado.nextDouble();
				raiz = Math.sqrt(n3);
				System.out.println("A raiz é"+raiz);
				break;
				default:
					System.out.println("Opção invalida");
					break;
		}
				
	}
}