package org.csystem.ozcan.app;

import com.karandev.util.console.Console;
import org.csystem.ozcan.context.AppContext;
import org.csystem.ozcan.context.Star;

public class Menu {
        public static void printMenu()
        {
            Star.print(36);
            Console.writeLine("1. Find The Number In My Mind");
            Console.writeLine("2. Craps");
            Console.writeLine("3. FlipCoin");
            Console.writeLine("4. .....");
            Console.writeLine("5. Exit");
        }

        public static void doOption(int option)
        {
            switch (option) {
                case 1 -> AppContext.findNumberStartText();
                case 2 -> AppContext.CrapsStartText();
                case 3 -> AppContext.flipCoinStartText();
                case 4,5 -> doExit();
                default -> doInvalidOption();
            }
        }

        public static void doExit()
        {
            Console.writeLine("See you soon");
            System.exit(0);
        }

        public static void doInvalidOption()
        {
            Console.writeLine("Invalid Option!...");
            Star.print(36);
        }

        public static void run()
        {
            while (true) {
                printMenu();
                doOption(Console.readInt("Your option: "));
            }
        }
    }