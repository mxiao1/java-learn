package test14;
//判断char数组是否是一个对象;
public class Test14_10 {
    public static void main(String[] args){
        char[] c = new char[7];
        System.out.println("c superclass is : " + c.getClass().getSuperclass());
        System.out.println("c is instanceof of  :" + (c instanceof Object));
    }
}
