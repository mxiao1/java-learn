package test18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UsinRandomAccessFile {
    static String file = "rtest.dat";
    static void display() throws IOException{
        RandomAccessFile rf = new RandomAccessFile(file,"r");
        for(int i=0;i<7;i++)
            System.out.println("value" + i +": "+rf.readDouble());
        System.out.println(rf.readUTF());
        rf.close();
    }
    public static void main(String[] args)throws IOException{
        RandomAccessFile rf = new RandomAccessFile(file,"rw");
        for(int i=0;i<7;i++)
            rf.writeDouble(i*1.414);
        rf.writeUTF("xiao qing guang");
        rf.close();
        display();
        rf = new RandomAccessFile(file,"rw");
        rf.seek(5*8);
        rf.writeDouble(47.001);
        rf.close();
        display();
    }
}

