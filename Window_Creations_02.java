package AWT_Swing_Projects.New_Window_Creation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window_Creations_02 implements WindowListener
{
    public static void main(String[] args)
    {
        JFrame mainFrame = new JFrame("User Window !!!");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 200);
        mainFrame.setLayout(new FlowLayout());

        JButton openWindowButton = new JButton("For Open New Window");
        mainFrame.add(openWindowButton);

        final int[] windowCount = {0};

        openWindowButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                windowCount[0]++;

                JFrame newWindow = new JFrame("New Window " + windowCount[0]);
                newWindow.setSize(200, 150);
                newWindow.setLocation(100 + (windowCount[0] * 30), 100 + (windowCount[0] * 30));
                newWindow.setLayout(new FlowLayout());

                JLabel label = new JLabel("Window Number : " + windowCount[0]);
                newWindow.add(label);

                newWindow.setVisible(true);
            }
        });
        mainFrame.setVisible(true);
    }
    @Override
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window has Opened now !!!");
    }
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window has Closing now");
    }
    @Override
    public void windowClosed(WindowEvent e)
    {
        System.out.println("You are Exited now");
    }
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}

