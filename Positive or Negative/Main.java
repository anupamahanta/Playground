#include<iostream>
int main()
{
  int m;
  std::cin>>m;
  if(m>=0)
    std::cout<<m<<" is a positive number.";
  else
    std::cout<<m<<" is a negative number.";
  return 0;
}