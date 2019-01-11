package test18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test18_7 {
    public static List<String> read(String filename)throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        List<String> list = new LinkedList<String>();
        while((s=in.readLine())!=null) {
            list.add(s + "\n");
        }
        in.close();;
        return list;
    }
    public static void main(String[] args)throws IOException{
        List<String> reads = read(".classpath");
        for(ListIterator<String> it=reads.listIterator(reads.size());it.hasPrevious();)
            System.out.println(it.previous());

    }
}
