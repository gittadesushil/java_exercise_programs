package Looping;

public class BreakStatement {
    public static void main(String[] args) {
//        for(int test=0;test<3;test++){
//            System.out.println("Value of i : "+ test);
//
//        }

        for(int i=0;i<100;i++){
            //i=55 break the loop
            if(i==55){
                break;
            }
            System.out.println("Value of i : "+ i);
        }
    }
}
