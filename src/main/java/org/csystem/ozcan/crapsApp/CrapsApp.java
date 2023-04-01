package org.csystem.ozcan.crapsApp;
import com.karandev.util.console.Console;
import org.csystem.ozcan.app.NewGameMenu;
import org.csystem.ozcan.context.Star;
import java.util.Random;

public class CrapsApp {
    public static int diceOne, diceTwo;
    public static int GameId = 2222;
    public static java.util.Random random;

    public static int rollDice()
    {
        Random random = new Random();
        diceOne = random.nextInt(1, 7);
        diceTwo = random.nextInt(1, 7);
        printDices();

        return diceOne + diceTwo;
    }

    public static void printDices()
    {
        Console.readInt("Dices rolling Press(1) drop to dices ");
        Console.writeLine("First Dice :%d %nSecond Dice :%d", diceOne, diceTwo);
        Star.print();
    }
    public static void controller()
    {
        var sumDices = rollDice();

        if (sumDices == 7 || sumDices == 11)
            Console.writeLine("Craps!, You Won The Game"); //Win

        else if (sumDices == 2 || sumDices == 3 || sumDices == 12)
            Console.writeLine("Bad luck, you lost the game");//Loss

        else
            secondPart(sumDices);

        NewGameMenu.request(GameId);
    }

    public static void secondPart(int sumDices)
    {
        var i = 1;
        while (true)
        {
            i++;
            Console.writeLine("The Game Continues %d. Round Has Started", i);
            Console.writeLine("- If the sum of your dice is %d, you will win, if it is 7, you will lose.",sumDices);
            var newSumDices = rollDice();

            if (newSumDices == 7) {
                Console.writeLine("Bad luck, you lost the game, Don't give up trying again...");   //Loss
                NewGameMenu.request(GameId);
            }
            if (newSumDices == sumDices) {
                Console.writeLine("Craps!, You Won The Game in the %d. round", i);   //Win
                NewGameMenu.request(GameId);
            }
        }
    }
}