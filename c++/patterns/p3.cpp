#include<iostream>
using namespace std;

int main()
{
    int i,j, n=5;
    for(i=n; i>=1; i--)
    {
        for(j=0; j<i; j++)
        {
            cout<<"@";
        }
        for(j=i; j<=n-1; j++)
        {
            cout<<" ";
        }
        cout<<"\n";
    }
    
}

