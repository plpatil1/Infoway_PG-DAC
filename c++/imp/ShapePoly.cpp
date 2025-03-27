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
        cout<<"Height := "<<h<<"\t Width := "<<w;
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
};
int main()
{
    Shape *trptr=new Triangle(5,6);
    trptr->display();
    cout<<"\t"<<trptr->cal_area();
    delete trptr;
    Shape *Crptr=new Circle(2,2,3);
    Crptr->display();
    cout<<" \t "<<Crptr->cal_area();
     delete Crptr;
    return 0;

}
