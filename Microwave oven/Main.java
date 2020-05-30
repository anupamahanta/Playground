#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  float heat,h;
  cin>>n>>heat;
  if(n==1)
  {
    cout<<fixed<<setprecision(2)<<heat;
  }
  else if(n==2)
  {
    h=heat+(heat/2);
    cout<<fixed<<setprecision(2)<<h;
  }
  else if(n==3)
  {
    h=heat*2;
    cout<<fixed<<setprecision(2)<<h;
  }
  else
  {
    cout<<"Number of items is more";
  }
  return 0;
 }