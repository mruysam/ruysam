#include <stdio.h>
#include <stdlib.h>

int main () {

float n1,n2,n3,media;
int quantidade=0;
printf (" ");
scanf ("%f", &n1);
printf ("");
scanf ("%f", &n2);
printf ("");
scanf ("%f", &n3);
media=(n1+n2+n3)/3;
    if (n1>media){
        quantidade ++; }
        if (n2>media){
            quantidade ++;
            }
            if (n3>media){
                quantidade ++;
                }
                printf ("%i",quantidade);
    return 0;

}
