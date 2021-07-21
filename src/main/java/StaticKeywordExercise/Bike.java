package StaticKeywordExercise;

public class Bike {
    static int reading =0;

    static{
        System.out.println("Remove from stand");
        System.out.println("Check enough fuel");
    }

    public void Start(){
        System.out.println("journey satarted ............");

    }

    public void RemoveKey(){

    }

    public void ChangeGear(){

    }

    public void StartMeter(){
        System.out.println("Current bike reading: "+reading + "km");
        reading++;
    }
}
