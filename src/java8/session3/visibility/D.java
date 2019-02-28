package java8.session3.visibility;
//The visibility of methodOfA() has been reduced to default while overriding it in the class B. You can’t 
//reduce the visibility of a method while overriding it.
class D
{
    public void methodOfA()
    {
        System.out.println("Class A");
    }
}
 
class BB extends D
{
    @Override
    //void methodOfA()
    public void methodOfA()
    {
        System.out.println("Class B");
    }
}