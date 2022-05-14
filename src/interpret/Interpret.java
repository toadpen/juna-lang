package interpret;

import file.Files;

import javax.security.auth.callback.TextOutputCallback;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Interpret {

    IO inout;

    public Interpret()
    {
        inout = new IO();
    }

    public void readInterpret(String fileSource)
    {
        String out = "";
        try
        {
            File file = new File(fileSource);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                interpretFile(data);
            }
            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void interpretFile(String input)
    {
        String[] splittedInputs = input.split(" ");
        Route route = new Route();
        route.findToken(splittedInputs);

    }
}
