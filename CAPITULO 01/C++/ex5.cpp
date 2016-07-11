#include <stdio.h>
int main ()
{
	double sal_atual,perc,sal_novo;
	printf("Digite o salario atual do funcionario :");
	scanf("%d%*c",&sal_atual);
	sal_novo = sal_atual+(sal_atual*(perc/100));
	printf("Novo salario no valor de %3.2d",sal_novo);
	getchar();
	return 0;
}
