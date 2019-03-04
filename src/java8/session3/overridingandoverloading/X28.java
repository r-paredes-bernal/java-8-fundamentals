package java8.session3.overridingandoverloading;
/*methodOne () no se reemplaza correctamente. Porque, los argumentos
 *  no son compatibles.
*/
class X28
{
    void methodOne(Double D)
    {
         
    }
     
    int methodTwo(Integer I)
    {
        return I;
    }
}
 
class B28 extends X28
{
    @Override
    void methodOne(double d)
    {
         
    }
     
    @Override
    int methodTwo(Integer I)
    {
        return (int)1.1;
    }
}
