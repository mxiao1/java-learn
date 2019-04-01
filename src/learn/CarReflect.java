package learn;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CarReflect {
    public static void main(String[] args){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
//        try{
////            Class clazz = loader.loadClass("learn.Car");
////            Car car = (Car) clazz.newInstance();
////
////            Field colorfield = clazz.getDeclaredField("color");
////            colorfield.setAccessible(true);
////            colorfield.set(car,"好");
////            Method driveMethod = clazz.getDeclaredMethod("drive",(Class[])null);
////            driveMethod.setAccessible(true);
////            driveMethod.invoke(car,(Object[])null);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try{
            Class carClass = Car.class;
            Car car = (Car)carClass.newInstance();
            Field field = carClass.getDeclaredField("color");
            field.setAccessible(true);
            field.set(car,"123");
            Method method = carClass.getDeclaredMethod("drive",String.class);
            method.setAccessible(true);
            method.invoke(car,"567");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
