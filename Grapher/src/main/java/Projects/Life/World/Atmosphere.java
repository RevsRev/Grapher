package Projects.Life.World;

import Projects.Life.UniversalConstants.UniversalConstants;

public class Atmosphere
{
    private long oxygen;
    private long co2;

    public Atmosphere()
    {
        this(UniversalConstants.WORLD_OXYGEN, UniversalConstants.WORLD_CO2);
    }
    public Atmosphere(long oxygen, long co2)
    {
        this.oxygen = oxygen;
        this.co2 = co2;
    }
}
