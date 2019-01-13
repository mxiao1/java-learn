package test21;

public class Test21_2 implements Runnable {
    private static long count;
    private final long id = count++;
    public Test21_2(){
        System.out.println("新建对象"+id);
    }
    public void run(){
        for (int i=0;i<3;i++)
            System.out.println("run"+id);
        close();
    }
    public static void close(){
        System.out.println("结束");
    }
    public static void main(String[] args){
        for (int i=0;i<5;i++) {
            new Thread(new Test21_2()).start();
        }
        System.out.println("oooooo");
    }
}
