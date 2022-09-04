package Projects.Life.World;

import Projects.Life.UniversalConstants.UniversalConstants;
import lombok.Getter;

public class Light
{
    @Getter
    private int light = 100; //From 0 to 100

    public Light()
    {
        this(UniversalConstants.WORLD_LIGHT);
    }
    public Light(int light)
    {
        this.light = light;
    }
}
