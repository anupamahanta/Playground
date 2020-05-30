#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  cout<<n<<endl;
  int x=0,c=0;
  while(n>1)
  {
  if(n%2==0)
  {
    x=n/2;
    cout<<x<<endl;
    n=x;
  }
  else
  {
    x=(3*n)+1;
    cout<<x<<endl;
    n=x;
  }
    c++;
  }
  cout<<c;
  return 0;  
}