package StaticKeywordExercise;

public class SaticClassExamle {
    static class NestedClass{
        //method inside static class
        public void display(){
            System.out.println("I display from static class");
        }
    }


    //Non-static class
    public static void main(String[] args) {
        SaticClassExamle.NestedClass obj = new NestedClass();
        obj.display();
    }
}
