import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickCounter extends JFrame implements ActionListener,Runnable{

	private JButton buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonTen,exit;
	private JLabel score;
	int flag = 0;
	int count = 0;
	boolean isTrue = true;
	boolean color = true;

	public ClickCounter(){

			super("Click Counter");
			this.setSize(415,650);
			Dimension dim =  Toolkit.getDefaultToolkit().getScreenSize();
      this.setLocation(dim.width/2-this.getSize().width/2 , dim.height/2-this.getSize().height/2);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel panel = new JPanel();
			panel.setBackground(Color.decode("#054250"));
			panel.setLayout(null);

			score = new JLabel("Score : 0");
			score.setBounds(140, 40, 200, 30);
			score.setForeground(Color.white);
			score.setFont(new Font("Arial", Font.BOLD, 25));
			panel.add(score);

			buttonOne = new JButton("1");
			buttonOne.setBounds(70,120, 100, 50);
			buttonOne.setBackground(Color.white);
			buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
			buttonOne.addActionListener(this);
			buttonOne.setFocusable(false);
			panel.add(buttonOne);

			buttonTwo = new JButton("2");
			buttonTwo.setBounds(70, 200, 100, 50);
			buttonTwo.setBackground(Color.white);
			buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
			buttonTwo.addActionListener(this);
			buttonTwo.setFocusable(false);
			panel.add(buttonTwo);

			buttonThree = new JButton("3");
			buttonThree.setBounds(70, 280, 100, 50);
			buttonThree.setBackground(Color.white);
			buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
			buttonThree.addActionListener(this);
			buttonThree.setFocusable(false);
			panel.add(buttonThree);

			buttonFour = new JButton("4");
			buttonFour.setBounds(70, 360, 100, 50);
			buttonFour.setBackground(Color.white);
			buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
			buttonFour.addActionListener(this);
			buttonFour.setFocusable(false);
			panel.add(buttonFour);

			buttonFive = new JButton("5");
			buttonFive.setBounds(70, 440, 100, 50);
			buttonFive.setBackground(Color.white);
			buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
			buttonFive.addActionListener(this);
			buttonFive.setFocusable(false);
			panel.add(buttonFive);

			buttonSix = new JButton("6");
			buttonSix.setBounds(240, 120, 100, 50);
			buttonSix.setBackground(Color.white);
			buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
			buttonSix.addActionListener(this);
			buttonSix.setFocusable(false);
			panel.add(buttonSix);

			buttonSeven = new JButton("7");
			buttonSeven.setBounds(240, 200, 100, 50);
			buttonSeven.setBackground(Color.white);
			buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
			buttonSeven.addActionListener(this);
			buttonSeven.setFocusable(false);
			panel.add(buttonSeven);

			buttonEight = new JButton("8");
			buttonEight.setBounds(240, 280, 100, 50);
			buttonEight.setBackground(Color.white);
			buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
			buttonEight.addActionListener(this);
			buttonEight.setFocusable(false);
			panel.add(buttonEight);

			buttonNine = new JButton("9");
			buttonNine.setBounds(240, 360, 100, 50);
			buttonNine.setBackground(Color.white);
			buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
			buttonNine.addActionListener(this);
			buttonNine.setFocusable(false);
			panel.add(buttonNine);

			buttonTen = new JButton("10");
			buttonTen.setBounds(240, 440, 100, 50);
			buttonTen.setBackground(Color.white);
			buttonTen.setFont(new Font("Arial", Font.BOLD, 20));
			buttonTen.addActionListener(this);
			buttonTen.setFocusable(false);
			panel.add(buttonTen);

			exit = new JButton("Exit");
			exit.setBounds(170, 530, 70, 40);
			exit.setBackground(Color.decode("#5DADE2"));
			exit.setFont(new Font("Arial", Font.BOLD, 16));
			exit.addActionListener(this);
			exit.setFocusable(false);
			exit.setBorderPainted(false);
			panel.add(exit);

		this.add(panel);
	}


	public void actionPerformed(ActionEvent ae){

		if(ae.getSource()==exit){
			JOptionPane.showMessageDialog(this,score.getText());
			System.exit(0);
		}
		else{
			if(ae.getSource()==buttonOne && flag == 1){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonTwo && flag == 2){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonThree && flag == 3){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonFour && flag == 4){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonFive && flag == 5){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonSix && flag == 6){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonSeven && flag == 7){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonEight && flag == 8){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonNine && flag == 9){
				count++;
				score.setText("Score : "+count);
			}
			else if(ae.getSource()==buttonTen && flag == 10){
				count++;
				score.setText("Score : "+count);
			}
			else{
				count--;
				score.setText("Score : "+count);
			}
	}

}

	public void run(){

			while(isTrue==true){

				String str = buttonOne.getText();
				if(buttonOne.getText()== str && color==true){								//one
					buttonOne.setBackground(Color.gray);

					flag = 1;

					try{
							Thread.sleep(1300);
					}
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonEight.getText();
					color = false;
				}

				if(str == buttonEight.getText() && color==false){						//eight
					buttonOne.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonEight.getText()== str && color == true){
					buttonEight.setBackground(Color.gray);
					flag = 8;

					try{
							Thread.sleep(1000);
					}
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonFour.getText();
					color = false;
				}

				if(str == buttonFour.getText() && color==false){					//four
					buttonEight.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonFour.getText()== str && color == true){
					buttonFour.setBackground(Color.gray);
					flag = 4;

					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonSix.getText();
					color = false;
				}

				if(str == buttonSix.getText() && color==false){					//six
					buttonFour.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonSix.getText()== str && color == true){
					buttonSix.setBackground(Color.gray);
					flag = 6;

					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonFive.getText();
					color = false;
				}

				if(str == buttonFive.getText() && color==false){				//five
					buttonSix.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonFive.getText()== str && color == true){
					buttonFive.setBackground(Color.gray);
					flag = 5;

					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonTwo.getText();
					color = false;
				}

				if(str == buttonTwo.getText() && color==false){					//two
					buttonFive.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonTwo.getText()== str && color==true){
					buttonTwo.setBackground(Color.gray);
					flag = 2;

					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonNine.getText();
					color = false;
				}

				if(str == buttonNine.getText() && color==false){					//nine
					buttonTwo.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonNine.getText()== str && color == true){
					buttonNine.setBackground(Color.gray);
					flag = 9;

					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonThree.getText();
					color = false;
				}

				if(str == buttonThree.getText() && color==false){					//three
					buttonNine.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonThree.getText()== str && color == true){
					buttonThree.setBackground(Color.gray);
					flag = 3;

					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonTen.getText();
					color = false;
				}

				if(str == buttonTen.getText() && color==false){					//ten
					buttonThree.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonTen.getText()== str && color == true){
					buttonTen.setBackground(Color.gray);
					flag = 10;

					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonSeven.getText();
					color = false;
				}

				if(str == buttonSeven.getText() && color==false){					//seven
					buttonTen.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}

				if(buttonSeven.getText()== str && color == true){
					buttonSeven.setBackground(Color.gray);
					flag = 7;
					try{
							Thread.sleep(1000);
				  }
					catch(Exception e){
							System.out.println(e.getMessage());
					}
					str = buttonOne.getText();
					color = false;
				}

				if(str == buttonOne.getText() && color==false){
					buttonSeven.setBackground(Color.white);
					flag = 0;
					color = true;
				}
				else{}
      }
    }
}
