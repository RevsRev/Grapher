package Projects.Life.Actions;

import Projects.Life.Cell.Cell;
import Projects.Life.Cell.CellProperty;
import Projects.Life.ProducerConsumer.EnergyConsumerI;

public abstract class AbstractAction extends CellProperty implements EnergyConsumerI
{
    public AbstractAction(Cell cell)
    {
        super(cell);
    }

    public abstract boolean doAction();
}
