#include<iostream>
using namespace std;

int main()
{
    int i,j, n=5;
    for(i=0; i<n; i++)
    {
        for(j=0; j<i; j++)
        {
            cout<<" ";
        }
        for(j=i; j<=n-1; j++)
        {
            cout<<"#";
        }
        cout<<"\n";
    }
    
}

