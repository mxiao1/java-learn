package learn;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class learn2 {
    public static void main(String[] args){
        Integer i = 4;
        ArrayList list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("xiao");
        //利用反射向String类型的集合加入int类型数据;
        try {
            Method m = ArrayList.class.getDeclaredMethod("add", new Class[]{Object.class});
            m.invoke(list2, i);//方法如果没有返回值,返回null,有就返回object类型在强制类型转换为原函数的返回值类型
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        System.out.println(list2);
        System.out.println(list2.get(1));//调用get()会自动启动类型转换 抛出classcastException
    }
}
