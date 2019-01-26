enum Mobile{
  Apple, Samsung, Mi;

  int price;
  public int getPrice(){                  //in java we can create method in enum
    return price;
  }
}

public class EnumMethod{
  public static void main(String arg[]){
    System.out.println(Mobile.Apple);

    System.out.println("phone price is: "+Mobile.Apple.getPrice());
  }
}
