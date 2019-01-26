import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class FoolGame extends JFrame implements ActionListener,MouseListener,KeyListener{

    public static boolean f = false;

    public enum Action{     //Enumerations
          YES, NO;
    }

    JButton buttonYes,buttonNo,buttonHelp;

        public FoolGame(){

            super("FOOL GAME");
            this.setSize(800,500);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.DARK_GRAY);

            JLabel welcome = new JLabel("WELCOME TO FOOL GAME");
            welcome.setFont(new Font("Serif", Font.BOLD, 25));
            JLabel fool = new JLabel("ARE YOU FOOL?");   //welcome to
            fool.setFont(new Font("Serif", Font.BOLD, 25));
            welcome.setForeground(Color.white);
            welcome.setBounds(200,30,500,20);
            panel.add(welcome);
            fool.setForeground(Color.cyan);
            fool.setBounds(290,70,500,20);
            panel.add(fool);

            buttonYes = new JButton("YES");      //login
            buttonYes.setBackground(Color.green);
            buttonYes.setBounds(300,200,80,50);
            buttonYes.addActionListener(this);
            buttonYes.setActionCommand(Action.YES.name());
            panel.add(buttonYes);

            buttonNo = new JButton("NO");       //exit
            buttonNo.setBackground(Color.red);
            buttonNo.setBounds(420,200,80,50);
            buttonNo.setForeground(Color.WHITE);
            buttonNo.setActionCommand(Action.NO.name());
            buttonNo.addMouseListener(this);
            buttonNo.addActionListener(e->noButton());          //lambda expression
            buttonYes.addKeyListener(this);
            panel.add(buttonNo);

            this.add(panel);
    }

    public static NewPage newPage = new NewPage();
    public static NewPage2 newPage2 = new NewPage2();

    public void actionPerformed(ActionEvent ae) {

        if (buttonYes.getActionCommand() == Action.YES.name()) {
            newPage.setVisible(true);
        }
    }
    private void noButton() {
        newPage2.setVisible(true);
    }

    public void keyTyped(KeyEvent ke){}
    public void keyReleased(KeyEvent ke){}

    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_1){
            f=true;
        }
    }

    public void mouseClicked(MouseEvent me){}
  	public void mousePressed(MouseEvent me){}
  	public void mouseReleased(MouseEvent me){}

    public void mouseEntered(MouseEvent me) {

        Random r = new Random();
            Point point=new Point();
            point=buttonNo.getLocation();
            if(point.x>700 && f==false){
                buttonNo.setLocation(r.nextInt(100), r.nextInt(700));
            }
            else if(point.x<100 && f==false){
                buttonNo.setLocation(r.nextInt(700), r.nextInt(100));
            }
            else if(f==false){
                buttonNo.setLocation(r.nextInt(700), r.nextInt(100));
            }
    }

    public void mouseExited(MouseEvent me) {
        Random r = new Random();
        Point point=new Point();
        point=buttonNo.getLocation();
        if(point.x>700 && f==false ){
            buttonNo.setLocation(r.nextInt(100), r.nextInt(700));
        }
        else if(point.x<100 && f==false){
            buttonNo.setLocation(r.nextInt(700), r.nextInt(100));
        }
        else if(f==false){
                buttonNo.setLocation(r.nextInt(700), r.nextInt(100));
        }
    }
}
