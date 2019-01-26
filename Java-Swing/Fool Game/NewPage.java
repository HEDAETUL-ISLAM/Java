import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewPage extends JFrame implements ActionListener{

    public enum Action{       //Enumerations
        EXIT, AGAIN;
    }
    private JButton buttonAgain,buttonExit;
    private ImageIcon img;

    public NewPage(){

            super("FOOL GAME");
            this.setSize(600,500);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel2 = new JPanel();
            panel2.setLayout(null);
            panel2.setBackground(Color.DARK_GRAY);


            JLabel fool = new JLabel("YOU ARE FOOL");
            fool.setFont(new Font("Serif", Font.BOLD, 25));
            fool.setForeground(Color.cyan);
            fool.setBounds(195,5,300,20);


            img = new ImageIcon("april-fools-day-30.gif");
            JLabel imgLabel = new JLabel(img);
            imgLabel.setBounds(0, 0, 600, 450);
            panel2.add(imgLabel);
            panel2.add(fool);


            buttonAgain = new JButton("Again");
            buttonAgain.setBackground(Color.green);
            buttonAgain.setBounds(200,410,80,30);
            buttonAgain.addActionListener(this);
            buttonAgain.setActionCommand(Action.AGAIN.name());

            panel2.add(buttonAgain);

            buttonExit = new JButton("Exit");
            buttonExit.setBackground(Color.red);
            buttonExit.setBounds(310,410,80,30);
            buttonExit.setForeground(Color.WHITE);
            buttonExit.addActionListener(this);
            buttonExit.setActionCommand(Action.EXIT.name());

            panel2.add(buttonExit);

            this.add(panel2);

    }

    public void actionPerformed(ActionEvent ae) {
        FoolGame.f=false;

        if (ae.getActionCommand() == Action.AGAIN.name()) {
                FoolGame.newPage.dispose();
        }
        else if (ae.getActionCommand() == Action.EXIT.name()) {
                System.exit(0);
        }
    }
}
