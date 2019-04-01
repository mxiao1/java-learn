package learn;

class X{
    Y y =new Y();
    public X(){
        System.out.println("x");
    }
}
class Y{
    public Y(){
        System.out.println("y");
    }
}
public class Test2 extends X{
    Y y = new Y();
    public Test2(){
        System.out.println("z");
    }
    public static void main(String[] args){
        new Test2();
    }

}
