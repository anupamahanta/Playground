#include<iostream>
using namespace std;
int main()
{
  int age;
  float x=10.15,y=13.30,z=18.00,a=22.00;
  float time;
  cin>>age>>time;
  if(age>13)
  {
    if((time==x))
    {
      cout<<"$8.00";
    }
    else if((time==z)||(time==a)||(time==y))
    {
      cout<<"$5.00";
    }
  }
  else
  {
        if((time==x))
    {
      cout<<"$4.00";
    }
    else if((time==z)||(time==a)||(time==y))
    {
      cout<<"$2.00";
    }
  }
  return 0;
}
