package InterfaceExercise;

public class CoffeeMakerPersonSushil implements ICoffee{


    @Override
    public void ReadyWithCoffePowerder() {
        System.out.println("Use Nescafe");
    }

    @Override
    public void ReadyWithMilk() {
        System.out.println("Cow milk");
    }

    @Override
    public void StartStove() {
        System.out.println("I am using induction");
    }

    @Override
    public void PourWater() {
        System.out.println("500 ml water");
    }

    @Override
    public void TurnOnStove() {
        System.out.println("truning on the stove");
    }

    @Override
    public void PutCoffeePowder() {
        System.out.println("let the water boil");
        System.out.println("then put the coffee powder");
    }

    @Override
    public void ObserveColor() {
        System.out.println("Wait till turns black with bubble");
    }

    @Override
    public void TrunOffGas() {
        System.out.println("Turning off gas");
    }
}
