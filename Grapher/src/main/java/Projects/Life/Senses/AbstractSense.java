package Projects.Life.Senses;

import Projects.Life.Cell.Cell;
import Projects.Life.Cell.CellProperty;
import Projects.Life.ProducerConsumer.EnergyConsumerI;

public abstract class AbstractSense extends CellProperty implements EnergyConsumerI
{
    public AbstractSense(Cell cell)
    {
        super(cell);
    }
}
