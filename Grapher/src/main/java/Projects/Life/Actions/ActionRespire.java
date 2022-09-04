package Projects.Life.Actions;

import Projects.Life.Cell.Cell;
import Projects.Life.ProducerConsumer.*;
import Projects.Life.UniversalConstants.UniversalConstants;
import lombok.Getter;

public class ActionRespire extends AbstractAction implements    EnergyProducerI,
                                                                FoodConsumerI,
                                                                GasConsumerI,
                                                                GasProducerI,
        WaterProducerI
{
    @Getter
    private final float energyConsumption;
    public ActionRespire(Cell cell, float energyConsumption)
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
    public float getEnergyProduction()
    {
        return UniversalConstants.the().getRespirationEnergyProduction();
    }

    @Override
    public float getFoodConsumption()
    {
        return UniversalConstants.the().getRespirationFoodConsumption();
    }

    @Override
    public int getOxygenProduction()
    {
        return 0;
    }

    @Override
    public int getC02Production()
    {
        return UniversalConstants.the().getRespirationCo2Production();
    }

    @Override
    public int getOxygenConsumption()
    {
        return UniversalConstants.the().getRespirationOxygenConsumption();
    }

    @Override
    public int getCo2Consumption()
    {
        return 0;
    }

    @Override
    public int getWaterProduction()
    {
        return UniversalConstants.the().getRespirationWaterProduction();
    }
}
