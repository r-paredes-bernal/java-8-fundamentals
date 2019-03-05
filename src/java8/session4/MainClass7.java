package java8.session4;

public class MainClass7
{
    double overloadedMethod(double d)
    {
        return d *= d;
    }
    
    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }
     
    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }
     
    public static void main(String[] args)
    {
        MainClass7 main = new MainClass7();
        /*
         * Lanzar� java.lang.StackOverflowError en tiempo de ejecuci�n.
         *  Porque, overloadedMethod (int) sigue llam�ndose a s� mismo.
         * 
         */
        System.out.println(main.overloadedMethod(100));
    }
}
