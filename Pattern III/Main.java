#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i){
        cout<<i<<"*";
      }
      else
      {
        cout<<i<<endl;
      }
    }
  }
  
  for(i=n;i>=0;i--)
   {
     for(j=1;j<=i;j++)
       {
         if(j<i)
         {
            cout<<i<<"*";
         }
          else
          {
            cout<<i<<endl;
          }
        }
      }
      return 0;
}