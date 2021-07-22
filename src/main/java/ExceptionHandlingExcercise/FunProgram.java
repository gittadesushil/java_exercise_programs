package ExceptionHandlingExcercise;

public class FunProgram {
    public void ArrayOperation(int index) throws ArrayIndexOutOfBoundsException{
        int arr[] = {1,2,3,4,5};
        int x;
        if(index > arr.length )
        {
            throw new ArrayIndexOutOfBoundsException("Hello! the index is greater than the lenght of the array");
        }else{
            x = arr[index];
        }
        System.out.println("Inside method ArrayOepration : "+x);
    }
}
