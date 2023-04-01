package org.csystem.ozcan.gameApp;

import com.karandev.util.console.Console;
import org.csystem.ozcan.app.NewGameMenu;
import org.csystem.ozcan.context.Star;
import java.util.Random;

public class FlipCoin {
    static int GameId = 3333;
    static boolean value;

    public static void controller()
    {
        var result = flipping(new Random());

        Console.writeLine(result ? "Flipped: Heads" : "Flipped: Tails");
        Console.writeLine(result == value ? "You Won The Game" : "Bad luck, you lost the game");

        NewGameMenu.request(GameId);
    }
    public static void run()
    {
        Star.print(36);
        Console.write("Chose one Heads(1) or Tails(2) :");

        switch (Console.readInt()) {
            case 1 -> value = true;
            case 2 -> value = false;
            default -> doInvalidOption();
        }
        controller();
    }

    public static void doInvalidOption()
    {
        Console.writeLine("Invalid Option!...");
        Star.print(36);
        run();
    }

    public static boolean flipping(Random random)
    {
        return random.nextBoolean();
    }
}