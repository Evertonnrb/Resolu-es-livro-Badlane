import java.util.*;
import java.io.*;
import java.math.*;
public class ex20{
	public static void main(String[]args){
		double ang,x,alt,escada,radiano;
		Scanner dado = new Scanner(System.in);
		System.out.println("Digite o angulo formado pela escada : ");
		x = dado.nextDouble();
		ang = Math.sin(Math.toRadians(x));
		System.out.println("Digite Digite a altura da parede :");
		alt = dado.nextDouble();
		radiano = (ang * 3.14) /180;
		escada =  alt / radiano;
		System.out.println(" "+escada);
	}
}