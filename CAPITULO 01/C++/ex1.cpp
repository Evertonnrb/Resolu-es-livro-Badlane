#include <stdio.h>
int main()
{
	int n1,n2,n3,n4,soma;
	printf ("Digite um numero real e positivo: ");
	scanf ("%d%*c",&n1);
	printf ("Digite outro numero real e positivo : ");
	scanf("%d%*c",&n2);
	printf("Digite um terceiro numero real e positivo :");
	scanf("%d%*c",&n3);
	printf ("Digie um quarto numero real e positivo : ");
	scanf("%d%*c",&n4);
	soma = n1+n2+n3+n4;
	printf("A soma de de todos os numeros digitados e de %d",soma);
	return 0;
}


