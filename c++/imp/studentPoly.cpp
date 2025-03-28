#include<iostream>
using namespace std;

class Student{
    protected:
    int rno;
    string name;

    public:
    Student(){
        cout<<"\n base class default constructor called";
    }
    Student(int a,string n):rno(a),name(n){
        cout<<"\nbase class para constructor called";
    }
    virtual double res()=0;
    virtual void display()=0;

    virtual ~Student(){
        cout<<"\nbase class destructor called";
    }
};

class ScStud : public Student{
    protected:
    int phyTh,cheTh,matTh,phyPr,chePr;

    public:
    ScStud(){
        cout<<"scstud default constructor called";
    }
    ScStud(int r,string n,int pt,int ct,int mt,int pp,int cp):Student(001,"harsh"),phyTh(pt),phyPr(pp),cheTh(ct),chePr(cp),matTh(mt){
        cout<<"\n scstud param constructor called";
    }

    double res(){
        double res=0.0;
        double m_total=phyTh+phyPr+chePr+cheTh+matTh;
        res=m_total/300*100;
        return res;
    }

    void display(){
        cout<<"\nThe result of science student ";
        cout<<"\nName:"<<name<<" Rollno : "<<rno;
        cout<<"\nTotal mark percentage : "<<res();
    }

    ~ScStud(){
        cout<<"\nScStud destructor called";
    }

    


};

int main(){

    Student* ptr = new ScStud(001,"Pawan",40,35,78,30,34);
    ptr->display();
    delete ptr;
    return 0;
}
