#include<iostream>
int main()
{
  int m,n,p;
  std::cout<<"Enter first number : "<<"Enter second number : "<<"Menu"<<"\n"
    <<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"
    <<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
  std::cin>>m>>n>>p;
  
  switch(p)
  {
    case 1:
      std::cout<<m+n;
      break;
    case 2:
      std::cout<<m-n;
      break;
    case 3:
      std::cout<<m*n;
      break;
    case 4:
      std::cout<<m/n;
      break;
    case 5:
      std::cout<<m%n;
      break;
    default:
      std::cout<<"Invalid operation";
      break;
  }
  return 0;
}
  