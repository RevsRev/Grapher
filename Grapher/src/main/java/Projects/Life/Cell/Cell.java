package Projects.Life.Cell;

import Projects.Life.Actions.AbstractAction;
import Projects.Life.Actions.ActionMovement;
import Projects.Life.Brain.Brain;
import Projects.Life.ProducerConsumer.EnergyConsumerI;
import Projects.Life.Store.EnergyStore;
import Projects.Life.Senses.AbstractSense;
import Projects.Life.Senses.SenseVision;
import Projects.Life.UpdatableI;

import java.util.HashSet;
import java.util.Iterator;

public class Cell implements EnergyConsumerI, UpdatableI
{
    private int x = 0;
    private int y = 0;
    private int cachedRadius = -1; //area of Call proportional to its energy store, so radius goes like square root.

    private final Brain brain;
    private final HashSet<AbstractAction> actions;
    private final HashSet<AbstractSense> senses;

    private final EnergyStore energyStore;

    private float cachedEnergyConsumption = -1.0f;

    /*
     * Initialisation
     */

    public Cell(CellParms parms)
    {
        brain = parms.get(Brain.class);
        energyStore = parms.get(EnergyStore.class);

        actions = new HashSet<AbstractAction>();
        senses = new HashSet<AbstractSense>();

        initActions(parms);
        initSenses(parms);
    }

    private void initActions(CellParms parms)
    {
        if (parms.getMovement() != -1.0f)
        {
            actions.add(parms.get(ActionMovement.class));
        }
    }

    private void initSenses(CellParms parms)
    {
        if (parms.getVision() != -1.0f)
        {
            senses.add(parms.get(SenseVision.class));
        }
    }

    /*
     * Interfaces
     */

    @Override
    public float getEnergyConsumption()
    {
        if (cachedEnergyConsumption == -1.0f)
        {
            cachedEnergyConsumption = calcEnergyConsumption();
        }
        return cachedEnergyConsumption;
    }

    @Override
    public void update()
    {

    }

    /*
     * Everything else
     */
    private float calcEnergyConsumption()
    {
        float retval = 0.0f;

        retval = brain != null ? retval + brain.getEnergyConsumption() : retval;

        Iterator<AbstractAction> itActions = actions.iterator();
        while (itActions.hasNext())
        {
            retval += itActions.next().getEnergyConsumption();
        }

        Iterator<AbstractSense> itSenses = senses.iterator();
        while (itSenses.hasNext())
        {
            retval += itSenses.next().getEnergyConsumption();
        }

        return retval;
    }

    private int getCachedRadius()
    {
        if (cachedRadius == -1)
        {
            cachedRadius = energyStore == null ? 0 : (int)Math.sqrt(energyStore.getStore());
        }
        return cachedRadius;
    }
}
