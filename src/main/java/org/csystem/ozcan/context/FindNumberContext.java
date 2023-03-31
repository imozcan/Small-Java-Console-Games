package org.csystem.ozcan.context;

import com.karandev.util.console.Console;
import org.csystem.ozcan.FindNumberApp.FindNumberApp;

public class FindNumberContext {
    public static void startText()
    {
        Star.print();
        Console.writeLine("- Hello...");
        Console.writeLine("- This is a number guessing Game in terminal");
        Console.writeLine("- I got a number in my mind, it's between 0 to 50");
        Console.writeLine("- Let's see if you can find this number in 3 times with a little help :)");
        Star.print();

        FindNumberApp.Controller();
    }
}
