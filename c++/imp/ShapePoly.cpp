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
      	height=0;
      	width=0;
      	radius=0;

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
        cout<<"\n"<<"Height := "<<height<<"\t Width := "<<width<<"\t Radius:= "<<radius;
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
    void display_t()
    {
        display();
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
    void display_c()
    {
    	display();
    	cout<<"\t"<<"Point X:= "<<pointx<<"\t"<<"Point Y:= "<<pointy;
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
};
int main()
{
//    Shape *trptr=new Triangle(5,6);
//    trptr->display();
//    delete trptr;
    Triangle t1(6,4);
    t1.display();
    cout<<"\nArea of Traingle:= "<<t1.cal_area();
    
    Circle c1(2,2,3);
    c1.display_c();
    cout<<"\nArea of Circle1:= "<<c1.cal_area();
    
    Circle c2(3,3,3);
    c2.display_c();
    cout<<"\nArea of Cricle2:= "<<c2.cal_area();
    
    if(c1==c2)
    {
    	cout<<"\n Both circle are of same area";
	}else 
	{
		cout<<"\n Both circle are of Different area";
	}
    
    return 0;

}
