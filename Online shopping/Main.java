#include<iostream>
using namespace std;
int main()
{
  int flip_amt,flip_dis,flip_ship,
      snap_amt,snap_dis,snap_ship,
      ama_amt,ama_dis,ama_ship;
  int x,y,z;
  cin>>flip_amt>>flip_dis>>flip_ship
     >>snap_amt>>snap_dis>>snap_ship
     >>ama_amt>>ama_dis>>ama_ship;
  x=(flip_amt-((flip_dis*flip_amt)/100))+flip_ship;
  y=(snap_amt-((snap_dis*snap_amt)/100))+snap_ship;
  z=(ama_amt-((ama_dis*ama_amt)/100))+ama_ship;
  cout<<"In Flipkart Rs."<<x<<endl;
  cout<<"In Snapdeal Rs."<<y<<endl;
  cout<<"In Amazon Rs."<<z<<endl;
  if(x<=y)
  {
    if(x<z)
    {
      cout<<"He will prefer Flipkart";
    }
    else
    {
      cout<<"He will prefer Amazon";
    }
  }
  else
  {
    if(y<z)
    {
      cout<<"He will prefer Snapdeal";
    }
    else
    {
      cout<<"He will prefer Amazon";
    }
  }
  return 0;
}