#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  float si,a,d,td;
  std::cin>>p;
  std::cin>>r;
  std::cin>>t;
  si=(p*r*t)/100;
  a=p+si;
  d=si*0.02;
  td=a-d;
  std::cout<<si<<"\n"
  <<a<<"\n"
  <<d<<"\n"
  <<td;
  return 0;
 }