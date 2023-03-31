package org.csystem.ozcan.app;

import com.karandev.util.console.Console;

public class MenuApp {
    public static void run()
    {
        Menu.run();
        Console.readInt("Choose your game: ");
    }
}
