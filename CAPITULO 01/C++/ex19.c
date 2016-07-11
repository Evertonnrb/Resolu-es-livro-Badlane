#include <stdio.h>
int main(){
    int x,y,xx,yy;
    printf("Digite da altura do degrau (em centimetros):");
    scanf("%d%*c",&x);
    printf("Qual e a altura que deseja alcançar (em metros)? :");
    scanf("%d%*c",&y);
    yy = y * 1000;
    xx = yy /x;
    printf(" %.3d\n",xx);
    system("pause");
    return 0;

}
