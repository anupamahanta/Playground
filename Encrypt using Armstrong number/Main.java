#include<iostream>
#include<cmath>

int arm(int);
int power(int,int);

int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum=0,r=0,c=0,y=0;
  int x=n;
  int a=x;
  while(n!=0)
  {
    //r=n%10;
    n=n/10;
    c++;
  }
  //std::cout<<c<<"\n";
  for(int i=1;i<=c;i++)
  {
    r=x%10;
    x=x/10;
    y=pow(r,c);
    sum=sum+y;
  }
  //std::cout<<sum<<"\n";
  if(sum==a)
  return 1;
 }
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}