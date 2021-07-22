package ExceptionHandlingExcercise;

import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int x = 1/0;
            //file operation
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("The value of x is : ");



//
//        try{
//            //code
//        }catch (catch the exception){
//            //code
//        }
    }
}
