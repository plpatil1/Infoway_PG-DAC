#include<fstream>
#include<iostream>
using namespace std;

int main()
{
    char arr[]="File is ECollection of Information";
    ofstream f1("third.txt");
   for(int i=0; arr[i]!='\0'; i++)
   {
    f1.put(arr[i]);

   }
   f1.seekp(9,ios::beg);
   f1.put('p');

    
}
