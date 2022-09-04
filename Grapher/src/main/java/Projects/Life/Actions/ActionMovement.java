package Projects.Life.Actions;

import Projects.Life.Cell.Cell;

public class ActionMovement extends AbstractAction
{
    private final float movementEnergy;

    public ActionMovement(Cell cell, float movementEnergy)
    {
        super(cell);
        this.movementEnergy = movementEnergy;
    }

    @Override
    public float getEnergyConsumption()
    {
        return movementEnergy;
    }

    @Override
    public boolean doAction()
    {
        //TODO - Implement
        throw new UnsupportedOperationException();
        //getCell().getBrain().getDecision()...
    }
}
