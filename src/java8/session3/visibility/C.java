package java8.session3.visibility;
//Yes, protected members of a class are inherited to any sub class
public class C
{
    protected int i;
}
 
class CC extends C
{
   public void metodoOne() {
	   System.out.print(i);
   }
}