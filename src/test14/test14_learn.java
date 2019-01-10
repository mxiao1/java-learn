package test14;

import java.util.ArrayList;
import java.util.List;

class CountInteger{
    private static  long counter;
    private final long id = counter++;
    public String toString(){ return Long.toString(id); }
}
public class test14_learn<T>{
    private Class<T> type;
    public test14_learn(Class<T> type){ this.type=type; }
    public List<T> create(int nElements){
        List<T> result = new ArrayList<T>();
        try{
            for(int i=0; i<nElements;i++)
                result.add(type.newInstance());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }
    public static void main(String[] args){
        test14_learn<CountInteger> fl = new test14_learn<CountInteger>(CountInteger.class);
        System.out.println(fl.create(15));
    }
}
