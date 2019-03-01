package pkg.pas.overwriter;

//18) Can you find out the error in the following code snippet?
// R=The visibility of methodOfA() has been reduced to default while overriding it in the class B. You can’t reduce the visibility of a method while overriding it
public class Overwriter {

}

class A
{
    public void methodOfA()
    {
        System.out.println("Class A");
    }
}
 
class B extends A
{
    @Override
    void methodOfA()
    {
        System.out.println("Class B");
    }
}