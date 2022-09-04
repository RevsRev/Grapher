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

    public <T extends CellProperty> T get(Class<? extends CellProperty> clazz)
    {
        T retval;
        //senses
        retval = getVis(clazz);
        if (retval != null) return retval;

        //actions
        retval = getAction(clazz);
        if (retval != null) return retval;

        //brain
        retval = getBr(clazz);
        if (retval != null) return retval;

        //stores
        retval = getStore(clazz);
        if (retval != null) return retval;

        return null;
    }

    private <T extends CellProperty> T getStore(Class<? extends CellProperty> clazz)
    {
        if (EnergyStore.class == clazz
          && getEnergyStore() != -1.0f)
        {
            return (T) new EnergyStore(getEnergyStore());
        }

        if (FoodStore.class == clazz
          && getFoodStore() != -1.0f)
        {
            return (T) new FoodStore(getFoodStore());
        }
        return null;
    }

    private <T extends CellProperty> T getBr(Class<? extends CellProperty> clazz)
    {
        if (Brain.class == clazz
          && getBrain() != -1.0f)
        {
            return (T) new Brain(getBrain());
        }
        return null;
    }

    private <T extends CellProperty> T getVis(Class<? extends CellProperty> clazz)
    {
        if (SenseVision.class == clazz
          && getVision() != -1.0f)
        {
            return (T) new SenseVision(getVision());
        }
        return null;
    }

    private <T extends CellProperty> T getAction(Class<? extends CellProperty> clazz)
    {
        if (ActionMovement.class == clazz
            && getMovement() != -1.0f)
        {
            return (T) new ActionMovement(getMovement());
        }

        if (ActionPhotosynthesise.class == clazz
          && getPhotosynthesise() != -1.0f)
        {
            return (T) new ActionPhotosynthesise(getPhotosynthesise());
        }

        if (ActionRespire.class == clazz
            && getRespire() != -1.0f)
        {
            return (T) new ActionRespire(getRespire());
        }
        return null;
    }
}
