package Projects.Life.World;

import Projects.Life.Cell.Cell;

import java.util.HashSet;

/*
 * Represents the world that life takes place in
 */
public class World
{
    private final Light light;
    private final Atmosphere atmosphere;
    private final GroundWater water;

    private final HashSet<Cell> cells = new HashSet<Cell>();

    public World(Light light, Atmosphere atmosphere, GroundWater water)
    {
        this.light = light;
        this.atmosphere = atmosphere;
        this.water = water;
    }
}
