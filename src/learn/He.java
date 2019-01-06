package learn;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import java.util.logging.*;
import static learn.Print.*;

public class He{
	 public static void main(String [] args){  
	        System.out.println(new B().getValue());  
	    }  
static class A{
	        protected int value;  
	        public A(int v) {  
	            setValue(v);  
	        }  
	        public void setValue(int value){  
	            this.value = value;  
	        }  
	        public int getValue(){  
	            try{
	                value++;  
	                 System.out.print(value);  
	            } catch(Exception e){  
	                System.out.println(e.toString());  
	            } finally {  
	                this.setValue(value);
	                System.out.println(value);  
	            }  
	            return value;
	        }  
	    }  
static class B extends A{  
	        public B() {  
	            super(5);  
	            setValue(getValue() - 3);  
	        }  
	        public void setValue(int value){  
	            super.setValue(2 * value);  
	        }  
	    }  
}
class goood{}
