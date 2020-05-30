#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  do
  {
   	n=n/10;
    c++;
  }while(n!=0);
  cout<<c;
  return 0;
}