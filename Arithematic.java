package arithematic;

public class Arithematic {

    public static void main(String[] args) {
        //for integer values
        int ia = 14, ib = 5;

        int ic = ia / ib;
        int ir = ia % ib;

        System.out.println(ic);
        System.out.println(ir);



        //for float values
        float fa = 14.3f, fb = 3.2f;

        float fc = fa / fb;
        float fr = fa % fb;

        System.out.println(fc);
        System.out.println(fr);



        //for different data types
        byte ba = 10;
        short sb = 15;
        int sum1 = ba + sb;

        float fa2 = 12.5f;
        long lb = 1231;
        float prod1 = fa2 * lb;

        float fa3 = 12.5f;
        double db = 123;
        double prod2 = fa3 * db;

        char ca = 40;
        int ib2 = 30;
        int diff = ca - ib2;
        System.out.println(diff);


        System.out.println((10 + 20) / 2);
        System.out.println(10 / (2 * 5));
    }
    
}
