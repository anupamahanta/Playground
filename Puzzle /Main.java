#include<iostream>
using namespace std;
int main()
{
    int rows,cols,m1[10][10],m2[10];
  cin>>rows;
  cin>>cols;
  for(int i=0;i<rows;i++)
  {
    for(int j=0;j<cols;j++)
    {
      cin>>m1[i][j];
    }
  }
  for(int i=0;i<cols;i++)
  {
    for(int j=0;j<rows;j++)
    {
      cout<<m1[j][i]<<" ";
    }
    cout<<"\n";
  }
  return 0;
}