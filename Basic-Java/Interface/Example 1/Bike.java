import java.io.*;

public class Bike implements Vehicle{
  int speed;
  int gear;

  public void changeGear(int gear){
    this.gear=gear;
  }
  public void speedUp(int i){
    speed=speed+i;
  }
  public void applyBreaks(int d){
    speed=speed-d;
  }
  public void showDetails(){
    System.out.println("Bike about is: "+"\n"+"Speed : "+speed+" Gear: "+gear);
  }
}
