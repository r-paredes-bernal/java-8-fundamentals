package java8.session4;

class ONE
{
    void calculate(int a, int b)
    {
        System.out.println("Class ONE");
    }
}
 
class TWO extends ONE
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class TWO");
    }
}
 
class Z extends TWO
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
}
 
public class X10 
{   
    public static void main(String[] args)
    {
    	ONE x = new TWO();
         
    	x.calculate(10, 20);
         
    	TWO y = (TWO)x;
         
        y.calculate(50, 100);
         
        Z z = (Z) y;
         /*
          * La línea 41 (Z z = (Z) y) lanzará java.lang.ClassCastException 
          * en tiempo de ejecución. Porque, Y no puede ser lanzado a Z.
          */
        z.calculate(100, 200);
    }
}
