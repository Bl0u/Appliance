package Classes;

import Interfaces.CookingMethodInterface;

public class ElectricCooking implements CookingMethodInterface {
    public ElectricCooking(){
        Logger.logOperation("Electric Cooking established");
    }

    @Override
    public void onTempChange(int temp){
        Logger.logOperation("Electric heating intensity increased for " + temp + "°C");    }

    @Override
    public void onStateChange(boolean state){
        Logger.logOperation("Electric Cooking method is " + (state ? "ON" : "OFF"));

    }
}
