package java8.session3.visibility;

public class A4
{
    protected int i;
}
 
class D extends A4
{
     public void method(){
    	 System.out.println(i);
     }
}