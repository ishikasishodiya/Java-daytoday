#include<stdio.h>
int main(){
int num[5],j;
int sum=0;
printf("input five numbers :");
scanf("%d",&num[0]);
scanf("%d",&num[1]);
scanf("%d",&num[2]);
scanf("%d",&num[3]);
scanf("%d",&num[4]);

for( j=0; j<5;j++){
    if(num[j]%2 != 0){
        sum=sum+num[j];
    }
}
printf("%d",sum);



}
