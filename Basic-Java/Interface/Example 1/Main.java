public class Main{
  public static void main(String args[]){
    Bicycle b = new Bicycle();
    b.changeGear(2);
    b.speedUp(3);
    b.applyBreaks(1);
    b.showDetails();

    Bike b1 = new Bike();
    b1.changeGear(2);
    b1.speedUp(4);
    b1.applyBreaks(3);
    b1.showDetails();
  }
}
