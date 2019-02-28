package java8.session3.visibility;

class A5
{
    private class F
    {
        //inner class
    }
    
 //   No. La Clase B interna privada no puede ser instanciada 
 //   fuera de la Clase A5.
    
    A5(){
    	F f = new F();
    }
}
