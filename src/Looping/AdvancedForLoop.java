package Looping;

public class AdvancedForLoop {
    public static void main(String[] args) {
        String months[] = {"Jan","Feb","March","April","May", "Jun", "July"};


        //we need print content of array on console. print month line by line
//        for(int i=0; i<10; i++){
//            System.out.println(months[i]);
//        }

        System.out.println("Second for loop.............................");
        for(int i=0; i<months.length; i++){
            System.out.println(months[i]);
        }

        System.out.println("Advanced for loop.............................");
        //Advanced for loop
        for(String month : months){
            System.out.println(month);
        }



    }
}
