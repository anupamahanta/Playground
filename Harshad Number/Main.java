#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int r=n;
  int x=0,y;
  while(n>0)
  {
    y=n%10;
    x=x+y;
    n=n/10;
  }
  if(r%x==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}