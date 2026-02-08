package lamdademo1;

@FunctionalInterface
interface MyLambda
{
    //public void display(String str);
    public int add(int x,int y);
}

public class LamdaDemo1 {

    static void verboseAddDemo()
    {
        MyLambda m=(a,b)->{return a+b;};
        System.out.println(m.add(20,30));
    }

    public static void main(String[] args) {
      
        MyLambda m=(a,b)->a+b;
        int r=m.add(20, 30);
        System.out.println(r);
        verboseAddDemo();
    }
    
}
