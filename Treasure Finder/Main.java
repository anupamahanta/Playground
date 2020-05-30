#include<iostream>
using namespace std;
int main()
{
  	int m,n,p,hcf;
	cin>>m>>n>>p;
	if((m>n)&&(n>p)||(p>n)&&(n>m))
	{
		cout<<"The treasure is in box which has number "<<n<<endl;
	}
	else if((m>p)&&(p>n)||(n>p)&&(p>m))
	{
		cout<<"The treasure is in box which has number "<<p<<endl;
	}
	else if((n>m)&&(m>p)||(p>m)&&(m>n))
	{
		cout<<"The treasure is in box which has number "<<m<<endl;
	}
  int min = (m < n ? m : n);
min = (min < m ? min : n);

for( int i = min; i>0; i--)
{
if(m%i == 0 && n%i == 0 && p%i == 0)
{
  hcf = i;
  break;
  }
}
std::cout<<"The code to open the box is "<<hcf;
	return 0;
}