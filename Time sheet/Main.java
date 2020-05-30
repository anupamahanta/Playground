#include<iostream>
using namespace std;
int main()
{
	int sun,mon,tue,wed,thu,fri,sat;
	int a,b,c,d,e,f,g,h,i,j,x;
	cin>>sun>>mon>>tue>>wed>>thu>>fri>>sat;
	x=mon+tue+wed+thu+fri;//total hrs of working
	//cout<<x;
if(x<=40){
		if(sun>=0)
		{
			a=(sun*100)+(0.5*sun*100);
			
		}
		if(mon>=0)
		{
			if(mon<=8)
				b=mon*100;
			else
				b=(mon*100)+((mon-8)*15);
			
		}
		if(tue>=0)
		{
			if(tue<=8)
				c=tue*100;
			else
				c=(tue*100)+((tue-8)*15);
			
		}
		if(wed>=0)
		{
			if(wed<=8)
				d=wed*100;
			else
				d=(wed*100)+((wed-8)*15);
			
		}		
		if(thu>=0)
		{
			if(thu<=8)
				e=thu*100;
			else
				e=(thu*100)+((thu-8)*15);
			
		}		
		if(fri>=0)
		{
			if(fri<=8)
				f=fri*100;
			else
				f=(fri*100)+((fri-8)*15);
			
		}		
		if(sat>=0)
		{
			g=(sat*100)+((0.25)*sat*100);
		}
	h=a+b+c+d+e+f+g;
	cout<<h<<endl;
	}
	
	else{
		if(sun>=0)
		{
			a=(sun*100)+(0.5*sun*100);
			
		}
		if(mon>=0)
		{
			b=mon*100;
			
		}
		if(tue>=0)
		{
			c=tue*100;
		}
		if(wed>=0)
		{
			d=wed*100;
				
		}		
		if(thu>=0)
		{
			e=thu*100;
		}		
		if(fri>=0)
		{
			f=fri*100;
					
		}		
		if(sat>=0)
		{
			g=(sat*100)+(0.25*sat*100);
		}
	//cout<<a<<endl;
	//cout<<b<<endl;
	//cout<<c<<endl;
	//cout<<d<<endl;
	//cout<<e<<endl;
	//cout<<f<<endl;
	//cout<<g<<endl;
	h=a+b+c+d+e+f+g;
	i=h+(25*(x-40));
	cout<<i<<endl;
	}
	return 0;
}