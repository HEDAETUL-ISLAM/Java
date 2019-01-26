import java.awt.*;
import javax.swing.*;

public class PuzzelGame extends JFrame {

    public PuzzelGame(){

        super("PUZZLE GAME");
        this.setSize(400, 550);
        Dimension dim =  Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2 , dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#054250"));

        JLabel label = new JLabel("Welcome To Puzzle Game");
        label.setBounds(40, 50,360, 40);
        label.setFont(new Font("Serif", Font.ROMAN_BASELINE, 25));
        label.setForeground(Color.white);
        panel.add(label);

         JLabel label2 = new JLabel("<html> Here you will get five couple of numbers. You <br/>  have to find the same number one after one.</html>");
         label2.setBounds(10,100,380,280);
         label2.setFont(new Font("Serif", Font.ROMAN_BASELINE, 15));
         label2.setForeground(Color.white);
         panel.add(label2);

        JButton buttonPlay = new JButton("PLAY");
        buttonPlay.setBounds(100, 400, 90, 40);
        buttonPlay.setBackground(Color.decode("#B1B4B4"));
        buttonPlay.setFont(new Font("Arial", Font.BOLD, 15));
        buttonPlay.addActionListener(e->play());
        buttonPlay.setBorderPainted(false);
        buttonPlay.setFocusable(false);
        panel.add(buttonPlay);

        JButton buttonExit =  new JButton("EXIT");
        buttonExit.setBounds(210, 400,90, 40);
        buttonExit.setBackground(Color.decode("#B1B4B4"));
        buttonExit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonExit.addActionListener(e->exit());
        buttonExit.setBorderPainted(false);
        buttonExit.setFocusable(false);
        panel.add(buttonExit);

        this.add(panel);
    }

    public void exit(){
        System.exit(0);
    }
    public void play(){
        PuzzleMatching puzzleMatching = new PuzzleMatching();
        puzzleMatching.setVisible(true);
        this.setVisible(false);
    }


}
