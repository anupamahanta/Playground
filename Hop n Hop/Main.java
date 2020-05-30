#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,zy,zx;
  std::cin>>x;
  std::cin>>y;
  zy=y-4;
  zx=x-3;
  if(zy>zx)
    std::cout<<zy;
  else
    std::cout<<zx;
  return 0;  
}