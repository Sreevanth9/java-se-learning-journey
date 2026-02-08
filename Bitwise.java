package bitwise;


public class Bitwise {

    static void xorSwapDemo()
    {
      int a=10, b=15;
      
      a=a^b;
      b=a^b;
      a=a^b;
      
      System.out.println(a+ " "+b);
    }
    
    static void packUnpackDemo1()
    {
      byte a=9, b=12;
      
      byte c;
      
      c=(byte)(a<<4);
      c=(byte)(c|b);
      
      System.out.println((c&0b11110000)>>4);
      System.out.println(c & 0b00001111);
    }
    
    public static void main(String[] args) 
    {
      xorSwapDemo();
      packUnpackDemo1();
      packUnpackDemo2();
    }
    
    
    static void packUnpackDemo2()
    {
      byte c;
      
      c=(byte)(9<<4);
      c=(byte)(c|12);
      
      System.out.println((c&0b11110000)>>4);
      System.out.println((c&0b00001111));
    }
}
