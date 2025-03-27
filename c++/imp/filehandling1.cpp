#include<fstream>
#include<iostream>
using namespace std;
int main()
{
    char ch;
    ofstream f1("first.txt");
    f1<<"\nHi";
    f1<<"\nCPP users";
    f1.put('\0');
    f1<<"\nWelcome to world of c++ programming\n";
//    f1.put('\0');
    f1.close();
    ifstream f2("first.txt");
    while((!f2.eof()))
    {
        ch=f2.get();
        cout<<ch;
    }
    f2.close();
    return 0;
}
