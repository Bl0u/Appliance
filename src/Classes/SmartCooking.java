package Classes;

import Interfaces.CookingMethodInterface;

public class SmartCooking implements CookingMethodInterface {
    private CookingMethodInterface gasCooking = new GasCooking();
    private CookingMethodInterface electricCooking = new ElectricCooking();
    private CookingMethodInterface currentMethod;

    public SmartCooking(){
        Logger.logOperation("Smart Cooking established");
    }


    @Override
    public void onTempChange(int temp) {
        // Switch internal method
        if (temp >= 150 && currentMethod != gasCooking) {
            Logger.logOperation("Switching to Gas internally, temp = " + temp);
            currentMethod = gasCooking;
        } else if (temp < 150 && currentMethod != electricCooking) {
            Logger.logOperation("Switching to Electric internally, temp = " + temp);
            currentMethod = electricCooking;
        }

        // Delegate to current method
        currentMethod.onTempChange(temp);
    }

    @Override
    public void onStateChange(boolean state){
        Logger.logOperation("Smart Cooking method is " + (state ? "ON" : "OFF"));
    }
}
