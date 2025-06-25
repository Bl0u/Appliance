
import Classes.* ;
import Enums.ApplianceType;
import Factory.ApplianceFactory;

public class Main {
    public static void main(String[] args) {
//        Stove stove = ApplianceFactory.createAppliance(ApplianceType.SMART) ;
//        stove.increaseHeat();
//        stove.increaseHeat();
//        stove.increaseHeat();
//        stove.increaseHeat();
//        stove.increaseHeat();
//        stove.increaseHeat();
//        stove.increaseHeat();
        Stove stove = ApplianceFactory.createAppliance(ApplianceType.GAS) ;
        stove.increaseHeat();
        stove.increaseHeat();
        stove.decreaseHeat();
        stove.setCookingMethodInterface(new ElectricCooking());
        stove.increaseHeat();
        stove.increaseHeat();

    }
}