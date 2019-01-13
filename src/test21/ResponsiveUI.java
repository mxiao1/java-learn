package test21;

import java.io.IOException;

public class ResponsiveUI extends Thread {
    private static volatile double d =1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }
    public void run(){
        while (true){
            d = d + (Math.PI + Math.E ) / d;
        }
    }
    public static  void main(String[] args){
        new ResponsiveUI();
        try{
        System.in.read();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(d);
    }
}
