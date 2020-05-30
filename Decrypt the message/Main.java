#include<iostream>
using namespace std;
int main()
{
	int n,m,x,y=0;
	cin>>n>>m;
	x=m+n;
	//cout<<x<<endl;
	for(int i=1;i<x;i++)
	{
		if(x%i==0)
		{
			y=y+i;
			//cout<<y<<endl;
		}
	
	}
		//cout<<y;
		if(y==x)
			cout<<"They can read the message";
		else
			cout<<"They can't read the message";
	return 0;
}