#include<iostream>
using namespace std;

int main()
{
	int i, j, n=5;
	for(i=1; i<=5; i++)
	{
		for(j=i; j>=1; j--)
		{
			cout<<j;
		}
		cout<<"\n";
	}
}
