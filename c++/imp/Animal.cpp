#include<iostream>
#include<cstring>
using namespace std;
 
 class Animal
 {
 	protected:
 		string name;
 		int age;
 		public:
        Animal()
        {
          name="raja";
          age=0;
        }
        Animal(string n, int a):name(n), age(a)
        {

        }
        virtual ~Animal()
        {

        }

        Animal(Animal &obj)
        {
            name=obj.name;
            age=obj.age;
        }
        virtual string talk()=0;
       virtual void display()=0;
 };

 class Dog:public Animal
 {
    public:
            Dog()
            {
                name="dog";
                age=0;
            }
            Dog(string n, int a):Animal(n,a)
            {

            }
            Dog(Dog &d):Animal(d){} //copy Constructor
            Dog operator = (Dog &d) 
            {
                name=d.name;
                age=d.age;
            }
            virtual ~Dog()
            {

            }
            void display() override
          {
              cout<<"\nName  of Dog:- "<<name<<"\tage of Dog:- "<<age<<endl;
          }
          string talk() override
          {
          	cout<<name<<" Sound like:- ";
            return "\tBhawwwBhaoww\n";
          }
          
 };
 
 class Cat:public Animal {
    public:
    Cat()
    {

    }
    Cat(string n, int a):Animal(n,a)
    {

    }

    Cat (Cat &d):Animal(d){} //copy Constructor
    Cat operator = (Cat &c)
    {
        name=c.name;
        age=c.age;
    }
    
    virtual ~Cat()
    {

    }
    string talk() override
    {
        cout<<name<<" Talk like :- ";
        return " MeowwwwMeowww\n";
    }

    void display() override
    {
        cout<<"\nName of Cat:- "<<name<<"\tAge of Cat:- "<<age<<endl;
    }
    bool  operator == (Cat &d)
    {
        if((strcmp(name.c_str(), d.name.c_str() )==0))
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
    Cat c1("Pawan", 2), c2("Harsh", 2), c3("Himan", 3);
    c1.display();
    c2.display();
    c3.display();

    c1=c2=c3;
    c1.display();



     if(c1==c2)
     {
        cout<<"\nName are Same ";
     }
     else 
     {
        cout<<"\nName are Different ";
     }
    
    return 0;

 }
