import java.io.*;
import java.util.*;
import java.time.*;
public class ex10{
	public static void main(String[]args){
		int dia1,mes1,ano1,dia2,mes2,ano2;
		Scanner pt = new Scanner (System.in);
		System.out.println("Digite duas datas quaisquer distintas");
		System.out.println("Digita o dia :");
		dia1 = pt.nextInt();
		System.out.println("Digite o mes :");
		mes1 = pt.nextInt();
		System.out.println("Digite o ano :");
		ano1 = pt.nextInt();
		System.out.println("=============Digite outra data");
		System.out.println("Digita o dia :");
		dia2 = pt.nextInt();
		System.out.println("Digite o mes :");
		mes2 = pt.nextInt();
		System.out.println("Digite o ano :");
		ano2 = pt.nextInt();
		if(dia1 > dia2 || mes1>mes2 || ano1>ano2){
			System.out.println("Primeira data digitada maior");
		}
		else{
			System.out.println("Segunda data digitada maior");
		}
		
	}
}