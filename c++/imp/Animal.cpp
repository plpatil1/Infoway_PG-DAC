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
		cout<<"\nDefault const";
		name="PAWAN";
		age=0;
	}
    Animal(string nm, int a)
    {
        cout<<"\nParameterised constructor called";
        name=nm;
        age=a;
    }
     virtual ~Animal()
    {
        cout<<"\nDestructor called";
    }
    void set_name(string nm)
    {
        name=nm;
    }
    void set_age(int a)
    {
        age=a;
    }
    string get_name()
    {
        return name;
    }
     int get_age()
    {
        return age;
    }
   
    virtual void talk()=0;

}; 
class Dog:public Animal
{
    public:
    Dog(string nm,int a):Animal(nm,a)
    {
	
    }
     ~Dog()
    {
        cout<<"\nDestructor of dog called";
    }
    
    void talk()
    {
    	cout<<"\nNAME:- "<<name<<"\t"<<"AGE:- "<<age;
        cout<<"\t bhaww bhaw!!!!";
    }
   
};
class Cat:public Animal
    {
      public:
      	Cat(string nm,int a):Animal(nm,a)
      	{
			cout<<"\nParameterised const called";
		}
      	~Cat()
      	{
      		cout<<"\nDestruct called for cat";	
		}

        bool operator == (Cat ct)
        {
            if(strcmp(name.c_str(),ct.name.c_str())==0)
            {
                return true;
            } else
            {
                return false;
            }
        }
		void talk()
		{
				cout<<"\nNAME:- "<<name<<"\t"<<"AGE:- "<<age;
        cout<<"\t Mewwwww Mewwwwww!!!!";
		}
	};

int main()
{
    
    Animal *ptr=new Dog("goofy",3);
    ptr->talk();
    delete ptr;
    ptr=new Cat("sweety",2);
    ptr->talk();
    delete ptr;
    Cat ct("Puppy", 2);
    Cat cw("Pup", 2);
     ct.talk();
     cw.talk();
    if(ct==cw)
    {
        cout<<"\n Both are Same: ";
    }else {
        cout<<"\n  Both are not same";
    }

    return 0;
}

