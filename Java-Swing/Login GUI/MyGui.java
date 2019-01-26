import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGui extends JFrame implements ActionListener {

    private JPanel panel, panel2;
    private JLabel welcome,userlabel, passwordlabel;
    private JTextField textfield;
    private JPasswordField passwordfield;
    private JButton buttonlog, buttonexit;

    public MyGui(){
        super("APP");
        this.setSize(650,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        welcome = new JLabel("WELCOME");                //welcome top
        welcome.setForeground(Color.white);
        welcome.setBounds(300,50,100,10);
        panel.add(welcome);


        userlabel = new JLabel("User Name :");              //name
        userlabel.setForeground(Color.white);
        userlabel.setBounds(150,100,100,30);
        panel.add(userlabel);

        textfield = new JTextField();                         //name field
        textfield.setBounds(260,100,150,30);
        textfield.setBackground(Color.WHITE);
        panel.add(textfield);

        passwordlabel = new JLabel("Password :");               //password
        passwordlabel.setForeground(Color.WHITE);
        passwordlabel.setBounds(150,150,100,30);
        panel.add(passwordlabel);

        passwordfield = new JPasswordField();                      //password field
        passwordfield.setBounds(260,150,150,30);
        panel.add(passwordfield);

        buttonlog = new JButton("Login");                       //login
        buttonlog.setBackground(Color.green);
        buttonlog.setBounds(190,200,80,20);
        buttonlog.addActionListener(e-> loginButtonAction(textfield,passwordfield));
        panel.add(buttonlog);

        buttonexit = new JButton("Exit");                        //exit
        buttonexit.setBackground(Color.red);
        buttonexit.setBounds(300,200,80,20);
        panel.add(buttonexit);

        this.add(panel);
    }

    private void loginButtonAction(JTextField userField, JPasswordField passwordField) {
        if(userField.getText().equals("1") && passwordField.getText().equals("2")){
            userField.setText(null);
            passwordField.setText(null);
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid","Login Error",JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        System.out.println("hello");
    }
}
