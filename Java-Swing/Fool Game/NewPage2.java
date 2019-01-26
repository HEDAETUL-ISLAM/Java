import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewPage2 extends JFrame implements ActionListener{

    public enum Action{         //Enumerations
        EXIT, AGAIN;
    }

    private JButton buttonAgain,buttonExit;
    private ImageIcon img;

    public NewPage2(){

            super("FOOL GAME");
            this.setSize(600,500);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel3 = new JPanel();
            panel3.setLayout(null);
            panel3.setBackground(Color.DARK_GRAY);


            JLabel fool = new JLabel("YOU ARE CUNNING");
            fool.setFont(new Font("Serif", Font.BOLD, 25));
            fool.setForeground(Color.cyan);
            fool.setBounds(170,10,300,20);


            img = new ImageIcon("tenor.gif");
            JLabel imgLabel = new JLabel(img);
            imgLabel.setBounds(60, 0, 500, 450);
            panel3.add(imgLabel);
            panel3.add(fool);


            buttonAgain = new JButton("Again");
            buttonAgain.setBackground(Color.green);
            buttonAgain.setBounds(200,410,80,30);
            buttonAgain.addActionListener(this);
            buttonAgain.setActionCommand(Action.AGAIN.name());

            panel3.add(buttonAgain);

            buttonExit = new JButton("Exit");
            buttonExit.setBackground(Color.red);
            buttonExit.setBounds(310,410,80,30);
            buttonExit.setForeground(Color.WHITE);
            buttonExit.addActionListener(this);
            buttonExit.setActionCommand(Action.EXIT.name());

            panel3.add(buttonExit);

            this.add(panel3);

    }

    public void actionPerformed(ActionEvent ae) {
        FoolGame.f=false;

        if (ae.getActionCommand() == Action.AGAIN.name()) {
                FoolGame.newPage2.dispose();
        }
        else if (ae.getActionCommand() == Action.EXIT.name()) {
                System.exit(0);
        }
    }
}
