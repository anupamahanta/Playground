#include<iostream>
using namespace std;
int main()
{
	int n,m,x,y=0;
	cin>>n>>m;
	//for(x=n;(x>=m);x++)
	//{
	//x=m+n;
	//cout<<x<<endl;
	for(x=n;x<=m;x++)
	{
		y=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			{
				y=y+i;
				//cout<<y<<endl;
			}
			
		}
		if(x==y)
		{
			cout<<x<<" ";
		}
	
    }

	return 0;
}