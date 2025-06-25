package Classes;
import Interfaces.CookingMethodInterface;
import Interfaces.StoveInterface;

public class Stove implements StoveInterface {
    private boolean isOn = false ;
    private int heat = 0 ;
    private CookingMethodInterface cookingMethodInterface;


    public Stove(CookingMethodInterface cookingMethodInterface) {
        this.cookingMethodInterface = cookingMethodInterface;
        Logger.logOperation("Appliance established");

    }

    @Override
    public void increaseHeat() {
        int newHeat = Math.min(getHeat() + 25, 300) ;
        if (cookingMethodInterface != null) {
            cookingMethodInterface.onTempChange(newHeat);
        }
        setHeat(newHeat);
    }

    @Override
    public void decreaseHeat() {
        int newHeat = Math.max(getHeat() - 25, 0) ;
        if (cookingMethodInterface != null) {
            cookingMethodInterface.onTempChange(newHeat);
        }
        setHeat(newHeat);
    }

    @Override
    public int getHeat() {
        return this.heat;
    }

    public CookingMethodInterface getCookingMethodInterface() {
        return this.cookingMethodInterface;
    }

    @Override
    public void setHeat(int heat) {
        this.heat = heat;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        if (cookingMethodInterface != null) {
            cookingMethodInterface.onStateChange(this.isOn);
        }
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        if (cookingMethodInterface != null) {
            cookingMethodInterface.onStateChange(this.isOn);
        }
    }

    public void setCookingMethodInterface(CookingMethodInterface cookingMethodInterface) {
        this.cookingMethodInterface = cookingMethodInterface;
    }
}
