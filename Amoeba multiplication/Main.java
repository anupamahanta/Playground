#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x1=0,x2=1,x3=0;
  cin>>n;
  for(int i=2;i<n;i++)
  {
    x3=x1+x2;
    x1=x2;
    x2=x3;
  }
  cout<<x3;
  return 0;
}