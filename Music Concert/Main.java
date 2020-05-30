#include<iostream>
int main(){
  int *a;
  int n,cm=0,cf=0;
  std::cin>>n;
  a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    std::cin>>*(a+i);
  }
  for(int i=0;i<n;i++)
  {
    if((*(a+i))%2==0)
    {
      cf=cf+1;
    }
    else
    {
      cm=cm+1;
    }
  }
  std::cout<<cm<<"\n";
  std::cout<<cf;
  return 0;
}