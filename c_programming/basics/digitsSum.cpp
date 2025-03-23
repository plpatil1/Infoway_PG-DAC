#include<iostream>
using namespace std;

int main()
{
	int num;
	cout<<"\n Enter The Number: ";
	
	cin>>num;
	
	int  i, n, sum=0;
	n=num;
	
	while(n!=0)
	{
		int last=n%10;
		sum=sum+last;
		n=n/10;
	}
	cout<<sum;
	return 0;
}
