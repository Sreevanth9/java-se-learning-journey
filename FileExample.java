package fileexample;

import java.io.*;

public class FileExample {

    static void writeByteByByte(byte[] b, FileOutputStream fos) throws Exception
    {
        for(byte x : b)
            fos.write(x);
    }

    static void writePartial(byte[] b, FileOutputStream fos, int start) throws Exception
    {
        fos.write(b, start, b.length-start);
    }

    public static void main(String[] args) throws Exception
    {
        
        try(FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.txt");)
        {
        
        String str="earn Java Programming.";
        
        byte b[]=str.getBytes();
        
        fos.write(b);
        writeByteByByte(b, fos);
        writePartial(b, fos, 6);
        
        //fos.close();
        
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
    
}
