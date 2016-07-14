import java.io.*;
import java.util.*;
public class Ex07{
	public static void main(String[]args){
		int i,a,b,c;
		Scanner dado = new Scanner (System.in);
		System.out.println("Digite um numero :");
		a = dado.nextInt();
		System.out.println("Digite um numero :");
		b = dado.nextInt();
		System.out.println("Digite um numero :");
		c = dado.nextInt();
		System.out.println("Selecione entre 1, 2 e 3");
		i = dado.nextInt();
		if (i==1){
		    if(a>b && b>c)
		    System.out.printf("Ordem decrescente %d, %d e %d",c,b,a);
		    else if (b>a && b>c)
		    System.out.printf("Ordem decrescente %d, %d e %d",b,c,a);
		    else if(c>a && c>b && b>a)
		    System.out.printf("Ordem decrescente %d, %d e %d",b,a,c);
		    else
		    System.out.printf("Ordem decrescente %d, %d e %d",a,b,c);
		   }
	  else if(i==2){
		    if(a>b && b>c)
		    System.out.printf("Ordem crescente %d, %d e %d",c,b,a);
		    else if (b>a && b>c)
		    System.out.printf("Ordem crescente %d, %d e %d",a,c,b);
		    else if(c>a && c>b && b>a)
		    System.out.printf("Ordem crescente %d, %d e %d",c,a,b);
		    else

		    System.out.printf("Ordem crescente %d, %d e %d",c,b,a);
		   }
	 else if(i==3){
		    if(a>b && a>c)
		        System.out.printf("%d, %d, %d",b,a,c);
		    else if(b>a && b>c)
		        System.out.printf("%d, %d, %d",a,b,c);
		    else
		        System.out.printf("%d, %d, %d",a,c,b);
		   }
	}
}