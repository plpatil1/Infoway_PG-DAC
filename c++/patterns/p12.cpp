#include <iostream>
using namespace std;
int main() {
     int i, j,n=5;
     for(i=1; i<=n; i++)
     {
         for(j=0; j<=n-i; j++)
         {
             cout<<" ";
         }
         for(j=1; j<=i; j++)
         {
             cout<<j;
         }
         cout<<"\n";
     }

    return 0;
}

