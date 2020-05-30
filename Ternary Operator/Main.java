#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x;
  std::cin>>n;
  x=(n%2==0)?1:0;
  if(x==1)
    std::cout<<"Even";
  else
    std::cout<<"Odd";
  return 0; 
}