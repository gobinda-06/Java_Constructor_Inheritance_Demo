class Base
{
    Base()
    {
        System.out.println("I am a constructor of base class");
    }

    Base(int a)
    {
        System.out.println("I am a parameterized constructor of base class: " + a);
    }

    public int x;

    public int getx()
    {
        return x;
    }

    public void setx(int x)
    {
        this.x = x;
    }
}

class Derived extends Base
{
    Derived()
    {
        super(0); //  Correct way to call Base(int a)
        System.out.println("I am a constructor of derived class");
    }

    public int y;

    public int gety()
    {
        return y;
    }

    public void sety(int y)
    {
        this.y = y;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Base b = new Base();      // Calls Base() constructor
        Derived d = new Derived(); // Calls Base(int) via super(0), then Derived()
    }
}
