package learn;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.*;
import static learn.Print.*;
class Animal{
	private static long count;
	private final long id = count++;
	static{
		System.out.println("xiao");
	}
	Animal(){
		System.out.println("1" + id);
	}
//	public String toString(){ return Long.toString(count);}
}//要获取类的信息,首先要获得类的Class对象,Class对象可以对类进行一切操作
public class He{
	public static void printClassMessage(Object obj){
		Class c = obj.getClass();
		System.out.println("类的名称是: "+c.getSimpleName());
		/*
		Method类,方法的对象
		一个成员方法就是一个Method对象
		getMethods()方法获取的是所有的public的函数,包括从父类继承而来的
		getDeclaredMethods()获取的是该类自己声明的方法,不问访问权限
		 */
		Method[] ms = c.getMethods();
		for(int i=0;i<ms.length;i++){
			//得到方法的返回值类型的Class对象
			Class returnType = ms[i].getReturnType();
			System.out.println(returnType.getName()+"  ");
			//得到方法的名称
			System.out.println(ms[i].getName()+"(");
			//获取的参数类型---->得到的是参数列表的类型的类Class对象
			Class[] paraTypes = ms[i].getParameterTypes();
			for(Class class1: paraTypes)
				System.out.println(class1.getName()+".");
			System.out.println(")");
		}
		/*
		成员变量也是对象,是java.lang.reflect.Field类的对象
		Field封装了关于成员变量的操作
		getFields()获取所有public de 成员变量
		getDeclaredFields()获取该类自己声明的成员变量
		 */
		Field[] fs = c.getFields();
		for(int i=0;i<fs.length;i++){
			Class fieldType = fs[i].getType();
			String typename = fieldType.getName();
			String fieldname = fs[i].getName();
			System.out.println(typename+" " + fieldname);
		}
		/*
		构造函数也是对象昂

		java.lang.Constructor中封装了构造函数的信息
		getConstructor()方法获取所有的public的狗最早函数
		getDeclaredConstructors()得到所有的声明构造函数
		 */
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor: cs){
			System.out.println(constructor.getName()+"(");
			Class[] paraTypes = constructor.getParameterTypes();
			for(Class class1: paraTypes){

				System.out.println(class1.getName() +".");
			}
			System.out.println(")");
		}
	}
	public static void main(String[] args){
		try {
			Class c1 = Class.forName("learn.Animal");//加载类,构造静态field,不会初始化类
			printClassMessage(c1.newInstance());
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (IllegalAccessException e){
			e.printStackTrace();
		}catch (InstantiationException e){
			e.printStackTrace();
		}
	}
}