package java8.session3.visibility;
/*17) �Cu�l ser� el resultado del siguiente programa? 
 * 104 por que al retornar cada metodo va aumentando
 * */
public class A17
{
    private int methodOne(int i)
    {
        return ++i;
    }
     
    public int methodTwo(int i)
    {
        return methodOne(++i);
    }
}
