#include <stdio.h>
int main()
{
	float sal_min,sal_receber,hora_trabalhada,sal_bruto,imp;
	int horas;
	printf("Informe o numero de horas trabalhadas: ");
	scanf("%d%*c",&horas);
	printf("Digite o valor do salario minimo :");
	scanf("%f%*c",&sal_min);
	hora_trabalhada = sal_min/2;
	sal_bruto = horas*hora_trabalhada;
	imp = sal_bruto*0.3;
	sal_receber = sal_bruto - imp;
	printf("O salario a receber e de = %f",sal_receber);
	getchar();
	return 0;
}
