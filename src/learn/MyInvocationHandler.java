package learn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before------");
        Object result = method.invoke(target,args);
        System.out.println("after--------");
        return result;
    }
    public Object getProxy(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader,interfaces,this);
    }
    public static void main(String[] args){
        Person student = new Student();
        MyInvocationHandler handler = new MyInvocationHandler(student);
        Person studentProxy = (Person)handler.getProxy();
        studentProxy.run();

    }
}
