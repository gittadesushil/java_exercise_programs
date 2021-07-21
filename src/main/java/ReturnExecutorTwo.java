class ReturnExecutorTwo {
    public static void main(String[] args) {
        ReturnExerciseTwo returnExerciseTwo = new ReturnExerciseTwo();

        int addition = returnExerciseTwo.Addition(10, 2);
        System.out.println("Addition is : " + addition);
    }
}

class ReturnExerciseTwo {
    //Two parameter method

    public int Addition(int a, int b) {
        int sum = a + b; //definition
        return sum + 100;
    }
}
