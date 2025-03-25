#include<iostream>
using namespace std;
int main()
{
    int i, j, n;
    n=5;
    int m;
    for(i=0; i<n; i++)
    {
        int m=1;
        for(j=1; j<n-i; j++)
        {
            cout<<" ";
        }
        for(j=0; j<=i; j++)
        {
            cout<<m<<" ";
            m=m*(i-j)/(j+1);
        }
        cout<<"\n";
    }
    cout<<"\n THE END....!";
    return 0;
}
