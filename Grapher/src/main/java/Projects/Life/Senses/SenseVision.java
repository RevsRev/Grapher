package Projects.Life.Senses;

import Projects.Life.Cell.Cell;
import Projects.Life.World.World;
import util.Pair;

import java.util.HashSet;

public class SenseVision extends AbstractSense
{
    private final float energyCost;
    public SenseVision(Cell cell, float energyCost)
    {
        super(cell);
        this.energyCost = energyCost;
    }

    public HashSet<Pair<Pair<Integer, Integer>, Integer>> see(World world)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public float getEnergyConsumption()
    {
        return energyCost;
    }
}
