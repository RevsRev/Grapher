package Projects.Life.World;

import Projects.Life.UniversalConstants.UniversalConstants;

public class GroundWater
{
    private int water = 10000;

    public GroundWater()
    {
        this(UniversalConstants.WORLD_GROUND_WATER);
    }
    public GroundWater(int water)
    {
        this.water = water;
    }
}
