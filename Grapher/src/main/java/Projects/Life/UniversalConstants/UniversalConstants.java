package Projects.Life.UniversalConstants;

import lombok.Getter;

public class UniversalConstants
{

    public static final int WORLD_OXYGEN = 20000;
    public static final int WORLD_CO2 = 80000;
    public static final int WORLD_GROUND_WATER = 100000;
    public static final int WORLD_LIGHT = 100;

    /*
     *  ***EQUATIONS***
     *
     * Photosynthesis:      Light + Co2 + Water -> Food + Oxygen
     * Respiration          Food + Oxygen -> Energy + CO2 + Water
     *
     * It is important that all quantities except for light and energy remain balanced, as they represent physical matter which must remain conserved in this system.
     * Ultimately, we should consume light to produce energy, which is then itself consumed to do various tasks. Everything else should stay constant within the world.
     * For this reason, it is important to release any stored food back in the form of C02 when an organism dies.
     */
    private static UniversalConstants theInstance = null;

    //photosynthesis
    @Getter private int photosynthesisWaterConsumption = 1;
    @Getter private int photosynthesisCo2Consumption = 1;
    @Getter private int photosynthesisLightConsumption = 1;
    @Getter private float photosynthesisFoodProduction = 1;
    @Getter private int photosyntheisOxygenProduction = 1;

    //respiration
    @Getter private float RespirationEnergyProduction = 1;

    public static UniversalConstants the()
    {
        if (theInstance == null)
        {
            synchronized (theInstance)
            {
                if (theInstance == null)
                {
                    theInstance = new UniversalConstants();
                }
            }
        }
        return theInstance;
    }

    /*
     * Things must remain balanced...
     */
    public int getRespirationOxygenConsumption()
    {
        return photosyntheisOxygenProduction;
    }
    public float getRespirationFoodConsumption()
    {
        return photosynthesisFoodProduction;
    }
    public int getRespirationCo2Production()
    {
        return photosynthesisCo2Consumption;
    }
    public int getRespirationWaterProduction()
    {
        return photosynthesisWaterConsumption;
    }
}
