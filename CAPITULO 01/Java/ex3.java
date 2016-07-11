import java.io.*;
import java.util.*;
import java.text.*;

public class ex3{
	public static void main (String[]args){
		float n1,p1,n2,p2,n3,p3,media;
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Digite a nota da n1 :");
		n1 = entrada.nextFloat();
		System.out.println("Informe o peo da n1 :");
		p1 = entrada.nextFloat();
		System.out.println("Digite a nota da n2 :");
		n2 = entrada.nextFloat();
		System.out.println("Informe o peso da n2 :");
		p2 = entrada.nextFloat(); 
		System.out.println("Digite a nota da n3 :");
		n3 = entrada.nextFloat();
		System.out.println("Informe o peso da n3 :");	
		p3 = entrada.nextFloat();
		media = (n1*p1)+(n2*p2)+(n3*p3);
		DecimalFormat cs;
		cs = new DecimalFormat("0.00");
		System.out.println(" A media pomderada das notas e de "+cs.format(media));
		
	}
}