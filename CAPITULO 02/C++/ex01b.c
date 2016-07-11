#include <stdio.h>
int main(){
    int media;
    float tl,av,ex,m_tl,m_av,m_ex;
    printf("Digite a nota do trabalho em laboratorio :");
    scanf("%f%*c",&tl);
    printf("Digite a nota da avaliacao : ");
    scanf("%f%*c",&av);
    printf("Digite a nota do exame : ");
    scanf("%f%*c",&ex);
    m_tl = tl*2;
    m_av = av * 3;
    m_ex = ex * 5;
    media = (m_tl+m_av+m_ex)/10;
    switch (media)
    {
    case 1:
        if(media>8)
        printf("Conceito A\n");
    break;
    case 2:
            if(media>=7 || media<8)
            printf("Conceito B\n");
    break;
    case 3:
        if(media>=6||media<7)
            printf("Conceito C\n");
    break;
    case 4:
        if(media >=5||media<6)
            printf("Conceito D\n");
    break;
    default:
        printf("OPC");
    break;

    }
    printf("Sua media eh = %.2d\n",media);
    return 0;
}
