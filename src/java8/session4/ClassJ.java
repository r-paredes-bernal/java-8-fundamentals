package java8.session4;

class ClassJ
{
    public ClassJ(int i)
    {
        System.out.println(1);
    }
     
    public ClassJ()
    {
        this(10);
         
        System.out.println(2);
    }
     
    void ClassJ()
    {
        ClassJ(10);
         
        System.out.println(3);
    }
     
    void ClassJ(int i)
    {
        System.out.println(4);
    }
}