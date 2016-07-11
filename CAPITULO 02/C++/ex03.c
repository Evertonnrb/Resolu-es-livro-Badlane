#include <stdio.h>
int main (){
    int n1,n2,maior;
    printf("Digite um numero1 :");
    scanf("%f%*c",&n1);
    printf("Digite um numero2 :");
    scanf("%f%*c",&n2);
    if(n1>n2)
        printf("numero1 maior que o numero2\n");
    else
        printf("numero2 maior que o numero1\n");

    system("pause");
    return 0;
}
