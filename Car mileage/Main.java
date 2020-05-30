#include<iostream>
using namespace std;
int main()
{
  float mil;
  int l,d,x;
  cin>>mil>>l>>d;
  x=mil*l;
  if(x>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}