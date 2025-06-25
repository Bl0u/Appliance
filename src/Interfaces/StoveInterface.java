package Interfaces;


public interface StoveInterface {

    // ------Behavior------
    void increaseHeat() ;
    void decreaseHeat() ;
    // ------Setters------
    void setHeat(int heat);
    void turnOff();
    void turnOn();
    void setCookingMethodInterface(CookingMethodInterface cookingMethodInterface) ;
    // ------Getters------
    int getHeat() ;
    CookingMethodInterface getCookingMethodInterface() ;
}
