import java.io.*;
import java.util.*;

public class ex10{
	public static void main(String[]args){
		double pi = 3.14;
		double area,raio;
		Scanner dado;
		dado = new Scanner (System.in);
		System.out.println("Informe o raio do circulo : ");
		raio = dado.nextDouble();
		area = pi * (raio*raio);
		System.out.println("Area do ciculo  e de "+area);
		
	}
}