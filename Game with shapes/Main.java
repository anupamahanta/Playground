#include<iostream>
using namespace std;
int main()
{
  int radius,side,x;
  cin>>radius>>side;
  x=2*radius;
  if(side==x)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  return 0;
}