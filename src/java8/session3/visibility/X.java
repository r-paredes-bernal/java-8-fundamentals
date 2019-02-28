package java8.session3.visibility;
//Outer class can’t be private. Don’t declare Class A as private.
//private class X
public class X
{
    private class B
    {
        private class C
        {
             
        }
    }
}
