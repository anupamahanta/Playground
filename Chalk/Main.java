#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,ans;
  float r,x,y;
  cin>>n;
  r=(1/(sqrt(n)));
  x=r*n;
  y=int(x);
  ans=y+n+1;
  cout<<ans;
  return 0;
}