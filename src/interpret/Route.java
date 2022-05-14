package interpret;

import behaviour.Variable;
import token.Access;
import token.Keywords;

import java.util.HashMap;

public class Route {

    // Var
    public HashMap<String, Object> var_value = new HashMap<>();

    public void findToken(String[] token)
    {
        switch (token[0])
        {
            // Variable related
            case Keywords._var:
                var_value.put(token[1], token[3]);


            // Other keywords
            case Keywords._use:

        }
    }
}
