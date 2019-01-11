package test18;

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicOutput.out";
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(".classpath")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int linecount = 1;
        String s;
        while((s=in.readLine())!=null){
            out.println(linecount++ + ":"+s);

        }
        in.close();
        out.close();
        System.out.println(BufferedInputFile.read(file));

    }
}
