package Projects.Life.Actions;

public class ActionMovement extends AbstractAction
{
    private final float movementEnergy;

    public ActionMovement(float movementEnergy)
    {
        this.movementEnergy = movementEnergy;
    }

    @Override
    public float getEnergyConsumption()
    {
        return movementEnergy;
    }
}
