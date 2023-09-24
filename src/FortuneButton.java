import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FortuneButton implements ActionListener
{
    int lastIndex = -1;
    public void actionPerformed(ActionEvent e)
    {
        String fortune_1 = "Any day above ground is a good day.";
        String fortune_2 = "All your hard work will soon pay off.";
        String fortune_3 = "Determination is what you need now.";
        String fortune_4 = "Help! I’m being held prisoner in a chinese bakery!";
        String fortune_5 = "Now is a good time to buy stock.";
        String fortune_6 = "Practice makes perfect.";
        String fortune_7 = "The saints are the sinners who keep on trying.";
        String fortune_8 = "There is a time for caution, but not for fear.";
        String fortune_9 = "You can’t steal second base and keep your foot on first.";
        String fortune_10 = "A faithful friend is a strong defense.";
        String fortune_11 = "Believe it can be done.";
        String fortune_12 = "Don’t just spend time. Invest it.";

        ArrayList<String> fortunes = new ArrayList<>();

        fortunes.add(fortune_1);
        fortunes.add(fortune_2);
        fortunes.add(fortune_3);
        fortunes.add(fortune_4);
        fortunes.add(fortune_5);
        fortunes.add(fortune_6);
        fortunes.add(fortune_7);
        fortunes.add(fortune_8);
        fortunes.add(fortune_9);
        fortunes.add(fortune_10);
        fortunes.add(fortune_11);
        fortunes.add(fortune_12);

        int index = getRandomInt(0, 11);

        while (index == lastIndex)
        {
            index = getRandomInt(0, 11);
        }

        lastIndex = index;
        String fortune = fortunes.get(index);
        System.out.println(fortune);

    }
    public static int getRandomInt(int Min, int Max)
    {
        return ThreadLocalRandom
                .current().nextInt(Min, Max + 1);
    }
}

