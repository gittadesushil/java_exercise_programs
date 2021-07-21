package MethodOverloadingExercise;

public class HomePage {
    public void Search(String cityName){
        //driver.findElement(By.id).sendText(cityName)
    }

    public void Search(String cityName, boolean isDropDown){
        if(isDropDown == true){
            //Select dropdown = new Select();
            //dropdown.select(cityName, )
        }
    }
}
