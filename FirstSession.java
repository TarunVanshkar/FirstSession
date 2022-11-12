import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSession implements ActionListener {
    JFrame frame;  // Name of JFrame class is frame, Now create its constructor
    JTextArea myarea;
    JButton button;
    FirstSession()
    {
        frame=new JFrame( "First Session");
        frame.setBounds(250, 250, 300, 300);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        button=new JButton("Click");
        button.setBounds(110,20,90,20);
        button.addActionListener(this);
        myarea=new JTextArea("Welcome to Text Area");
        myarea.setBounds(50, 50, 200, 200);
        myarea.setBackground(Color.RED);
        frame.add(button);
        frame.add(myarea);
        frame.setLayout(null); // my text area will be at centre of frame ,, always before setVisible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // So our window close
    }
    public static void main(String []args)
    {
        FirstSession object=new FirstSession();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        myarea.setText("You have clicked the button");
    }
}
