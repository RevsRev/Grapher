package util;

import lombok.Getter;
import lombok.Setter;

public class Pair<T,V>
{
    @Getter @Setter
    T first;

    @Getter @Setter
    V second;

    public Pair(T first, V second)
    {
        this.first = first;
        this.second = second;
    }
}
