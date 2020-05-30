#include<iostream>
using namespace std;
int main()
{
  int m,n,t,p;
  std::cin>>m>>n>>t;
  if((t>n)&&(t<=(n*2)))
     {
     std::cout<<"It is a mango tree";
     }
  else if((t>n*(m-2)&&(t<=n*(m-1))))
           {
            std::cout<<"It is a mango tree";
           }
   else
			std::cout<<"It is not a mango tree";          
  return 0;
}       