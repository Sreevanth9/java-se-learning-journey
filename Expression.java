package expression;

import java.lang.*;
import java.util.*;


public class Expression 
{
    static void areaUsingBaseHeight()
    {
        float base,height,area;
        System.out.println("Enter Base and Height");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=base*height*0.5f;
        System.out.println("Area of Triangle is "+area);
    }
    
    public static void main(String[] args) 
    {
        areaUsingBaseHeight();
        Scanner sc=new Scanner(System.in);
         
        int a,b,c;
        double s,area;
        
        System.out.println("Enter 3 Sides of a Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        s=(a+b+c)/2f;
        
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area of Triangle is "+area);
        
         
    }
}
