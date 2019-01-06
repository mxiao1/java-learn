package test14;
//接受任意对象作为参数,并能够递归打印该对象所在继承体系的所有类;
class A{}
class B extends A{}
class C extends B{}
public class Test14_8 {
    static void printTypeInfo(Object cc){
        Class c = cc.getClass().getSuperclass();
        if(c!=null){
            System.out.println(cc.getClass().getSuperclass());
            try{
                printTypeInfo(c.newInstance());
            }catch (InstantiationException e){
                System.exit(1);
            }catch (IllegalAccessException e){
                System.exit(1);
            }
        }
    }
    public static void main(String[] args){
        C i = new C();
        printTypeInfo(i);
    }
}
