#include <stdio.h>
int main(){
    float tl,av,ex,m_tl,m_av,m_ex,media;
    printf("Digite a nota do trabalho em laboratorio: ");
    scanf("%f%*c",&tl);
    printf("Digite a nota da avaliacao : ");
    scanf("%f%*c",&av);
    printf("Digite a nota do exame final :");
    scanf("%f%*c",&ex);
    m_tl= tl * 2;
    m_av = av * 3;
    m_ex = ex * 5;
    media = (m_tl + m_av + m_ex) / 10;
    if(media >= 8){
        printf("Conceito A\n");
    }
    else if (media >= 7 || media < 8){
        printf("Conceito B\n");

    }
    else if (media >= 6 || media < 7){
        printf("Conceito C\n");
    }
    else if (media >= 5 || media < 6){
        printf("Conceito D\n");
    }
    else{
        printf("Conceito E\n");
    }

    printf("Sua media eh = %.2f\n",media);
    system("pause");
    return 0;
}
