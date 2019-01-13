package test18;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test18_19 {
    public static void main(String[] args){
        try {
            Map<Byte,Integer> bytecount = new HashMap<Byte,Integer>();
            byte[] ll = BinaryFile.read("./out/production/learn/learn/Animal.class");
            for(Byte b:ll){
                Integer m = bytecount.get(b);
                bytecount.put(b,m==null ?1:m+1);
            }
            System.out.println(bytecount);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
