package java8.session3.visibility;
//You can´t create sub classes to that class which has only private
class A
{
    private A()
    {
        //First Constructor
    }
     
    private A(int i)
    {
        //Second Constructor
    }
}
