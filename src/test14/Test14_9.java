package test14;
//修改前一个方法,可以打印每个类中的域的相关信息;
class E{
    private int i;
}
class F extends E{
    protected String s;
}
class G extends F{
    public double m;
}
public class Test14_9 {
    static void printTypeInfo(Object o){
        Object[] fields = o.getClass().getDeclaredFields();
        if (fields.length == 0)
            System.out.println("no fields");
        if (fields.length != 0){
            for (Object obj: fields){
                System.out.println("have field" + obj);
            }
        }
        Class c = o.getClass().getSuperclass();
        if(c!=null){
            System.out.println(o.getClass().getSuperclass());
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
        G g = new G();
        printTypeInfo(g);
    }
}
