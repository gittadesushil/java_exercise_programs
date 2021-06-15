package Looping;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i =0;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println("First for loop: "+ i );
            System.out.println("First for loop: "+ i );
            System.out.println("First for loop: "+ i );
            System.out.println("First for loop: "+ i );
            System.out.println("First for loop: "+ i );
            System.out.println("First for loop: "+ i );
            System.out.println("First for loop: "+ i );
            System.out.println("First for loop: "+ i );
        }

        for(int i =0;i<=5;i++){
            if(i==3){
                System.out.println("Second for loop: "+ i );
                continue;
            }
            System.out.println("First for loop: "+ i );
        }
    }
}
