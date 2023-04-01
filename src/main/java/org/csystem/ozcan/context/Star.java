package org.csystem.ozcan.context;

import com.karandev.util.console.Console;

public class Star {
    public static void print()
    {
        int n = 36; //  How many stars will be added
        for(int i = 0 ; i < n; i++){
            Console.write("* ");
        }
        Console.writeLine();
    }

}

