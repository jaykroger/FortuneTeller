import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
        setTitle("Fortune Teller");
        setSize(1280, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createIconPanel()
    {
        iconPanel = new JPanel();
        icon = new ImageIcon("fortunecookie.png");
        label = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        label.setFont(new Font("Montserrat", Font.PLAIN, 48));
        iconPanel.add(label);
    }

    private void createDisplayPanel()
    {
        displayPanel = new JPanel();
        textArea = new JTextArea(22, 100);
        scroller = new JScrollPane(textArea);
        displayPanel.add(scroller);
    }

    private void createButtonPanel()
    {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        fortuneButton = new JButton("Read my Fortune!");
        quitButton = new JButton("Quit");

        FortuneButton getFortune = new FortuneButton();

        fortuneButton.addActionListener(getFortune);
        quitButton.addActionListener((ActionEvent ae) -> System.exit(0));

        buttonPanel.add(fortuneButton);
        buttonPanel.add(quitButton);
    }
}
