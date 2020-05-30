#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x,y,c;
  std::cin>>n;
  x=n/1000;
  while(c<=3){
  n=n%10;
  c++;
  }
  y=x+n;
  std::cout<<y;
  return 0;
}