#include <stdio.h>
int main(){
    float media,n1,n2,n3;
    printf("Digite a nota da n1 :");
    scanf("%f%*c",&n1);
    printf("Digite a nota da n2 :");
    scanf("%f%*c",&n2);
    printf("Digite a nota da n3 :");
    scanf("%f%*c",&n3);
    media = (n1 + n2 + n3)/3;
    if (media<3)
        printf("Reprovado\n");
    else if (media >=3 && media<7)
        printf("Recuperacao\n");
    else
        printf("Aprovado\n");

    printf("%.2f\n",media);
    system("pause");
    return 0;
}
