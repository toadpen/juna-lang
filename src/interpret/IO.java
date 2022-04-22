package interpret;

import java.util.Scanner;

public class IO {

    public void print(String input)
    {
        System.out.println(input);
    }

    public String input()
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}
