package java8.session3.overridingandoverloading;
//No pueden tener diferentes excepciones.Error de metodo dupicado
class X32
{
    void myMethod() throws IOException
    {
        System.out.println("ONE");
    }
     
    void myMethod() throws NumberFormatException
    {
        System.out.println("TWO");
    }
     
    void myMethod() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("THREE");
    }
}
