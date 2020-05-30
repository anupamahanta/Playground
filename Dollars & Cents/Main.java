#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,x,y;
  cin>>d1>>c1>>d2>>c2;
  x=d1+d2;
  y=c1+c2;
  while(y>100)
  {
    x=x+1;
    y=y-100;
    break;
  }
  cout<<x<<endl<<y;
  return 0;  
}