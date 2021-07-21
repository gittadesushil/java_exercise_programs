package InterfaceExercise;

public class CoffeeMakeExecutor {
    public static void main(String[] args) {
        CoffeeMakerPersonSushil sushil = new CoffeeMakerPersonSushil();
        sushil.ReadyWithCoffePowerder();
        sushil.ReadyWithMilk();
        sushil.TurnOnStove();
        sushil.PourWater();
        sushil.ObserveColor();
        sushil.TrunOffGas();

        Latte l = new Latte();
    }
}
