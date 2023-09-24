import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FortuneTellerFrame extends JFrame
{
    // Panels
    JPanel mainPanel;
    JPanel iconPanel;
    JPanel displayPanel;
    JPanel buttonPanel;


    // Panel Assets below

    // Icon Panel
    JLabel label;
    ImageIcon icon;

    // Scroll Panel
    JTextArea textArea;
    JScrollPane scroller;

    // Button Panel
    JButton fortuneButton;
    JButton quitButton;

    public FortuneTellerFrame()
    {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        createIconPanel();
        mainPanel.add(iconPanel, BorderLayout.NORTH);

        createDisplayPanel();
        mainPanel.add(displayPanel, BorderLayout.CENTER);


        createButtonPanel();
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);
    }

    private void createIconPanel()
    {
        iconPanel = new JPanel();
        icon = new ImageIcon("src/fortunecookie.jpg");
        label = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        label.setFont(new Font("Montserrat", Font.PLAIN, 48));
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        iconPanel.add(label);
    }

    private void createDisplayPanel()
    {
        displayPanel = new JPanel();
        textArea = new JTextArea(22, 100);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        scroller = new JScrollPane(textArea);
        displayPanel.add(scroller);
    }

    private void createButtonPanel()
    {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        fortuneButton = new JButton("Read my Fortune!");
        quitButton = new JButton("Quit");

        fortuneButton.addActionListener((ActionEvent ae) ->
        {
            String fortune = getFortune();
            System.out.println(fortune);
            textArea.append(fortune + "\n");
        });

        quitButton.addActionListener((ActionEvent ae) -> System.exit(0));

        fortuneButton.setFont(new Font("Arial", Font.PLAIN, 20));
        quitButton.setFont(new Font("Arial", Font.PLAIN, 20));

        buttonPanel.add(fortuneButton);
        buttonPanel.add(quitButton);
    }

    // Methods used for button functions
    int lastIndex = -1;
    public String getFortune()
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
        return fortune;
    }

    public int getRandomInt(int Min, int Max)
    {
        return ThreadLocalRandom
                .current().nextInt(Min, Max + 1);
    }
}
