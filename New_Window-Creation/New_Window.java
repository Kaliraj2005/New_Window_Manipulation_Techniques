package AWT_Swing_Projects.New_Window_Creation;

import javax.swing.*;
import java.awt.*;

public class New_Window
{
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello Bro !!! Click for another New Window !!!");

    New_Window()
    {
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new New_Window();
    }
}
