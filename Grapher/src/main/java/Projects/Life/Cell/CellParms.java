package Projects.Life.Cell;

import Projects.Life.Actions.ActionMovement;
import Projects.Life.Actions.ActionPhotosynthesise;
import Projects.Life.Actions.ActionRespire;
import Projects.Life.Brain.Brain;
import Projects.Life.Store.EnergyStore;
import Projects.Life.Senses.SenseVision;
import Projects.Life.Store.FoodStore;
import lombok.Getter;

public class CellParms
{
    //actions
    @Getter private float movement = -1.0f;
    @Getter private float photosynthesise = -1.0f;
    @Getter private float respire = -1.0f;

    //senses
    @Getter private float vision = -1.0f;

    //brain
    @Getter private float brain = -1.0f;

    //store
    @Getter private float energyStore = -1.0f;
    @Getter private float foodStore = -1.0f;

    public <T extends CellProperty> T get(Cell cell, Class<? extends CellProperty> clazz)
    {
        T retval;
        //senses
        retval = getVis(cell, clazz);
        if (retval != null) return retval;

        //actions
        retval = getAction(cell, clazz);
        if (retval != null) return retval;

        //brain
        retval = getBr(cell, clazz);
        if (retval != null) return retval;

        //stores
        retval = getStore(cell, clazz);
        if (retval != null) return retval;

        return null;
    }

    private <T extends CellProperty> T getStore(Cell cell, Class<? extends CellProperty> clazz)
    {
        if (EnergyStore.class == clazz
          && getEnergyStore() != -1.0f)
        {
            return (T) new EnergyStore(cell, getEnergyStore());
        }

        if (FoodStore.class == clazz
          && getFoodStore() != -1.0f)
        {
            return (T) new FoodStore(cell, getFoodStore());
        }
        return null;
    }

    private <T extends CellProperty> T getBr(Cell cell, Class<? extends CellProperty> clazz)
    {
        if (Brain.class == clazz
          && getBrain() != -1.0f)
        {
            return (T) new Brain(cell, getBrain());
        }
        return null;
    }

    private <T extends CellProperty> T getVis(Cell cell, Class<? extends CellProperty> clazz)
    {
        if (SenseVision.class == clazz
          && getVision() != -1.0f)
        {
            return (T) new SenseVision(cell, getVision());
        }
        return null;
    }

    private <T extends CellProperty> T getAction(Cell cell, Class<? extends CellProperty> clazz)
    {
        if (ActionMovement.class == clazz
            && getMovement() != -1.0f)
        {
            return (T) new ActionMovement(cell, getMovement());
        }

        if (ActionPhotosynthesise.class == clazz
          && getPhotosynthesise() != -1.0f)
        {
            return (T) new ActionPhotosynthesise(cell, getPhotosynthesise());
        }

        if (ActionRespire.class == clazz
            && getRespire() != -1.0f)
        {
            return (T) new ActionRespire(cell, getRespire());
        }
        return null;
    }
}
