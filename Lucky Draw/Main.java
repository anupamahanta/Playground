#include <iostream>
using namespace std;
int main(){
   int num;
   int flag = 1;
   //cout<<"Enter any number(should be positive integer): ";
   cin>>num;
 if(num==1)
 {
 	flag=0;
 }
   for(int i = 2; i <= num/2 ; i++) {
      if(num % i == 0) {
         flag = 0;
         break;
      }
   }
   if (flag==1)
      cout<<"Eligible ";
   else
      cout<<"Not eligible";
   return 0;
}