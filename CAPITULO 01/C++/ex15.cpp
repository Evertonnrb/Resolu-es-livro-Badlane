#include <stdio.h>
int main ()
{
	float vr_fabrica,vr_imp,vr_lucro,vr_final;
	printf("DIigite o valor do preco de fabrica do veiculo : ");
	scanf("%f%*c",&vr_fabrica);
	printf("Digite o valor do percentual de lucro do distribuidor : ");
	scanf("%f%*c",&vr_lucro);
	printf("Diigite o  valor de percentual de impostos :");
	scanf("%f%*c",&vr_imp);
	vr_final = vr_fabrica + vr_imp + vr_lucro;
	printf("O valor final sera de %f",vr_final);
	getchar();
	return 0;
}
