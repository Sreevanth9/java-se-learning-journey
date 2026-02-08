package lamdademo;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}*/

public class LamdaDemo {

    static void verboseLambdaDemo()
    {
        MyLambda m =
                ()->
                {
                    System.out.println("Hello World");
                };
        m.display();
    }

    public static void main(String[] args) {
        
        MyLambda m=()->{System.out.println("Hello world");};
        
        m.display();
        verboseLambdaDemo();
        
    }
    
}
