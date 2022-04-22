package interpret;

import file.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Interpret {

    IO inout;

    public Interpret()
    {
        inout = new IO();
    }

    public void getFileSource(String fileSource)
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
        switch (splittedInputs[0])
        {
            case "print":
                String strOut = "";
                for(int i = 1; i < splittedInputs.length; i++)
                {
                    strOut += splittedInputs[i] + " ";
                }
                inout.print(strOut);


        }
    }
}
