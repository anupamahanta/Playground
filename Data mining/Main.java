#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x,y=0,z=0;
  cin>>n;
  while(n>0)
  {
    x=n%10;
    if(x%2==0)
    {
      y=y+x;
    }
    else
    {
      z=z+x;
    }
    n=n/10;
  }
  if(y==z)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  return 0;
}
