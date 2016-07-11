#include <stdio.h>
int main(){
    int saco,gato1,gato2,consumo,peso_saco;
    printf("Digite o peso do saco em (kg): " );
    scanf("%d%*c",&saco);
    printf("Digite a quantidade consumida pelo gato 1 (em gramas): ");
    scanf("%d%*c",&gato1);
    printf("Digite a quantidade consumida pelo gato 2 (em gramas): ");
    scanf("%d%*c",&gato2);
    peso_saco = saco * 1000;
    consumo = peso_saco - (5*(gato1+gato2));
    printf("%.3d\n" ,consumo);
    system("pause");
    return 0;
}
