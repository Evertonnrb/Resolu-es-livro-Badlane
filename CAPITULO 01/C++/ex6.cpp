#include <stdio.h>
int main()
{
	double sal_base,grat,desc,sal_receber;
	printf("Digite o salario base do funcionario ");
	scanf("%f%*c",&sal_base);
	grat = sal_base*0.5;
	desc = sal_base*0.7;
	sal_receber = sal_base+grat-desc;
	printf("O salario liquido do funcionario e de %2.5f",sal_receber);
	getchar();
	return 0;
}

