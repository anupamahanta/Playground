#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  float x,y,z;
  cin>>n;
  cout<<0.5<<" ";
  for(int i=0;i<(n-1);i++)
  {
    x=pow(3,i);
    y=y+x;
    z=y+0.5;
    cout<<z<<" ";
  }
  return 0;
}