class SpecialMethodDefinition{
    //Constructor
    // 0 zero parameter constructor


    // 1 parameter constructor
    public SpecialMethodDefinition(String name){
        System.out.println("I am from 1 parameter constructor : "+ name);
    }

    //2 prameter constructor
    public SpecialMethodDefinition(int a, float b){
        System.out.println("Value of a= "+a+" Value of b="+b);
    }

}

public class SpecialMethod {

    public SpecialMethod(){
        System.out.println("Initialization");
    }

    public static void main(String[] args){
        //Object creation
        SpecialMethod sm = new SpecialMethod();

        SpecialMethodDefinition smd1 = new SpecialMethodDefinition("1param");    // first object
        SpecialMethodDefinition smd2 = new SpecialMethodDefinition(null);        // second object
        SpecialMethodDefinition smd3 = new SpecialMethodDefinition("shrusti");        // second object
        SpecialMethodDefinition smd4 = new SpecialMethodDefinition("ankita");        // second object
        SpecialMethodDefinition smd5 = new SpecialMethodDefinition("vaishanvi");        // second object
        SpecialMethodDefinition smd6 = new SpecialMethodDefinition("pratiksha");        // second object
        SpecialMethodDefinition smd7 = new SpecialMethodDefinition("prathmesh");        // second object
        SpecialMethodDefinition smd8 = new SpecialMethodDefinition("mayuri");        // second object


        SpecialMethodDefinition smd9 = new SpecialMethodDefinition(1,2);
    }
}
