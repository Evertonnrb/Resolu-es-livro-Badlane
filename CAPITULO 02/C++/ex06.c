#include<stdio.h>
int main(){
    int num,div;
    printf("Digite um numero ");
    scanf("%d%*c",&num);
    div = num%2;
    if (div == 0)
        printf("Numero par");
    else
        printf("Numero impar");
    return 0;
}
