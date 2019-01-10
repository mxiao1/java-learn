package learn;
interface Interface{
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements Interface{
    public void doSomething(){}
    public void somethingElse(String arg){
        System.out.println("something "+ arg);
    }
}
class SimpleProxy implements  Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }
    public void doSomething(){
        System.out.println("SimpleProxy doSoemthing");
        proxied.doSomething();
    }
    public void somethingElse(String arg){
        System.out.println("SimpleProxy somethingElse " + arg);
    }
}
public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("xiao");
    }
    public static void main(String[] args){
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
