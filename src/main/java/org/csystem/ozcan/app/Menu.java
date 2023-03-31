package org.csystem.ozcan.app;

import com.karandev.util.console.Console;
import org.csystem.ozcan.context.FindNumberContext;
import org.csystem.ozcan.context.Star;

public class Menu {
        public static void printMenu() {
            Star.print();
            Console.writeLine("1. Find The Number In My Mind");
            Console.writeLine("2. Exit");
            Console.writeLine("(More games will be added...)");
        }

        public static void doOption(int option) {
            switch (option) {
                case 1 -> FindNumberContext.startText();
                case 2 -> doExit();
                default -> doInvalidOption();
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

        public static void run() {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            for (; ; ) {
                printMenu();
                doOption(Integer.parseInt(kb.nextLine()));
            }
        }
    }