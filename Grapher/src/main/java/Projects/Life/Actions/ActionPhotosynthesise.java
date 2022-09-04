package Projects.Life.Actions;

import Projects.Life.ProducerConsumer.EnergyProducerI;
import Projects.Life.ProducerConsumer.FoodProducerI;
import Projects.Life.ProducerConsumer.GasConsumerI;
import Projects.Life.ProducerConsumer.WaterConsumerI;

public class ActionPhotosynthesise extends AbstractAction implements FoodProducerI, GasConsumerI, WaterConsumerI
{
    private final float energyConsumption;

    public ActionPhotosynthesise(float energyConsumption)
    {
        this.energyConsumption = energyConsumption;
    }
    @Override
    public float getEnergyConsumption()
    {
        return energyConsumption;
    }

    @Override
    public float getFoodProduction()
    {
        return 0;
    }

    @Override
    public int getWaterConsumption()
    {
        return 0;
    }

    @Override
    public int getOxygenConsumption()
    {
        return 0;
    }

    @Override
    public int getCo2Consumption()
    {
        return 0;
    }
}
