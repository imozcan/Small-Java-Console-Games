package org.csystem.ozcan.app;

import com.karandev.util.console.Console;
import org.csystem.ozcan.context.FindNumberContext;
import org.csystem.ozcan.context.Star;

public class NewGameMenu {
    public static void printMenu() {
        Console.writeLine("1.I want to play the same game");
        Console.writeLine("2.I want to play a different game");
        Console.writeLine("3.Exit");
    }

    public static void doOption(int option, int GameId) {
        switch (option) {
            case 1 -> gameIdOption(GameId);
            case 2 -> MenuApp.run();
            case 3 -> doExit();
            default -> doInvalidOption();
        }
    }

    public static void gameIdOption(int GameId)
    {
        switch (GameId) {
            case 2121 -> FindNumberContext.startText();
        }
    }

    public static void doExit() {
        Console.writeLine("See you soon");
        System.exit(0);
    }

    public static void doInvalidOption() {
        Console.writeLine("Invalid Option!...");
        Star.print();
    }

    public static void request(int GameId)
    {
        while (true) {
            Star.print();
            Console.writeLine( "Would you like to play again");
            printMenu();
            doOption(Console.readInt(), GameId);
        }
    }
}
