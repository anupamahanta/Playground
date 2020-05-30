#include<iostream>
using namespace std;

int doc_app(int);

int doc_app(int a,int b)
{
  int x=1;
  for(int i=1;i<=b;i++)
  {
    x=x*a;
  }
  return x;
}


int main()
{
  int n,m,req;
  cin>>n>>m>>req;
  int y=doc_app(n,m);
  if(y>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}