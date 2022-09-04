package Projects.Life.World;

import Projects.Life.Cell.Cell;
import lombok.Getter;

import java.util.HashSet;

/*
 * Represents the world that life takes place in
 */
public class World
{
    @Getter private final Light light;
    @Getter private final Atmosphere atmosphere;
    @Getter
    private final GroundWater water;

    @Getter private final HashSet<Cell> cells = new HashSet<Cell>();

    private static World theWorld = null;

    private World(Light light, Atmosphere atmosphere, GroundWater water)
    {
        this.light = light;
        this.atmosphere = atmosphere;
        this.water = water;
    }

    public static World the()
    {
        if (theWorld == null)
        {
            synchronized (theWorld)
            {
                if (theWorld == null)
                {
                    theWorld = new World(new Light(), new Atmosphere(), new GroundWater());
                }
            }
        }
        return theWorld;
    }
}
