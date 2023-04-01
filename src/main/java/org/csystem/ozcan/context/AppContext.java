package org.csystem.ozcan.context;

import com.karandev.util.console.Console;
import org.csystem.ozcan.FindNumberApp.FindNumberApp;
import org.csystem.ozcan.crapsApp.CrapsApp;

import java.util.Random;

public class AppContext {
    public static void findNumberStartText()
    {
        Star.print();
        Console.writeLine("- Hello...");
        Console.writeLine("- This is a number guessing Game in terminal");
        Console.writeLine("- I got a number in my mind, it's between 0 to 50");
        Console.writeLine("- Let's see if you can find this number in 3 times with a little help :)");
        Star.print();

        FindNumberApp.controller();
    }
    public static void CrapsStartText()
    {
        Star.print();
        Console.writeLine("- Hello...");
        Console.writeLine("- This is Craps Game in terminal");
        Console.write("- Do you want to read games rule [Yes=1 --- No=2] ");
        if (Console.readInt() == 1)
            CrapsRuleText();

        Star.print();
        CrapsApp.controller();
    }

    public static void CrapsRuleText()
    {
        Star.print();
        Console.writeLine("- The game is played with two dice");
        Console.writeLine("- The player who rolls the dice plays the game against the dealer");
        Console.writeLine("- The total value of the two dice rolled");
        Console.writeLine("- i) If it is 7 or 11, the player wins.");
        Console.writeLine("- ii) If it is 2, 3, 12, the player loses. (This is called craps!)");
        Console.write("- iii) If the total value of the two dice is anything other than ");
        Console.writeLine("the above (ie 4, 5, 6, 8, 9, 10) the game continues as follows it does: ");
        Console.writeLine("- The player rolls the dice again until they get the same result");
        Console.writeLine("- If the player rolls a 7 before finding the same result, the player loses");
        Console.writeLine("- If the player manages to roll the same result again before the 7 comes, he/she wins");
    }
}

/*------------------------------------------------------------------------------------------------------

 -------------------------------------------------------------------------------------------------------*/