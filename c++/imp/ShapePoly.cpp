#include<iostream>
using namespace std;

class Shape
{
   protected:
     int height;
     int width;
     int radius;
     public:
      Shape()
      {

      }
      Shape(int h, int w)
      {
        height=h;
        width=w;
      }
      Shape(int r)
      {
       radius=r;
      }
      virtual ~Shape()
      {

      }
      virtual float cal_area()=0;
      void display()
      {
        cout<<"Height := "<<height<<"\t Width := "<<width<<"\t Radius:= "<<radius;
      }
};

class Triangle:public Shape
{

    public:
    Triangle()
    {

    }
    Triangle(int ht, int wd):Shape(ht,wd)
    {

    }
    ~Triangle()
    {

    }
    float cal_area()
    {
        return (height*width)/2;
    }
    void display()
    {
        cout<<"\nHeight:= "<<height<<"\t"<<"Width:= "<<width;
    }

    bool operator == (Triangle &t)
	{
		if((this->cal_area() == t.cal_area()))
		{
			return true;
		} else 
		{
			return false;
		}
	}
};

class Circle:public Shape
{
    int pointx;
    int pointy;
    public:

    Circle()
    {

    }
    Circle(int p1, int p2, int r):Shape(r)
    {
        pointx=p1;
        pointy=p2;

    }
    ~Circle()
    {

    }
    float cal_area()
    {
        return (3.14*radius*radius);
    }
    bool operator == (Circle &c)
	{
		if((this->cal_area() == c.cal_area()))
		{
			return true;
		} else 
		{
			return false;
		}
	}

    void display()
    {
        cout<<"\nPoint X:= "<<pointx<<"\t"<<"Point Y:= "<<pointy<<"\t"<<"Radius:= "<<radius;
    }
};
int main()
{
     Triangle t1(5,6);
    t1.display();
    cout<<"\nArea of Triangle :- ";
    cout<<t1.cal_area()<<"\n";
    Triangle t2(6,4);
    t2.display();
    cout<<"\nArea of Triangle :- ";
    cout<<t2.cal_area()<<"\n";


    if(t1==t2)
    {
        cout<<"\nBoth Traingle are same\n";
    } 
    else
    {
        cout<<"\nBoth Traingle are Different\n";
    }

    
    Circle c1(2,2,3), c2(3,3,8);
    c1.display();
    cout<<"\nArea of Circle:- ";
    cout<<c1.cal_area()<<"\n";
   
    c2.display();
    cout<<"\nArea of Circle:- ";
    cout<<c2.cal_area()<<"\n";


    if(c1==c2)
    {
        cout<<"\nBoth Traingle are same\n";
    } 
    else
    {
        cout<<"\nBoth Traingle are Different\n";
    }

    return 0;

}
