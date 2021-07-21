package ArrayExercise;

public class AcceptAndReturnArrayFromMethod {
    public static void main(String[] args) {

        int[] a = {2,1};
        for(int x:a){
            System.out.println(x);
        }

        Person p = new Person();
        String[] names = p.GetNames();

        for(String name:names){
            System.out.println(name);
        }

        String[] browsers = {"chrome","edge"};
        p.SetBrowsersName(browsers);
    }
}


class Person{
    //method returning string array
    public String[] GetNames(){
        String[] names = {"selenium","appium","chrome","opera","edge","safari"};
        return names;
    }

    public int[] GetDimension(){
        //int[] length_width = {1024,786};
        int[] length_width = new int[2];
        length_width[0] = 1024;
        length_width[1] = 786;

        return length_width;
    }

    //method parameter as array
    public void SetBrowsersName(String[] browserNames){

    }

    public void SetRoolNumber(String[] studentNames, int rollNumber){

    }
}