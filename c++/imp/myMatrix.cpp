#include<iostream>
#include<math.h>
using namespace std;

class MyMatrix
{
    int row;
    int col;
    int **arr;
    public:

    MyMatrix()
    {
        cout<<"\nDefault Constructor is called ";
        row=3;
        col=3;
        arr=new int *[row];
        for(int i=0; i<row; i++)
        {
            arr[i]=new int[col];
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
               arr[i][j]=0;
            }
        }
    }
    MyMatrix(int r, int c):row(r), col(c)
    {
        cout<<"\nParamterize Constructor ";
        arr=new int*[row];
        for(int i=0; i<row; i++)
        {
        	arr[i]=new int[col];
        }
        for(int i=0;i<row;i++){
            for(int j=0; j<col; j++)
            {   
                arr[i][j]=0;
            }
        }
        }
    
    ~MyMatrix()
    {
        cout<<"\nDestructor Called..";
        
        for(int i=0; i<row; i++)
        {
        
        }
        
    }
 
      friend istream &operator >> (istream &sin, MyMatrix &a);
      friend ostream &operator << (ostream &sout, MyMatrix &b);
      
      const MyMatrix operator + (const MyMatrix &a)
      {
           MyMatrix temp;
        if(row==a.row && col==a.col)
           {
            for(int i=0; i<a.row; i++)
           {
            for(int j=0; j<a.col; j++)
            {
                temp.arr[i][j]=arr[i][j]+a.arr[i][j];
            }
           }
        }
           return temp;
      }

      const MyMatrix operator * ( MyMatrix &a)
      {
           MyMatrix temp(row,a.col);
        if(row==a.row && col==a.col)
           {
            for(int i=0; i<a.row; i++)
           {
            for(int j=0; j<a.col; j++)
            {
                temp.arr[i][j]=0;
                for(int k=0; k<a.row; k++)
                {
                    temp.arr[i][j]+=arr[i][k] * a.arr[k][j];
                }
            }
           }
        }
           return temp;
      }


      const MyMatrix &operator =(const MyMatrix &m)
      {
        for(int i=0; i<row; i++)
        {
            delete []arr[i];
        }
        delete []arr;

        row=m.row;
        col=m.col;
        arr=new int *[row];
        for(int i=0; i<row; i++)
        {
            arr[i]=new int[col];
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=m.arr[i][j];
            }
        }

      }
     
           
};

istream &operator >> (istream &sin, MyMatrix &a)
{
    for(int i=0; i<a.row; i++)
    {
        for(int j=0; j<a.col; j++)
        {
            cout<<"\nEnter the Element "<<i<<" "<<j<<" ";
            sin>>a.arr[i][j];
        }
    }
}
ostream &operator << (ostream &sout, MyMatrix &a)
{
   cout<<"\n";
    for(int i=0; i<a.row; i++)
    {
        for(int j=0; j<a.col; j++)
        {
           sout<<a.arr[i][j]<<" ";
        }
        cout<<"\n";
    }
}

int main()
{
    MyMatrix c1,c2;
    cin>>c1;
    cin>>c2;
    c1=c1*c2;
    cout<<c1;

 return 0;
}
