package AWT_Swing_Projects.New_Window_Creation;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
public class New_Window_Execution_Page implements ActionListener
{
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    New_Window_Execution_Page()
    {

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button)
        {
//            frame.dispose();        -->      Only can access one time.

            New_Window window = new New_Window();
        }
    }
}
