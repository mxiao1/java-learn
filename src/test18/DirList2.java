package test18;
import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {
    public static FilenameFilter filter(final String regex){
        return new FilenameFilter(){
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir,String name){
                return pattern.matcher(name).matches();
            }
        };
    }
    public static void main(String[] args){
        File file = new File(".");
        String[] list;
        if (args.length==0)
            list = file.list();
        else
            list = file.list(filter(args[0]));
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem:list)
            System.out.println(dirItem);
    }
}
