#include<iostream>
using namespace std;
int main()
{
  int w,na,nc,x,y,z;
  std::cin>>w>>na>>nc;
  x=na*75;
  y=nc*30;
  z=x+y;
  if(w>z)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
  return 0;
    
}