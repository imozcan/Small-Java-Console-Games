package org.csystem.ozcan.gameApp;

import com.karandev.util.console.Console;
import org.csystem.ozcan.app.NewGameMenu;
import java.util.Random;

public class FindNumber {
    static int i = 1;
    static int GameId = 1111;
    static String Suffix;

    public static int GenerateRandom(Random random)
    {
        return random.nextInt(1, 51);
    }

    public static int takeNumber()
    {
        return Console.readInt("Enter Your "+ i++ +". guess :");
    }

    public static boolean compare(int Result, int UserAnswer )
    {
        return Result == UserAnswer;
    }

    public static String Approach(int val, int userAnswer)
    {
        return val > userAnswer ? "Increase" : "Decrease";
    }
    public static String Suffix()
    {
        return switch (i) {
            case 1 -> Suffix = "First";
            case 2 -> Suffix = "Second";
            default -> Suffix = "Last";
        };
    }
    public static void run()
    {
        var GeneratedNumber = GenerateRandom(new Random());

        while (i <= 3) {
            var userAnswer = takeNumber();

            if (compare(GeneratedNumber, userAnswer)) {
                i--;
                Console.writeLine("Winning number %s, you got the right answer on the %s try :]",GeneratedNumber, Suffix());
                NewGameMenu.request(GameId);
            }
            else if (i == 4)
                Console.writeLine("Sorry wrong answer again, That was the number: %d ",GeneratedNumber);
            else
                Console.writeLine("Wrong Answer, for your %s try, please %s value", Suffix(), Approach(GeneratedNumber, userAnswer));
        }
    }
}