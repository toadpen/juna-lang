package behaviour;

import java.util.HashMap;

public class Variable {

    String name;
    Object value;

    public Variable(String name, Object value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return this.name;
    }

    public Object getValue()
    {
        return this.value;
    }


}
