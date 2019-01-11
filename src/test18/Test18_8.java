package test18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Test18_8{
    public static List<String> read(String filename)throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        List<String> list = new LinkedList<String>();
        while((s=in.readLine())!=null){

            list.add(s.toUpperCase());
        }
        in.close();
        return list;
    }
    public static void main(String[] args)throws IOException{
        String filename1=null;
        if (args.length==1)
            filename1 = args[0];
        System.out.println(read(filename1));
    }
}
