#include<iostream>
using namespace std;
int swap(int &a,int &b)
{
  a=a+b;
  b=a-b;
  a=a-b;
}
int main()
{
  int n1,n2;
  cin>>n1>>n2;
  cout<<"Before swapping a= "<<n1<<" and b="<<n2<<endl; 
  swap(n1,n2);
  cout<<"After swapping a= "<<n1<<" and b="<<n2;
  return 0;
}
  