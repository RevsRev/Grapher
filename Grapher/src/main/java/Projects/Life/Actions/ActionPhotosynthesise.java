package Projects.Life.Actions;

import Projects.Life.Cell.Cell;
import Projects.Life.ProducerConsumer.*;
import Projects.Life.UniversalConstants.UniversalConstants;
import Projects.Life.World.World;

public class ActionPhotosynthesise extends AbstractAction implements    FoodProducerI,
                                                                        GasConsumerI,
                                                                        WaterConsumerI,
                                                                        GasProducerI,
                                                                        LightConsumerI
{
    private final float energyConsumption;

    public ActionPhotosynthesise(Cell cell, float energyConsumption)
    {
        super(cell);
        this.energyConsumption = energyConsumption;
    }
    @Override
    public float getEnergyConsumption()
    {
        return energyConsumption;
    }

    @Override
    //Lots of thread safe fun to think about here...
    public boolean doAction()
    {
        if (!getCell().getFoodStore().addToStore(getFoodProduction()))
        {
            return false;
        }
        if (!getCell().getEnergyStore().removeFromStore(getEnergyConsumption()))
        {
            return false;
        };

        //check that the atmosphere has enough co2!
        //check that we have enough light!
        return true;
    }

    /*
     * Interfaces
     */
    @Override
    public float getFoodProduction()
    {
        return UniversalConstants.the().getPhotosynthesisFoodProduction();
    }

    @Override
    public int getWaterConsumption()
    {
        return UniversalConstants.the().getPhotosynthesisWaterConsumption();
    }

    @Override
    public int getOxygenConsumption()
    {
        return 0;
    }

    @Override
    public int getCo2Consumption()
    {
        return UniversalConstants.the().getPhotosynthesisCo2Consumption();
    }

    @Override
    public int getOxygenProduction()
    {
        return UniversalConstants.the().getPhotosyntheisOxygenProduction();
    }

    @Override
    public int getC02Production()
    {
        return 0;
    }

    @Override
    public int getLightConsumption()
    {
        return UniversalConstants.the().getPhotosynthesisLightConsumption();
    }
}
