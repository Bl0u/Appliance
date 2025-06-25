package Classes;

import Interfaces.CookingMethodInterface;

public class GasCooking implements CookingMethodInterface {

    public GasCooking(){
        Logger.logOperation("Gas Cooking established");
    }

    @Override
    public void onTempChange(int temp){
            Logger.logOperation("Gas flame intensity increased for " + temp + "°C");
    }

    @Override
    public void onStateChange(boolean state){
        Logger.logOperation("Gas Cooking method is " + (state ? "ON" : "OFF"));

    }

}
