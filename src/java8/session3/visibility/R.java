package java8.session3.visibility;

class R
{
    public void methodOfA()
    {
        System.out.println("Class A");
    }
}
 
class S extends R
{
    @Override
    void methodOfA()
    {
        System.out.println("Class B");
    }
}
