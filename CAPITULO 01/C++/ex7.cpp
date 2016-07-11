#include <stdio.h>
int main()
{
	//continuo tendo problemas em exibir o resultado
	double sal,grat,imp,sal_receber;
	printf("Digite o salario base do funcionario :");
	scanf("%d%*c",&sal);
	grat = 50;
	sal_receber = sal+grat +(sal*0.10);
	printf("O salario a receber pelo funcionario e de : %2.5f");
	getchar();
	return 0;
	
}
