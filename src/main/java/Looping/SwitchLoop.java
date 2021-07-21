package Looping;
import java.util.Scanner;

public class SwitchLoop {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide your choice: ");
//        int userInput = sc.nextInt();

        int number = 2;
        String browser;

        switch (number){
            case 1:
                browser = "chrome";
                System.out.println(browser);
                break;
            case 2:
                browser = "mozilla";
                System.out.println(browser);
                break;
            case 3:
                browser = "Internet explorer";
                System.out.println(browser);
                break;
            default:
                browser = "Sorry i could not find the browser";
                System.out.println(browser);
        }

    }
}
