public class ReturnExecutor {
    public static void main(String args[]){
        ReturnExercise re = new ReturnExercise();
        String userName = re.getUserName();
        System.out.println("From main method : username is : "+userName);

        String password = re.getPassword();
        System.out.println("From main method : Password is : "+password);
    }
}

class ReturnExercise{
    //should be meaningful
    public String getUserName(){
        String userName = "xyz@gmail.com";
        System.out.println("Inside method : "+ userName);
        return userName;
    }

    public String getPassword(){
        String password = "123xyz!@#";
        return password;
    }
}
