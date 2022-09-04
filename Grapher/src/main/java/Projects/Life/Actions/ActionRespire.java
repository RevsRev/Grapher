package Projects.Life.Actions;

import Projects.Life.ProducerConsumer.EnergyProducerI;
import Projects.Life.ProducerConsumer.FoodConsumerI;
import lombok.Getter;

public class ActionRespire extends AbstractAction implements EnergyProducerI, FoodConsumerI
{
    @Getter
    private final float energyConsumption;
    public ActionRespire(float energyConsumption)
    {
        this.energyConsumption = energyConsumption;
    }
    @Override
    public float getEnergyConsumption()
    {
        return energyConsumption;
    }

    @Override
    public float getEnergyProduction()
    {
        return 0;
    }

    @Override
    public float getFoodConsumption()
    {
        return 0;
    }
}
