package Projects.Life.Cell;

import lombok.Getter;

public class CellProperty
{
    @Getter private final Cell cell;
    public CellProperty(Cell cell)
    {
        this.cell = cell;
    }
}
