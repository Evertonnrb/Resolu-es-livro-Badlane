import java.util.*;
import java.io.*;
public class Ex01{
	public static void main(String[]args){
		double tl,md_tl,av,md_av,ex,md_ex,md;
		Scanner dado = new Scanner (System.in);
		System.out.println("Digite a nota do trabalho de laboratório: ");
		tl = dado.nextFloat();
		System.out.println("Digite a nota da avalicação: ");
		av = dado.nextFloat();
		System.out.println("Digite a nota do exame final: ");
		ex = dado.nextFloat();
		md_tl = tl * 2;
		md_av = av * 3;
		md_ex = ex*5;
		md = (md_tl+md_ex+md_av)/11;
		if (md >= 8){
			System.out.println("Conceito A");
		}
		else if (md >= 7 || md <8){
			System.out.println("Conceito B");
		}
		else if (md >= 6 || md <7){
			System.out.println("Conceito C");
		}
		else if (md >= 5 || md < 6){
			System.out.println("Conceito D");
		}
		else{
			System.out.println("Conceito E");
		}
		System.out.printf("Sua média é %.2f",md); 
	}
}