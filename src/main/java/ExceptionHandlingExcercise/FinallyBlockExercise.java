package ExceptionHandlingExcercise;

public class FinallyBlockExercise {
    public static void main(String[] args) {
        try{
           //int x = 1 /0;
            System.out.println("Inside try block");
            String arr[] = {"abc","pqr"};
            String a = arr[3];
            System.out.println(a);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Inside catch block");
        }finally {
            System.out.println("Inside finally block");
        }
    }
}
