package ExceptionHandlingExcercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemoTwo {
    public static void main(String[] args) throws Exception{
//        try{
//            File file = new File("not_available_file.txt");
//            FileInputStream s = new FileInputStream(file);
//            System.out.println("statement ");
//            System.out.println("statement ");
//            System.out.println("statement ");
//            System.out.println("statement ");
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }

        File file = new File("not_available_file.txt");
        FileInputStream s = new FileInputStream(file);
    }
}
