import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener, MouseListener{

    JButton button7, button8, button9, buttonDivision,
            button4, button5, button6, buttonMultiple,
            button1, button2, button3, buttonMinus,
            buttonPoint, button0, buttonEqual, buttonPlus,
            buttonAC, buttonC, buttonOff ;
    JTextField textField;

    public Calculator(){

        super("Calculator");
        this.setSize(320,410);
        Dimension dim  = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);

        textField = new JTextField();
        textField.setBounds(20,20,280,80);
        textField.setBackground(Color.lightGray);
        textField.setFont(new Font("SansSerif", Font.BOLD, 25));
        textField.setHorizontalAlignment(textField.RIGHT);
        textField.setEditable(false);    //for stop keyboard input
        panel.add(textField);

        button7  = new JButton("7");
        button7.setBackground(Color.decode("#666666"));
        button7.setBounds(30,120,50,40);
        button7.setFont(new Font("Serif", Font.BOLD, 20));
        button7.setForeground(Color.white);
        button7.addActionListener(this);
        button7.addMouseListener(this);
        button7.setBorderPainted(false);
        panel.add(button7);

        button8  = new JButton("8");
        button8.setBackground(Color.decode("#666666"));
        button8.setBounds(100,120,50,40);
        button8.setFont(new Font("Serif", Font.BOLD, 20));
        button8.setForeground(Color.white);
        button8.addActionListener(this);
        button8.addMouseListener(this);
        button8.setBorderPainted(false);
        panel.add(button8);

        button9  = new JButton("9");
        button9.setBackground(Color.decode("#666666"));
        button9.setBounds(170,120,50,40);
        button9.setFont(new Font("Serif", Font.BOLD, 20));
        button9.setForeground(Color.white);
        button9.addActionListener(this);
        button9.addMouseListener(this);
        button9.setBorderPainted(false);
        panel.add(button9);

        buttonDivision  = new JButton("/");
        buttonDivision.setBackground(Color.decode("#666666"));
        buttonDivision.setBounds(240,120,50,40);
        buttonDivision.setFont(new Font("Serif", Font.BOLD, 20));
        buttonDivision.setForeground(Color.white);
        buttonDivision.addActionListener(this);
        buttonDivision.addMouseListener(this);
        buttonDivision.setBorderPainted(false);
        panel.add(buttonDivision);

        button4  = new JButton("4");
        button4.setBackground(Color.decode("#666666"));
        button4.setBounds(30,170,50,40);
        button4.setFont(new Font("Serif", Font.BOLD, 20));
        button4.setForeground(Color.white);
        button4.addActionListener(this);
        button4.addMouseListener(this);
        button4.setBorderPainted(false);
        panel.add(button4);

        button5  = new JButton("5");
        button5.setBackground(Color.decode("#666666"));
        button5.setBounds(100,170,50,40);
        button5.setFont(new Font("Serif", Font.BOLD, 20));
        button5.setForeground(Color.white);
        button5.addActionListener(this);
        button5.addMouseListener(this);
        button5.setBorderPainted(false);
        panel.add(button5);

        button6  = new JButton("6");
        button6.setBackground(Color.decode("#666666"));
        button6.setBounds(170,170,50,40);
        button6.setFont(new Font("Serif", Font.BOLD, 20));
        button6.setForeground(Color.white);
        button6.addActionListener(this);
        button6.addMouseListener(this);
        button6.setBorderPainted(false);
        panel.add(button6);

        buttonMultiple  = new JButton("x");
        buttonMultiple.setBackground(Color.decode("#666666"));
        buttonMultiple.setBounds(240,170,50,40);
        buttonMultiple.setFont(new Font("Serif", Font.BOLD, 20));
        buttonMultiple.setForeground(Color.white);
        buttonMultiple.addActionListener(this);
        buttonMultiple.addMouseListener(this);
        buttonMultiple.setBorderPainted(false);
        panel.add(buttonMultiple);

        button1  = new JButton("1");
        button1.setBackground(Color.decode("#666666"));
        button1.setBounds(30,220,50,40);
        button1.setFont(new Font("Serif", Font.BOLD, 20));
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        button1.addMouseListener(this);
        button1.setBorderPainted(false);
        panel.add(button1);

        button2  = new JButton("2");
        button2.setBackground(Color.decode("#666666"));
        button2.setBounds(100,220,50,40);
        button2.setFont(new Font("Serif", Font.BOLD, 20));
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        button2.addMouseListener(this);
        button2.setBorderPainted(false);
        panel.add(button2);

        button3  = new JButton("3");
        button3.setBackground(Color.decode("#666666"));
        button3.setBounds(170,220,50,40);
        button3.setFont(new Font("Serif", Font.BOLD, 20));
        button3.setForeground(Color.white);
        button3.addActionListener(this);
        button3.addMouseListener(this);
        button3.setBorderPainted(false);
        panel.add(button3);

        buttonMinus  = new JButton("-");
        buttonMinus.setBackground(Color.decode("#666666"));
        buttonMinus.setBounds(240,220,50,40);
        buttonMinus.setFont(new Font("Serif", Font.BOLD, 25));
        buttonMinus.setForeground(Color.white);
        buttonMinus.addActionListener(this);
        buttonMinus.addMouseListener(this);
        buttonMinus.setBorderPainted(false);
        panel.add(buttonMinus);

        buttonPoint  = new JButton(".");
        buttonPoint.setBackground(Color.decode("#666666"));
        buttonPoint.setBounds(30,270,50,40);
        buttonPoint.setFont(new Font("Serif", Font.BOLD, 20));
        buttonPoint.setForeground(Color.white);
        buttonPoint.addActionListener(this);
        buttonPoint.addMouseListener(this);
        buttonPoint.setBorderPainted(false);
        panel.add(buttonPoint);

        button0  = new JButton("0");
        button0.setBackground(Color.decode("#666666"));
        button0.setBounds(100,270,50,40);
        button0.setFont(new Font("Serif", Font.BOLD, 20));
        button0.setForeground(Color.white);
        button0.addActionListener(this);
        button0.addMouseListener(this);
        button0.setBorderPainted(false);
        panel.add(button0);

        buttonEqual  = new JButton("=");
        buttonEqual.setBackground(Color.decode("#666666"));
        buttonEqual.setBounds(170,270,50,40);
        buttonEqual.setFont(new Font("Serif", Font.BOLD, 15));
        buttonEqual.setForeground(Color.white);
        buttonEqual.addActionListener(this);
        buttonEqual.addMouseListener(this);
        buttonEqual.setBorderPainted(false);
        panel.add(buttonEqual);

        buttonPlus  = new JButton("+");
        buttonPlus.setBackground(Color.decode("#666666"));
        buttonPlus.setBounds(240,270,50,40);
        buttonPlus.setFont(new Font("Serif", Font.BOLD, 19));
        buttonPlus.setForeground(Color.white);
        buttonPlus.addActionListener(this);
        buttonPlus.addMouseListener(this);
        buttonPlus.setBorderPainted(false);
        panel.add(buttonPlus);

        buttonAC  = new JButton("AC");
        buttonAC.setBackground(Color.decode("#666666"));
        buttonAC.setBounds(30,320,50,40);
        buttonAC.setFont(new Font("Serif", Font.BOLD, 10));
        buttonAC.setForeground(Color.white);
        buttonAC.addActionListener(this);
        buttonAC.addMouseListener(this);
        buttonAC.setBorderPainted(false);
        panel.add(buttonAC);

        buttonC  = new JButton("C");
        buttonC.setBackground(Color.decode("#666666"));
        buttonC.setBounds(100,320,50,40);
        buttonC.setFont(new Font("Serif", Font.BOLD, 15));
        buttonC.setForeground(Color.white);
        buttonC.addActionListener(this);
        buttonC.addMouseListener(this);
        buttonC.setBorderPainted(false);
        panel.add(buttonC);

        buttonOff  = new JButton("OFF");
        buttonOff.setBackground(Color.decode("#731602"));
        buttonOff.setBounds(170, 320, 120, 40);
        buttonOff.setFont(new Font("Serif", Font.BOLD, 15));
        buttonOff.addActionListener(this);
        buttonOff.setBorderPainted(false);
        buttonOff.setForeground(Color.white);

        panel.add(buttonOff);

        this.add(panel);
    }

    public static double num=0, ans=0;
    public static int calculation=0;
    boolean start = true;

    public void actionPerformed(ActionEvent ae) {

        if(start == false){
            textField.setText("");
            start=true;
        }

        if(ae.getSource() == button7){
            textField.setText(textField.getText()+"7");
        }
        if(ae.getSource() == button8){
            textField.setText(textField.getText()+"8");
        }
        if(ae.getSource() == button9){
            textField.setText(textField.getText()+"9");
        }
        if(ae.getSource() == button4){
            textField.setText(textField.getText()+"4");
        }
        if(ae.getSource() == button5){
            textField.setText(textField.getText()+"5");
        }
        if(ae.getSource() == button6){
            textField.setText(textField.getText()+"6");
        }
        if(ae.getSource() == button1){
            textField.setText(textField.getText()+"1");
        }
        if(ae.getSource() == button2){
            textField.setText(textField.getText()+"2");
        }
        if(ae.getSource() == button3){
            textField.setText(textField.getText()+"3");
        }
        if(ae.getSource() == button0){
            textField.setText(textField.getText()+"0");
        }
        if(ae.getSource() == buttonPoint){                                      //point

            if (textField.getText().contains(".")) {
                textField.setText(textField.getText()+"");
            }
            else{
                textField.setText(textField.getText()+".");
            }
        }
        if(ae.getSource() == buttonPlus){                                       //plus
            if (textField.getText().equals("")) {
                textField.setText("");
            }
            else{
                num=Double.parseDouble(textField.getText());
                calculation =1;
                textField.setText("");
            }
        }
        if(ae.getSource() == buttonMinus){                                      //minus
            if (textField.getText().equals("")) {
                textField.setText("");
            }
            else{
                num=Double.parseDouble(textField.getText());
                calculation =2;
                textField.setText("");
            }
        }
        if(ae.getSource() == buttonMultiple){                                   //multiple
            if (textField.getText().equals("")) {
                textField.setText("");
            }
            else{
                num=Double.parseDouble(textField.getText());
                calculation =3;
                textField.setText("");
            }
        }
        if(ae.getSource() == buttonDivision){                                   //division
            if (textField.getText().equals("")) {
                textField.setText("");
            }
            else {
                num=Double.parseDouble(textField.getText());
                calculation =4;
                textField.setText("");
            }
        }
        if(ae.getSource() == buttonEqual){                                      //equal

            if (start == true){

                if (textField.getText().equals("")) {
                   textField.setText("");
                }
                else{
                    double num2 = Double.parseDouble((textField.getText()));
                    switch(calculation){
                        case 1 :
                            ans = num+num2;
                            textField.setText(Double.toString(ans));
                            break;

                        case 2 :
                            ans = num-num2;
                            textField.setText(Double.toString(ans));
                            break;

                        case 3 :
                            ans=1;
                            ans = num*num2;
                            textField.setText(Double.toString(ans));
                            break;

                        case 4 :
                            if(num2==0){
                                textField.setText("Invalid");
                            }
                            else{
                            ans = num/num2;
                            DecimalFormat df = new DecimalFormat("#.#########");
                            textField.setText(df.format(ans));
                            }
                            break;
                    }
                }
            start = false;
            }
        }
        if(ae.getSource() == buttonAC){                                         //ac
            ans = 0;
            textField.setText("");
        }
        if(ae.getSource() == buttonC){                                          //c
            int length = textField.getText().length();
            int number = textField.getText().length()-1;
            String string;

            if(length>0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                string = back.toString();
                textField.setText(string);
            }
        }
        if (ae.getSource() == buttonOff) {
                System.exit(0);
        }
    }

    public void mouseClicked(MouseEvent me) {}


    public void mousePressed(MouseEvent me) {}


    public void mouseReleased(MouseEvent me) {}


    public void mouseEntered(MouseEvent me) {
      if(me.getSource().equals(button1)){
  			button1.setBackground(Color.decode("#271A18"));
  			button1.setForeground(Color.WHITE);
  		}
		  else if(me.getSource().equals(button2)){
  			button2.setBackground(Color.decode("#271A18"));
  			button2.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button3)){
  			button3.setBackground(Color.decode("#271A18"));
  			button3.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button4)){
  			button4.setBackground(Color.decode("#271A18"));
  			button4.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button5)){
  			button5.setBackground(Color.decode("#271A18"));
  			button5.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button6)){
  			button6.setBackground(Color.decode("#271A18"));
  			button6.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button7)){
  			button7.setBackground(Color.decode("#271A18"));
  			button7.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button8)){
  			button8.setBackground(Color.decode("#271A18"));
  			button2.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button9)){
  			button9.setBackground(Color.decode("#271A18"));
  			button9.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button0)){
  			button0.setBackground(Color.decode("#271A18"));
  			button0.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonPlus)){
  			buttonPlus.setBackground(Color.decode("#271A18"));
  			buttonPlus.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonMinus)){
  			buttonMinus.setBackground(Color.decode("#271A18"));
  			buttonMinus.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonMultiple)){
  			buttonMultiple.setBackground(Color.decode("#271A18"));
  			buttonMultiple.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonDivision)){
  			buttonDivision.setBackground(Color.decode("#271A18"));
  			button2.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonPoint)){
  			buttonPoint.setBackground(Color.decode("#271A18"));
  			buttonPoint.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonEqual)){
  			buttonEqual.setBackground(Color.decode("#271A18"));
  			buttonEqual.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonAC)){
  			buttonAC.setBackground(Color.decode("#271A18"));
  			buttonAC.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonC)){
  			buttonC.setBackground(Color.decode("#271A18"));
  			buttonC.setForeground(Color.WHITE);
  		}

		  else{}
    }


    public void mouseExited(MouseEvent me) {

      if(me.getSource().equals(button1)){
  			button1.setBackground(Color.decode("#666666"));
  			button1.setForeground(Color.WHITE);
  		}
		  else if(me.getSource().equals(button2)){
  			button2.setBackground(Color.decode("#666666"));
  			button2.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button3)){
  			button3.setBackground(Color.decode("#666666"));
  			button3.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button4)){
  			button4.setBackground(Color.decode("#666666"));
  			button4.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button5)){
  			button5.setBackground(Color.decode("#666666"));
  			button5.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button6)){
  			button6.setBackground(Color.decode("#666666"));
  			button6.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button7)){
  			button7.setBackground(Color.decode("#666666"));
  			button7.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button8)){
  			button8.setBackground(Color.decode("#666666"));
  			button2.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button9)){
  			button9.setBackground(Color.decode("#666666"));
  			button9.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(button0)){
  			button0.setBackground(Color.decode("#666666"));
  			button0.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonPlus)){
  			buttonPlus.setBackground(Color.decode("#666666"));
  			buttonPlus.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonMinus)){
  			buttonMinus.setBackground(Color.decode("#666666"));
  			buttonMinus.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonMultiple)){
  			buttonMultiple.setBackground(Color.decode("#666666"));
  			buttonMultiple.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonDivision)){
  			buttonDivision.setBackground(Color.decode("#666666"));
  			button2.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonPoint)){
  			buttonPoint.setBackground(Color.decode("#666666"));
  			buttonPoint.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonEqual)){
  			buttonEqual.setBackground(Color.decode("#666666"));
  			buttonEqual.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonAC)){
  			buttonAC.setBackground(Color.decode("#666666"));
  			buttonAC.setForeground(Color.WHITE);
  		}
      else if(me.getSource().equals(buttonC)){
  			buttonC.setBackground(Color.decode("#666666"));
  			buttonC.setForeground(Color.WHITE);
  		}

		  else{}
    }

}
