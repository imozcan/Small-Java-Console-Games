package org.csystem.ozcan.app;

import com.karandev.util.console.Console;
import org.csystem.ozcan.context.Star;
import org.csystem.ozcan.gameApp.Craps;
import org.csystem.ozcan.gameApp.FindNumber;
import org.csystem.ozcan.gameApp.FlipCoin;

public class NewGameMenu {
    public static void printMenu() {
        Console.writeLine("1.I want to play the same game");
        Console.writeLine("2.I want to play a different game");
        Console.writeLine("3.Exit");
        Console.write("Your option: ");
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
            case 1111 -> FindNumber.run();
            case 2222 -> Craps.run();
            case 3333 -> FlipCoin.run();
        }
    }

    public static void doExit() {
        Console.writeLine("See you soon");
        System.exit(0);
    }

    public static void doInvalidOption() {
        Console.writeLine("Invalid Option!...");
        Star.print(36);
    }

    public static void request(int GameId)
    {
        while (true) {
            Star.print(36);
            Console.writeLine( "Would you like to play again");
            printMenu();
            doOption(Console.readInt(), GameId);
        }
    }
}
