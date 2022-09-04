package Projects.Life.Store;

import Projects.Life.Cell.Cell;
import Projects.Life.Cell.CellProperty;
import lombok.Getter;

public abstract class AbstractStore implements CellProperty
{
    @Getter
    private float store = 0.0f;

    public AbstractStore(float store)
    {
        this.store = store;
    }

    public void addToStore(float amount)
    {
        store += amount;
    }
    public void removeFromStore(float amount)
    {
        addToStore(-amount);
    }
}
