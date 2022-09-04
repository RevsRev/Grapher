package Projects.Life.Brain;

import Projects.Life.Cell.CellProperty;
import Projects.Life.ProducerConsumer.EnergyConsumerI;

public class Brain implements EnergyConsumerI, CellProperty
{
    private final float brainEnergy;

    public Brain(float brainEnergy)
    {
        this.brainEnergy = brainEnergy;
    }

    @Override
    public float getEnergyConsumption()
    {
        return brainEnergy;
    }
}
