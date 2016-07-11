#include <stdio.h>
#include <stdlib.h>
int main()
{
	float n1,n2,n3,media;
	printf("Digite a primeira nota: ");
	scanf("%d%*c",&n1);
	printf("Digite a segunda nota: ");
	scanf("%d%*c",&n2);
	printf("Digite a terceira nota: ");
	scanf("%d%*c",&n3);
	media = (n1+n2+n3)/3;
	printf("A media das notas e de %6.3f ",media);
	return 0;
}
