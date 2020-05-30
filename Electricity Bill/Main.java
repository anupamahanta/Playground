#include<iostream>
using namespace std;
int main()
{
  int c,y;
  std::cin>>c;
  if(c<=200)
  {
    y=0.5*c;
    std::cout<<"Rs."<<y;
  }
   else if((c>200)&&(c<=400))
  {
    y=0.65*c+100;
    std::cout<<"Rs."<<y;
  }
    else if((c>400)&&(c<=600))
  {
    y=0.80*c+200;
    std::cout<<"Rs."<<y;
  }
    else if(c>600)
  {
    y=1.25*c+425;
    std::cout<<"Rs."<<y;
  }
  return 0;
}