package Factory;
import Classes.*;
import Enums.*;

public class ApplianceFactory {
    public static Stove createAppliance(ApplianceType applianceType){

        if (applianceType == ApplianceType.ELECTRIC) {
            return new Stove(new ElectricCooking());  // Create stove with cooking method
        }
        if (applianceType == ApplianceType.GAS) {
            return new Stove(new GasCooking());  // Create stove with cooking method
        }
        if (applianceType == ApplianceType.SMART) {
            return new Stove(new SmartCooking());  // Create stove with cooking method
        }

        throw new IllegalArgumentException("not supported type");
    }
}
