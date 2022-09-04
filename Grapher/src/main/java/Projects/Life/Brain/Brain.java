package Projects.Life.Brain;

import Projects.Life.Cell.Cell;
import Projects.Life.Cell.CellProperty;
import Projects.Life.ProducerConsumer.EnergyConsumerI;

public class Brain extends CellProperty implements EnergyConsumerI
{
    private final float brainEnergy;

    public Brain(Cell cell, float brainEnergy)
    {
        super(cell);
        this.brainEnergy = brainEnergy;
    }

    @Override
    public float getEnergyConsumption()
    {
        return brainEnergy;
    }
}
