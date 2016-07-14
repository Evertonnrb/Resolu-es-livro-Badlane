import java.io.*;
import java.util.*;
public class Ex05{
	public static void main(String[]args){
		int num1,num2,num3,num4;
		Scanner dado = new Scanner(System.in);
		System.out.printf("Digite três números em ordem crescente e um aleatório ");
		System.out.printf("Digite o num1");
		num1 = dado.nextInt();
		System.out.printf("Digite o num2");
		num2 = dado.nextInt();
		System.out.printf("Digite o num3");
		num3 = dado.nextInt();
		System.out.printf("Digite o num4");
		num4 = dado.nextInt();
		if(num1>num2 &&  num2>num3 && num3>num4 && num2>num4)
       	System.out.printf("ordem descrescente "+num1+" "+num2+" "+num3+" "+num4);
        else if(num2>num1 && num2>num3 && num3>num4 && num1>num4 && num1>num3)
        System.out.printf("ordem descrescente %d, %d, %d e %d",num2,num1,num3,num4);
    	else if(num3>num1 && num3>num2 && num3>num4 && num1>num2 && num2>num4)
        System.out.printf("ordem descrescente %d, %d, %d e %d",num3,num1,num2,num4);
    	else if(num4>num3 && num4>num2 && num4>num1 && num1>num2 && num1>num3 && num2>num3)
        System.out.printf("ordem descrescente %d, %d, %d e %d",num4,num1,num2,num3);
    	else if (num4>num3 && num4> num2 && num4>num1 && num2>num1 && num2>num3)
        System.out.printf("ordem descrescente %d, %d, %d e %d",num3,num2,num1,num3);
    	else if(num4>num2 && num4>num3 && num4>num1 && num3>num2 && num2>num1)
        System.out.printf("ordem descrescente %d, %d, %d e %d",num4,num3,num2,num1);
    	else
    	System.out.printf("ordem descrescente %d, %d, %d e %d",num4,num3,num1,num2);
   
	}
}