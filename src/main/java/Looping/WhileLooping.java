package Looping;

public class WhileLooping {
    public static void main(String[] args){
        System.out.println("Starting of while loop ......");

        int count = 0;
        while(count < 25){
            count = count + 5;
            System.out.println("Value of count = "+ count);
        }
        System.out.println("outside of while loop");
    }
}
