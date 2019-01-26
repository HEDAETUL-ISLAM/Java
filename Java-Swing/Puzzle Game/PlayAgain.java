import java.awt.*;
import javax.swing.*;

public class PlayAgain extends JFrame{
    
    public PlayAgain(){
    
         super("PUZZLE GAME");
            this.setSize(400,550);
            Dimension dim  = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setBackground(Color.decode("#054250"));
            panel.setLayout(null);
            
            JLabel play = new JLabel("Do you wanna play again ?");
            play.setBounds(90, 50, 350, 30);
            play.setForeground(Color.white);
            play.setFont(new Font("Arial", Font.PLAIN, 16));
            panel.add(play);
            
            JButton playAgain = new JButton("Yes");
            playAgain.setBounds(90,240,100, 30);
            playAgain.addActionListener(e->again());
            playAgain.setBackground(Color.lightGray);
            playAgain.setFont(new Font("Arial", Font.BOLD, 16));
            playAgain.setBorderPainted(false);
            playAgain.setFocusable(false);
            panel.add(playAgain);
            
            JButton exit = new JButton("No");
            exit.setBounds(220,240, 100, 30); 
            exit.addActionListener(e->exitApp());
            exit.setBackground(Color.lightGray);
            exit.setFont(new Font("Arial", Font.BOLD, 16));
            exit.setBorderPainted(false);
            exit.setFocusable(false);
            panel.add(exit);
            
        this.add(panel);
    }

    private void again() {
    
        PuzzleMatching puzzleMatching = new PuzzleMatching();
        puzzleMatching.setVisible(true);
        this.setVisible(false);
    }

    private void exitApp() {
    
         System.exit(0);
    }
}
