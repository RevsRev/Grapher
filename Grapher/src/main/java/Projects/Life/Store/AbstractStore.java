package Projects.Life.Store;

import Projects.Life.Cell.Cell;
import Projects.Life.Cell.CellProperty;
import lombok.Getter;

public abstract class AbstractStore extends CellProperty
{
    @Getter
    private float store = 0.0f;

    public AbstractStore(Cell cell, float store)
    {
        super(cell);
        this.store = store;
    }

    public boolean addToStore(float amount)
    {
        //TODO - Implement min/max amounts in the store!
        store += amount;
        return true;
    }
    public boolean removeFromStore(float amount)
    {
        return addToStore(-amount);
    }
}
