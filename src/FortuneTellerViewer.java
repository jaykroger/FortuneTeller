import javax.swing.*;
import java.awt.*;

public class FortuneTellerViewer
{
    public static void main(String[] args)
    {
        FortuneTellerFrame fortuneTeller = new FortuneTellerFrame();

        fortuneTeller.setTitle("Fortune Teller");
        fortuneTeller.setSize(1080, 560);
        fortuneTeller.setLocation(100, 80);
        fortuneTeller.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fortuneTeller.setVisible(true);
    }
}