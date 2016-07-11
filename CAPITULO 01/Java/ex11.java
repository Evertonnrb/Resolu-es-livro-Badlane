import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class ex11{
	public static void main(String[]args){
		int num;
		double raiz,raizc,quadrado,cubo;
		Scanner dado;
		 dado = new Scanner (System.in);
		System.out.println("Digite um numero inteiro e positivo: ");
		num = dado.nextInt();
		quadrado = num*num;
		cubo = num*num*num;
		raiz = Math.sqrt((double) num);
		raizc = Math.cbrt ((double) num);
		DecimalFormat dc;
		dc = new DecimalFormat("0.00");
		System.out.println("O numero "+num+" ao quadrado é "+dc.format(quadrado)+
			"\nO numero "+num+" ao cubo é "+dc.format(cubo)+
				"\nA raiz quadrada do  numero "+num+" é " +dc.format(raiz)+
					"\nA raiz cubica do numero "+num+" é "+dc.format(raizc));
		
		
	}
}