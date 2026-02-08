package bitwisedemo;

public class BitwiseDemo {

    static void andDemo()
    {
        int x=10, y=6, z;
        z=x&y;
        System.out.println(z);
    }

    static void orDemo()
    {
        int x=0b1010, y=0b0110, z;
        z=x|y;  // change to ^ if you want XOR
        System.out.println(z);
    }

    static void shiftDemo()
    {
        int x=0b1000;
        int y;
        y=x<<1;
        System.out.println(y);
    }

    static void signedShiftBinaryDemo()
    {
        int x=-0b1010;
        int y;
        y=x>>1;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
    }

    public static void main(String[] args) {
        andDemo();
        orDemo();
        shiftDemo();
        signedShiftBinaryDemo();
    }
    
}
