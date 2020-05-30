#include<iostream>
int main()
{
  int n,x;
  std::cin>>n;
  x=(n%2==0)?1:0;
  if(x==1)
  std::cout<<"Possible";
  else
  std::cout<<"Not possible";
  return 0;
}
