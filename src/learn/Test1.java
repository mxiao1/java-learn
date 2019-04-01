package learn;

public class Test1 {
    public Test1(){

    }
    public Test1(int i,String j){
        System.out.println("1");

    }
    public Test1(String i,int j){
        System.out.println("2");

    }
    public static void main(String[] args){
        Test1 test1 = new Test1(1,"xiao");
        Test1 test11 = new Test1("xiao",2);
    }
}
