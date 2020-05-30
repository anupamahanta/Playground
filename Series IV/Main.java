#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m=0,c=2,x=1;
  cin>>n;
  cout<<0<<" ";
  for(int i=0;i<(n-1);i++)
  {
    m=m+c;
    cout<<m<<" ";
    x++;
    if(x%2==0)
    {
      c=c+4;
    }
    else
    {
      c=c+0;
    }
  }
    return 0;
    }