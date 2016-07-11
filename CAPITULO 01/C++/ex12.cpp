#include <stdio.h>
#include <math.h>
int main()
{
	int num1,num2,a,b;
	printf("Digite um numero inteiro e positivo :");
	scanf("%d%*c",&num1);
	printf("Digite um numero inteiro e positivo :");
	scanf("%d%*c",&num2);
	a = pow(num1,num2);
	b = pow(num2,num1);
	printf("O numero %d elevado a %d eh = %.2d",num1,num2,a);
	printf("\n");
	printf("O numero %d elevado a %d eh = %.2d",num2,num1,b);
	getchar();
	return 0;
}
