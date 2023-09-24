import javax.swing.*;

public class FortuneTellerViewer {
    public static void main(String[] args)
    {
        FortuneTellerFrame fortuneTeller = new FortuneTellerFrame();
        JButton fortuneButton = new JButton("Get a Fortune");
        JButton quitButton = new JButton("Quit");

        FortuneButton getFortune = new FortuneButton();
        QuitButton quit = new QuitButton();

        fortuneButton.addActionListener(getFortune);
        quitButton.addActionListener(quit);


        fortuneTeller.setTitle("Fortune Teller");
        fortuneTeller.setSize(1280, 1000);
        fortuneTeller.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fortuneTeller.setVisible(true);
        fortuneTeller.add(quitButton);
        fortuneTeller.add(fortuneButton);

    }
}