package learn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandle implements  InvocationHandler{
    private Object proxied;
    public DynamicProxyHandle(Object proxied){
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
        System.out.println("*** proxy: "+proxy.getClass() + ", method: "+ method+", args: "+ args);
        if (args != null)
            for(Object arg: args)
                System.out.println(" "+arg);
        return method.invoke(proxied, args);
    }
}
public class SimpleDynamicProxy {
    public static void consume(Interface iface){
        iface.doSomething();
        iface.somethingElse("xiao");
    }
    public static void main(String[] args){
        RealObject real = new RealObject();
        consume(real);
        //insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class},
        new DynamicProxyHandle(real));
    }


}
