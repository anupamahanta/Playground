#include<iostream>
using namespace std;
int main()
{
  int n;
  string s="front";
  string s1;
  cin>>s1;
  cin>>n;
  if(s==s1)
  {
    if(n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(n==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  return 0;
}
