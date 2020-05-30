#include<iostream>
using namespace std;
int main()
{
  int birth_year,cur_year,x,y;
  cin>>birth_year>>cur_year;
  x=cur_year-birth_year;
  if(x>0)
  {
    y=cur_year-birth_year;
    cout<<y;
  }
  else
  {
    y=(2000+cur_year)-(1900+birth_year);
      cout<<y;
  }
  return 0;
}
  
